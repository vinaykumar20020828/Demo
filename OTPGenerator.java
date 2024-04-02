package OTPGenerator;



	
		import javax.crypto.Mac;
		import javax.crypto.spec.SecretKeySpec;
		import java.nio.ByteBuffer;
		import java.security.InvalidKeyException;
		import java.security.NoSuchAlgorithmException;
		import java.time.Instant;
		import java.util.Base64;

		public class OTPGenerator {

		    private static final String HMAC_ALGORITHM = "HmacSHA1";
		    private static final int TOTP_DIGITS = 6;
		    private static final int TOTP_PERIOD = 30;

		    public static void main(String[] args) {
		        String secretKey = "your_secret_key"; // Replace with your secret key
		        long time = System.currentTimeMillis() / 1000 / TOTP_PERIOD;

		        try {
		            String otp = generateTOTP(secretKey, time);
		            System.out.println("Generated OTP: " + otp);
		        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
		            e.printStackTrace();
		        }
		    }

		    private static String generateTOTP(String secretKey, long time)
		            throws NoSuchAlgorithmException, InvalidKeyException {

		        byte[] keyBytes = Base64.getDecoder().decode(secretKey);
		        ByteBuffer buffer = ByteBuffer.allocate(8);
		        buffer.putLong(time);

		        Mac hmac = Mac.getInstance(HMAC_ALGORITHM);
		        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, HMAC_ALGORITHM);
		        hmac.init(keySpec);

		        byte[] hash = hmac.doFinal(buffer.array());
		        int offset = hash[hash.length - 1] & 0xF;

		        long truncatedHash = 0;
		        for (int i = 0; i < 4; ++i) {
		            truncatedHash <<= 8;
		            truncatedHash |= (hash[offset + i] & 0xFF);
		        }

		        truncatedHash &= 0x7FFFFFFF;
		        truncatedHash %= Math.pow(10, TOTP_DIGITS);

		        return String.format("%0" + TOTP_DIGITS + "d", truncatedHash);
		    }
		

	

}
