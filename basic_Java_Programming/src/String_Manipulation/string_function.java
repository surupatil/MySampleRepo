package String_Manipulation;

public class string_function {
public static void main(String[]args) {
	
	
	String s1="surekha";
	String s2="patil";
	String s3="embel";
	String s4="Surekha Patil";
	String s5="company";
	
	System.out.println(s1.toUpperCase());
	System.out.println(s2.charAt(3));
	System.out.println(s3.concat(s5));
	System.out.println(s1.compareTo(s4));
	System.out.println(s5.hashCode());
	System.out.println(s4.length());
	System.out.println(s3.replaceAll(s4, s5));
	System.out.println(s4.replace(null, s5));
	System.out.println(s2.contains("ati"));
	System.out.println(s2.concat(s4));
	System.out.println(s4.startsWith("s"));//true
	System.out.println(s4.endsWith("l"));//true
	System.out.println(s4.endsWith("r"));//false
	System.out.println(s1.equals(s4));//false
	System.out.println(s1.equalsIgnoreCase(s2));//true
	System.out.println(s1.length());//7
	System.out.println(s2.charAt(2));//A
	System.out.println(s2.substring(3));//NTUM
	System.out.println(s2.substring(0, 4));//QUAN
	System.out.println(s5.lastIndexOf('a'));//10
	System.out.println(s4.replace('e', 'E'));//academy
	
    }

}
