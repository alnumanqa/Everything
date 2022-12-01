package revisionOfAllClass;

import java.util.Arrays;

public class UseoOfStringManuplation {

	public static void main(String[] args) {
		
		String s ="Polymorphism is the ability of an object to take on many form. Encapsulation is data hiding. Abstraction is hiding the implemention deteils. Inheriatance is when a class inherit property from other class.";
		System.out.println(s);
		System.out.println(s.length()); // find the length: (variable name.length());
		System.out.println(s.toUpperCase()); // make the String upper case:(s.toUpperCase());
		System.out.println(s.toLowerCase()); // make the String lower case: (s.toLowerCase());
		System.out.println(s.charAt(202)); //find a character position: (s.charAt(202));
		System.out.println(s.charAt(20)); //find a character position: (s.charAt(20));
		//String is immutable means String value can not be changed but we can change the variable value 
		s = "Polymorphism is the ability of an object to take on many form. Encapsulation is data hiding.";
		System.out.println(s);
		System.out.println(s.indexOf('l')); // find the index position: (s.inDexOf('l'));
		System.out.println(s.indexOf('a')); // find the index position: (s.inDexOf('a'));
		System.out.println(s.indexOf("abi")); // find the index position: (s.inDexOf("abi"));
		System.out.println(s.indexOf('a', s.indexOf('a')+1)); // find the repetitive character in which index:(s.inDexOf('a', s.inDexof('a')+1));
		System.out.println(s.indexOf('a', s.indexOf('a', s.indexOf('a')+2)+1)); // find the repetitive character in which index:(s.inDexOf('a', s.inDexof('a')+1));
		System.out.println(s.indexOf('a', s.indexOf('a', s.indexOf('a',s.indexOf('a')+3)+1)));
		// last occurrence of a character by lastIndexOf()
		// The Java String class lastIndexOf() method returns the last index of the given character value or substring.
		System.out.println(s.lastIndexOf('a'));//(s.lastInDexOf()-1;
		// The java string substring() method returns a part of the string.
		// The java string substring() method returns a part of the string.
		// this substring is important
		// Returns a string that is a substring of this string. The substring begins at the specified beginIndex and 
		// extends to the character at index endIndex - 1. Please remember it, here upper limit is excluded
		// Thus the length of the substring is endIndex-beginIndex.	
		System.out.println(s.substring(10));
		System.out.println(s.substring(10,15)); //at index endIndex - 1.
		System.out.println(s.substring(5,85));
		// equals() method is used to compare Strings and return a boolean value
		// Returns 'true' if the given object represents a String equivalent to this string, 'false' otherwise
		String s1 = "My name is numan";
		String s2 = "My name is numan";
		String s3 = "my name is numan";
		String s4 = "MY NAME IS NUMAN";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		 s3 = "my name is numan  ";
		 s4 = "MY NAME IS NUMAN  ";
		 System.out.println(s3.equals(s4));
		 System.out.println(s3.equalsIgnoreCase(s4));
		// The java string trim() method eliminates leading and trailing spaces.
		// To avoid white space: trim() -- (remove any leading and trailing whitespace)
		 String s5 = "       Hellow World     ";
		 System.out.println(s5.trim());
		// can't remove white space Between Words
		 String s6 = "       Hellow    World     ";
		 System.out.println(s6.trim());
		 System.out.println(s6.trim().replace("    ", " "));//can remove by replace method
		 String s7 ="Hwllow world";
		 System.out.println(s7);
		 System.out.println(s7.replace("Hwllow", "Hellow"));
		 String dateOfTheDay = "11/28/2022";
		 System.out.println(dateOfTheDay);
		 System.out.println(dateOfTheDay.replace("/", "-"));
		// The java string replaceAll() method returns a string replacing all the
		// sequence of characters matching regex and replacement string.
		 String s8 = "I have a son";
		 System.out.println(s8.replaceAll("I have a son", "His name is Nazif"));
		// How to write Array: first data type, then [] called container, student (OBJECT) is the name of Array, [4] represent total 4 data is present
		String [] family = new String[4];
		family[0] = "Numan";
		family[1] = "Muna";
		family[2] = "Niyaz";
		family[3] = "Nazif";
		System.out.println(family[0] + family[1] + family[2] + family[3]); 
		// Tough: 2, will be used for Java coding challenge, very very important
		// how to convert a String to Character, we use toCharArray()
		String str1 = "I am Numan";
		// char is array type, [] = container, characterByCharacter = name of the Array
		char [] characterByCharacter = str1.toCharArray();
		// System.out.println(characterByCharacter); // This will not show correct outcome, because Arrays class is needed for Array manipulation
		// Arrays is a class, need to import and used to manipulate Array. you can't print Array without help of Arrays class
		 System.out.println(Arrays.toString(characterByCharacter));
		 String str2 = "I am Numan";
		 String [] wordS = str2.split(" ");
		 System.out.println(Arrays.toString(wordS));
		 
		// The Java String class contains() method searches the sequence of characters in this string. This is used as method in many places
		 String s9 ="Polymorphism is the ability of an object to take on many form.";
		 System.out.println(s9.contains("is the ability"));
		 System.out.println(s9.contains("about"));
		// The java string startsWith() method checks if this string starts with given prefix.
		 System.out.println(s9.startsWith("P"));
		 System.out.println(s9.startsWith("i"));
		 System.out.println(s9.endsWith("."));
		 System.out.println(s9.endsWith("m"));
			
		// The Java String class isEmpty() method checks if the input string is empty or not.
		 String s10 = "";
		 String s11 = "Numan";
		 System.out.println(s10.isEmpty());
		 System.out.println(s11.isEmpty());
	
		
	}

}
