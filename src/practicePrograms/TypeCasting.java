package practicePrograms;

public class TypeCasting {
	public static void main(String[] args) {
		
		/*
		 * double d=15.12; int i=(int)d;
		 * 
		 * System.out.println(i);
		 */
		/*
		 * char c='A'; int i=c; System.out.println(i);
		 */
		/*
		 * int i=65; char c=(char)i; System.out.println(c);
		 */
		 
		/*
		 * char c=' '; int i=c; System.out.println(i);
		 */
		/*
		 * byte b=127; int i=b; System.out.println(i);
		 */
		int i=500000;
		byte b=(byte)i;
		System.out.println(b);//it gives random output because the value of int is not fit in the range of the byte
		
	}

}
