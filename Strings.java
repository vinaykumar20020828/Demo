package String;

public class Strings {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "JAVA";
//		String s2 = "JAVACW";
//		int res = s1.compareTo(s2);
//
//		if (res == 0) {
//			System.out.println("String are   equal");
//		} else if (res < 0) {
//			System.out.println("s1>s2");
//		} else {
//			System.out.println("s1<s2");
//		}
//		String s = "TAP";
//		System.out.println(s);
//		s=s.concat("ACADEMY");
//		System.out.println(s);
		StringBuilder st=new StringBuilder();
		System.out.println(st.capacity());
		st.append("JAVA");
		System.out.println(st);
		System.out.println(st.length());
		st.append("JAVASCRIPT");
		System.out.println(st);
		st.append("JAMESGOSLING");
		System.out.println(st.capacity());
		System.out.println(st);
		st.trimToSize();
		System.out.println(st.capacity());
       System.out.println(st.length());
       String str ="vinaykumar";
       StringBuffer n= new StringBuffer(str );
       n.reverse();
       System.out.println(n );
             double d =Math.random();
             d=d*10000;
             int m =(int)d;
             System.out.println(m+" ");
		}

}
