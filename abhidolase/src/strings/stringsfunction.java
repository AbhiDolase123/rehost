package strings;

public class stringsfunction {
public static void main(String[] args) {
		
		String str1="Java";
		String str2="Popular";
		String str3="Java";
		String str4="Java";
		String str5="";
		String str6=" ";
		String str7="    Java   ";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str5.isEmpty());
		System.out.println(str6.isBlank());
		System.out.println(str6.isEmpty());
		System.out.println(str1.charAt(3));
		System.out.println(str1.concat(str2));
		System.out.println(str1.endsWith("a"));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str7.trim());
		
	}
}
	

