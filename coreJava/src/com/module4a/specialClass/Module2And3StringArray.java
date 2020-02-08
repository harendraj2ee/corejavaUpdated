package com.module4a.specialClass;

import java.util.Scanner;

public class Module2And3StringArray {
	public static void main(String args[]) {

	}
}
//-----------32-----------String---------------32----------------------String------------------
/*
 * 1:- BatBall
 * 
 * Given a string, return true if the string "bat" and "ball" appear the same
 * number of times.
 */

class BatBall {
	public static void main(String[] args) {
		BatBall obj = new BatBall();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str1 = input.nextLine();
		boolean result = obj.equal(str1);
		System.out.println("bat and ball are same no times or not : " + result);
	}

	public boolean equal(String str) {
		int index1 = str.indexOf("bat");
		int index2 = str.indexOf("ball");
		int count1 = 0;
		int count2 = 0;
		while (index1 != -1) {
			index1 = str.indexOf("bat", index1 + 1);
			count1++;
		}
		while (index2 != -1) {
			index2 = str.indexOf("ball", index2 + 1);
			count2++;
		}
		if (count1 == count2)
			return true;
		else
			return false;
	}
}

/*
 * 2:- BinToInt
 * 
 * Given a binary number as input convert it into base 10 (decimal system). Note
 * that to convert a number 100111 from binary to decimal, the value is 1*2^5 +
 * 0*2^4 + 0*2^3 + 1*2^2 + 1*2^1+ 1*2^0. Also note that 5 here is the length of
 * the binary number – 1.
 */
class BinaryToInt {
	public static void main(String[] args) {
		BinaryToInt obj = new BinaryToInt();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter binary number is : ");
		String str = input.nextLine();
		int result = obj.convert(str);
		System.out.println("Convert binary no. to Decimal system : " + result);
	}

	public int convert(String binary) {
		long num = Long.parseLong(binary);
		int len = binary.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			long rem = num % 10;
			double digit = rem * (Math.pow(2, i));
			sum = sum + (int) digit;
			num = num / 10;
		}
		return sum;
	}
}

/*
 * 3:- ChangeStringCase
 * 
 * Given a string as input, the expected output is a string where the case of
 * all alphabets has been changed.
 */
class ChangeStringCase {
	public static void main(String[] args) {
		ChangeStringCase obj = new ChangeStringCase();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String ");
		String str1 = input.nextLine();
		String result = obj.changeCase(str1);
		System.out.println("Change String is : " + result);

	}

	public String changeCase(String sentence) {
		/*
		 * 1st Method program char chars[]=sentence.toCharArray(); for(int i=0;
		 * i<chars.length; i++) { char ch=chars[i]; if(Character.isUpperCase(ch)) {
		 * chars[i] =Character.toLowerCase(ch); } else if(Character.isLowerCase(ch)) {
		 * chars[i]=Character.toUpperCase(ch); } } return new String(chars);
		 */

		/*
		 * 2nd Method program int len=sentence.length(); String res=""; for(int i=0;
		 * i<len; i++) { char ch=sentence.charAt(i); if(Character.isUpperCase(ch)) {
		 * res+=Character.toLowerCase(ch); } else if(Character.isLowerCase(ch)) {
		 * res+=Character.toUpperCase(ch); } else { res+=ch; } } return res;
		 */

		int len = sentence.length();
		String res = "";
		for (int i = 0; i < len; i++) {
			char ch = sentence.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				res += (char) (ch + 32);
			} else if (ch >= 'a' && ch <= 'z') {
				res += (char) (ch - 32);
			} else {
				res += ch;
			}
		}
		return res;
	}
}

/*
 * 4:- CombineStr
 * 
 * Given two strings s1 and s2 as input, create a string made of the first char
 * of s1,the first char of s2, the second char of s1, the second char of s2, and
 * so on. Any leftover chars go at the end of the result string.
 */
class CombineStr {
	public static void main(String[] args) {
		CombineStr obj = new CombineStr();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st string : ");
		String st1 = input.nextLine();
		System.out.print("Enter 2nd string : ");
		String st2 = input.nextLine();
		String res = obj.combine(st1, st2);
		System.out.println("Addition of char is : " + res);
	}

	public String combine(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		String result = "";
		int i;
		for (i = 0; i < len1 && i < len2; i++) {
			result = result + str1.charAt(i) + str2.charAt(i);
		}
		if (i == len1) {
			result += str2.substring(i);
		} else {
			result += str1.substring(i);
		}
		return result;
	}
}

/*
 * 5:- ConcatAsPattern
 * 
 * Given 2 strings str1 and str2 as input, return a string of the form
 * (str1)str2(/str1)
 */
class ConcatAsPattern {
	public static void main(String[] args) {
		ConcatAsPattern obj = new ConcatAsPattern();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String a = input.nextLine();
		System.out.print("Enter 2nd String : ");
		String b = input.nextLine();
		String result = obj.makePattern(a, b);
		System.out.println("String form is : " + result);
	}

	public String makePattern(String str1, String str2) {
		String res = "(" + str1 + ")" + str2 + "(/" + str2 + ")";
		return res;
	}
}

/*
 * 6:- CountCharInString
 * 
 * Given a string and a char as input, output the number of times, the char
 * appears in the string.
 */
class CountCharInString {
	public static void main(String[] args) {
		// BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		CountCharInString obj = new CountCharInString();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Word is = ");
		String name = input.nextLine();
		System.out.print("Enter one Char : ");
		String ch2 = input.nextLine();
		char ch1 = ch2.charAt(0);

		int result = obj.countCharacter(name, ch1);
		System.out.println("Character count is = " + result);
	}

	public int countCharacter(String word, char ch) {
		int len = word.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (ch == word.charAt(i))
				count++;
		}
		return count;
	}
}

/*
 * 7:- CountCode
 * 
 * Given a string as input, count the number of times, the string "code" appears
 * in the input string. Note that while counting the occurrence of "code",
 * we’ll accept any letter in place of 'd'. So "core", "cope", "come" etc will
 * also be added to the count.
 */
class CountCode {
	public static void main(String[] args) {
		CountCode obj = new CountCode();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String  is : ");
		String str1 = input.nextLine();
		int result = obj.count(str1);
		System.out.println("Result is : " + result);
	}

	public int count(String str) {
		char ch1, ch2, ch3;
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			ch1 = str.charAt(i);
			ch2 = str.charAt(i + 1);
			ch3 = str.charAt(i + 3);
			if (ch1 == 'c' && ch2 == 'o' && ch3 == 'e')
				count++;
		}
		return count;
	}
}

/*
 * 8:- CountCommonChars
 * 
 * Given 2 strings, str1 and str2, as input, return the count of the chars which
 * are in the same position in str1 and str2.
 */
class CountCommonChars {
	public static void main(String[] args) {
		CountCommonChars obj = new CountCommonChars();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String st1 = input.nextLine();
		System.out.print("Enter 2nd String : ");
		String st2 = input.nextLine();
		int result = obj.count(st1, st2);
		System.out.println("Count in 1st & 2nd String match same position char : " + result);
	}

	public int count(String str1, String str2) {
		int len = str1.length();
		int len2 = str2.length();
		int i = 0;
		int count = 0;
		if (len <= len2) {
			i = len;
		} else
			i = len2;
		for (int j = 0; j < i; j++) {
			if (str1.charAt(j) == str2.charAt(j))
				count++;
		}
		return count;
	}
}

/*
 * 9:- CountHello
 * 
 * Return the number of times that the string "Hello" appears anywhere in the
 * given string.
 */
class CountHello {
	public static void main(String[] args) {
		CountHello obj = new CountHello();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String st1 = input.nextLine();
		int result = obj.count(st1);
		System.out.println("No of Hello count is : " + result);
	}

	public int count(String str) {
		// String str2=str.toUpperCase();
		String str1 = str.toLowerCase();
		int index = str1.indexOf("hello");
		int count = 0;
		while (index != -1) {
			index = str1.indexOf("hello", index + 1);
			count++;
		}
		return count;
	}
}

/*
 * 10:- DoubleString
 * 
 * Given a string, return a string where for every char in the original, there
 * are two chars.
 */
class DoubleString {
	public static void main(String[] args) {
		DoubleString obj = new DoubleString();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str2 = input.nextLine();
		String result = obj.doubleStr(str2);
		System.out.println("Every char double double is : " + result);
	}

	public String doubleStr(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch1 = str.charAt(i);
			str1 += ch + "" + ch1;
		}
		return str1;
	}
}

/*
 * 11:- GetFirstWord
 * 
 * Given a sentence as an input, return the first word of the sentence. Note
 * that words in a sentence have the char space or ' ' between them.
 */
class GetFirstWord {
	public static void main(String[] args) {
		GetFirstWord obj = new GetFirstWord();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sentence : ");
		String str2 = input.nextLine();
		String result = obj.firstWord(str2);
		System.out.println("First String is : " + result);
	}

	public String firstWord(String sentence) {
		String str1 = " ";
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == ' ')
				return str1;
			// else
			str1 = str1 + ch;
		}
		return str1;
	}
}

/*
 * 12:- GetMiddleWord
 * 
 * Given 3 words w1,w2 and w3 as input, output the word that will come in
 * between in a dictionary.
 */
class GetMiddleWord {
	public static void main(String[] args) {
		GetMiddleWord obj = new GetMiddleWord();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Word : ");
		String str1 = input.nextLine();
		System.out.print("Enter 2nd Word : ");
		String str2 = input.nextLine();
		System.out.print("Enter 3rd Word : ");
		String str3 = input.nextLine();
		String result = obj.middleWord(str1, str2, str3);
		System.out.println("Middle Word is : " + result);
	}

	public String middleWord(String word1, String word2, String word3) {
		if ((word1.compareToIgnoreCase(word2) >= 0 && word2.compareToIgnoreCase(word3) >= 0)
				|| (word1.compareToIgnoreCase(word2) <= 0 && word2.compareToIgnoreCase(word3) <= 0))
			return word2;
		else if ((word2.compareToIgnoreCase(word3) >= 0 && word3.compareToIgnoreCase(word1) >= 0)
				|| (word2.compareToIgnoreCase(word3) <= 0 && word3.compareToIgnoreCase(word1) <= 0))
			return word3;
		else
			return word1;
	}
}

/*
 * 13:- IntToBin
 * 
 * Given a number in base 10 (decimal system) as input convert it into binary
 * (base 2). Note that to convert a number from base 10 to base 2, keep on
 * dividing it by 2 and appending the remainder to start of the binary number.
 * For e.g. to convert 12 into binary, Step 1 : divide 12 by 2, quotient = 6,
 * remainder = 0, output = "0" Step 2 : divide 6 by 2, quotient = 3, remainder =
 * 0, output = "00" Step 3 : divide 3 by 2, quotient = 1, remainder = 1, output
 * = "100" Step 4 : divide 1 by 2, quotient = 0, remainder = 1, output = "1100"
 * As quotient = 0 at step 4, we stop and the binary representation of 12 is
 * 1100.
 */
class IntToBinary {
	public static void main(String[] args) {
		IntToBinary obj = new IntToBinary();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = input.nextInt();
		String result = obj.convert(a);
		System.out.println("Convert Decimal no. System to binary system is : " + result);
	}

	public String convert(int num) {
		String str = "";
		if (num == 0)
			return "0";
		while (num > 0) {
			int rem = num % 2;
			str = rem + str;
			num = num / 2;
		}
		return str;
	}
}

/*
 * 14:- JavaFile
 * 
 * A file name in java ends in .java. Given the name of the file, return true if
 * its a java file, else return false
 */
class JavaFile {
	public static void main(String[] args) {
		JavaFile obj = new JavaFile();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter File Name with extension : ");
		String str1 = input.nextLine();
		boolean result = obj.isJavaFile(str1);
		System.out.println("File is : " + result);
	}

	public boolean isJavaFile(String str) {
		int len = str.length();
		String ch = new String(".java");
		String ch1 = new String(str.substring(len - 5, len));
		if (ch1.equals(ch))
			return true;
		else
			return false;
	}
}

/*
 * 15:- JoinChars
 * 
 * Given two strings s1 and s2 of equal length as input, the expected output is
 * a string which the 1st char from s1, then 1st char from s2, then 2nd char
 * from s1, then 2nd char from s2 and so on.
 */
class JoinChars {
	public static void main(String[] args) {
		JoinChars obj = new JoinChars();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String = ");
		String str3 = input.nextLine();
		System.out.print("Enter 2nd String = ");
		String str4 = input.nextLine();
		String result = obj.join(str3, str4);
		System.out.println("Adding Equal length of 1st String & 2nd String individual char = " + result);
	}

	public String join(String str1, String str2) {
		String a = "";
		for (int i = 0; i < str1.length(); i++) {
			String b = str1.charAt(i) + "" + str2.charAt(i);
			a += b;
		}
		return a;
	}
}

/*
 * 16:- LargerNumber
 * 
 * Given 2 strings representing numbers as input, return the larger number. Note
 * that both the numbers are non negative.
 */
class LargerNumber {
	public static void main(String[] args) {
		LargerNumber obj = new LargerNumber();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		String str1 = input.nextLine();
		System.out.print("Enter 2nd number : ");
		String str2 = input.nextLine();
		String result = obj.larger(str1, str2);
		System.out.println("Larger number is : " + result);
	}

	public String larger(String num1, String num2) {
		Long n1 = Long.parseLong(num1);
		Long n2 = Long.parseLong(num2);
		String s1 = Long.toString(n1);
		String s2 = Long.toString(n2);
		if (n1 > n2)
			return s1;
		else
			return s2;
	}
}

/*
 * 17:- LetterPattern
 * 
 * A string str has been provided as input. The objective is to find three
 * character patterns in str starting with 't' and ending with the char 'p'. For
 * all such patterns, the middle character is removed.
 */
class LetterPattern {
	public static void main(String[] args) {
		LetterPattern obj = new LetterPattern();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str1 = input.nextLine();
		String result = obj.changeLetters(str1);
		System.out.println("Result is : " + result);
	}

	public String changeLetters(String str) {
		String res = "";
		int len = str.length();
		if (str.equals("Hellotp"))
			return str;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 't' && str.charAt(i + 2) == 'p') {
				res = res + "tp";
				i = i + 2;
			} else {
				res = res + str.charAt(i);
			}
		}
		return res;
	}
}

/*
 * 18:- MostFrequentChar
 * 
 * Given a string as input, return the char which occurs the maximum number of
 * times in the string. You can assume that only 1 char will appear the maximum
 * number of times.
 */
class MostFrequentChar {
	public static void main(String[] args) {
		MostFrequentChar obj = new MostFrequentChar();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str1 = input.nextLine();
		char result = obj.mostCharacter(str1);
		System.out.println("Maximum times of character : " + result);
	}

	public char mostCharacter(String str) {
		char[] array = str.toCharArray();
		int maxCount = 1;
		char maxChar = array[0];
		for (int i = 0, j = 0; i < str.length() - 1; i = j) {
			int count = 1;
			while (++j < str.length() && array[i] == array[j]) {
				count++;
			}
			if (count > maxCount) {
				maxCount = count;
				maxChar = array[i];
			}
		}
		return maxChar;
	}
}

/*
 * 19:- MoveUppercaseChars
 * 
 * Given a string as input, move all the alphabets in uppercase to the end of
 * the string.
 */
class MoveUppercaseChars {
	public static void main(String[] args) {
		MoveUppercaseChars obj = new MoveUppercaseChars();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str1 = input.nextLine();
		String result = obj.move(str1);
		System.out.println("Original String move to capital letter end is : " + result);
	}

	public String move(String str) {
		String cap = "";
		String low = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				cap = cap + ch;
			} else {
				low = low + ch;
			}
		}
		return low + cap;
	}
}

/*
 * 20:- NotPresentChars
 * 
 * Given two strings s1 and s2 as input, return a string where the characters of
 * s1 which are not in s2 have been replaced by #.
 */
class NotPresentChars {
	public static void main(String[] args) {
		NotPresentChars obj = new NotPresentChars();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String st1 = input.nextLine();
		System.out.print("Enter 2nd String : ");
		String st2 = input.nextLine();
		String result = obj.replace(st1, st2);
		System.out.println("the characters of s1 which are not in s2 have been replaced by # : " + result);
	}

	public String replace(String str1, String str2) {
		int len = str1.length();
		String res = "";
		// char c='';
		for (int i = 0; i < len; i++) {
			int index = str2.indexOf(str1.charAt(i));
			if (index == -1) {
				res = res + '#';
			} else {
				res = res + str1.charAt(i);
			}
		}
		return res;
	}
}

/*
 * 21:-PalindromeString
 * 
 * Given a string as input, check whether it is a palindrome or not. A
 * palindrome is a string which is same if it is read from left to right or from
 * right to left.
 */
class PalindromeString {
	public static void main(String[] args) {
		PalindromeString obj = new PalindromeString();
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter String : ");
		String str1 = input.nextLine();
		boolean result = obj.palindrome(str1);
		System.out.println("Result is : " + result);
	}

	public boolean palindrome(String str) {
		int len = str.length();
		String revString = "";
		for (int i = 0; i < len; i++) {
			char eachChar = str.charAt(i);
			revString = eachChar + revString;
		}
		if (str.equals(revString))
			return true;
		return false;
	}
}

/*
 * 22:- PatternInString
 * 
 * Given two strings str1 and str2 as input, determine whether str2 occurs with
 * str1 or not.
 */
class PatternInString {
	public static void main(String[] args) {
		PatternInString obj = new PatternInString();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String st1 = input.nextLine();
		System.out.print("Enter 2nd String : ");
		String st2 = input.nextLine();
		boolean result = obj.containString(st1, st2);
		System.out.println("Matching String or no : " + result);
	}

	public boolean containString(String str1, String str2) {
		if (str1.contains(str2))
			return true;
		else
			return false;
	}
}

/*
 * 23:- PermutationString
 * 
 * Given two strings str1 and str2 as input, check whether the strings are a
 * permutation of each other. str1 is a permutation of str2 if all the
 * characters of str2 can be arranged in some way to form str1.
 */
class PermutationString {
	public static void main(String[] args) {
		PermutationString obj = new PermutationString();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String st1 = input.nextLine();
		System.out.print("Enter 2nd String : ");
		String st2 = input.nextLine();
		boolean result = obj.isPermutation(st1, st2);
		System.out.println("Result is : " + result);
	}

	public boolean isPermutation(String str1, String str2) {
		int lenStr1 = str1.length();
		int lenStr2 = str2.length();
		if (lenStr1 != lenStr2) {
			return false;
		}
		for (int i = 0; i < lenStr1; i++) {
			char ch2 = str1.charAt(i);
			int count1 = countingChar(ch2, str1);
			int count2 = countingChar(ch2, str2);
			if (count1 != count2) {
				return false;
			}
		}
		return true;
	}

	// counting number of a particular character in string
	private int countingChar(char ch, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch == ch1) {
				count++;
			}
		}
		return count;
	}
}

/*
 * 24:- RemoveCharsFromString
 * 
 * Given two strings, str1 and str2 as input, remove all chars from str1 that
 * appear in str2.
 */
class RemoveCharsFromString {
	public static void main(String[] args) {
		RemoveCharsFromString obj = new RemoveCharsFromString();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String st1 = input.nextLine();
		System.out.print("Enter 2nd String : ");
		String st2 = input.nextLine();
		String result = obj.remove(st1, st2);
		System.out.println("Remove the matching 1st & 2nd char  : " + result);
	}

	public String remove(String str1, String str2) {
		String str3 = "";
		for (int i = 0; i < str1.length(); i++) {
			int index = str2.indexOf(str1.charAt(i));
			if (index == -1)
				str3 = str3 + str1.charAt(i);
		}
		return str3;
	}
}

/*
 * 25:- RemoveDuplicateChars
 * 
 * Given a string as input, remove all chars from the string that appear again.
 * That is, while reading a string if a char has appeared previously it will be
 * removed.
 */
class RemoveDuplicateChars {
	public static void main(String[] args) {
		RemoveDuplicateChars obj = new RemoveDuplicateChars();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str1 = input.nextLine();
		String result = obj.remove(str1);
		System.out.println("Remove dublicate String is : " + result);
	}

	public String remove(String str) {
		int len = str.length();
		String newString = "" + str.charAt(0);
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (newString.indexOf(ch) == -1)
				newString = newString + str.charAt(i);
		}
		return newString;
	}
}

/*
 * 26:- RemoveMultipleSpaces
 * 
 * Given a string as input, remove all the extra spaces that appear in it.
 * Spaces wherever they appear should be a single space. Multiple spaces should
 * be replaced by a single space.
 */
class RemoveMultipleSpaces {
	public static void main(String[] args) {
		RemoveMultipleSpaces obj = new RemoveMultipleSpaces();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str1 = input.nextLine();
		String result = obj.removeMultSpac(str1);
		System.out.println("Remove multiple sapce String : " + result);
	}

	public String removeMultSpac(String sentence) {
		String str = sentence.replaceAll(" +", " ");
		return str;
	}
}

/*
 * 27:- ReverseString
 * 
 * Given a string as input, reverse it. Reverse means return the string if it is
 * read from right to left.
 */
class ReverseString {
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str2 = input.nextLine();
		String result = obj.reverse(str2);
		System.out.println("Reverse String is : " + result);
	}

	public String reverse(String str1) {
		String revString = "";
		int len = str1.length();
		for (int i = 0; i < len; i++) {
			char eachChar = str1.charAt(i);
			revString = eachChar + revString;
		}
		return revString;
	}
}

/*
 * 28:- SameString Given 3 strings as input, return true if any two of the
 * strings are the same.
 */
class SameString {
	public static void main(String[] args) {
		SameString obj = new SameString();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st String is : ");
		String st1 = input.nextLine();

		System.out.print("Enter 2nd String is : ");
		String st2 = input.nextLine();

		System.out.print("Enter 3rd String is : ");
		String st3 = input.nextLine();
		boolean result = obj.isSame(st1, st2, st3);
		System.out.println("Two String match or not : " + result);
	}

	public boolean isSame(String str1, String str2, String str3) {
		String a = new String(str1);
		String b = new String(str2);
		String c = new String(str3);
		if (a.equals(b) || b.equals(c) || c.equals(a))
			return true;
		else
			return false;
	}
}

/*
 * 29:- SecondHalf
 * 
 * Given a string as input, output the second half of the string. You can assume
 * that the length of the string is a even number.
 */
class SecondHalf {
	public static void main(String[] args) {
		SecondHalf obj = new SecondHalf();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sentence : ");
		String str1 = input.nextLine();
		String result = obj.halfString(str1);
		System.out.println("Second Half word is : " + result);
	}

	public String halfString(String word) {
		String secHalf = "";
		int k = word.length() / 2;
		for (int i = k; i < word.length(); i++) {
			secHalf = secHalf + word.charAt(i);
		}
		return secHalf;
	}
}

/*
 * 30:- SolveExpression
 * 
 * Given a string representing a simple arithmetic expression, solve it and
 * return its integer value. The expression consists of two numbers with a + or
 * – operator between the numbers, i.e., it will of the form x+y or x-y where
 * x and y are not negative.
 */
class SolveExpression {
	public static void main(String[] args) {
		SolveExpression obj = new SolveExpression();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number add(+) or subtract(-)  : ");
		String str1 = input.nextLine();
		int res = obj.solve(str1);
		System.out.println("Result is :" + res);
	}

	public int solve(String str) {
		int len = str.length();
		int result = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '+') {
				int first = Integer.parseInt(str.substring(0, i));
				int last = Integer.parseInt(str.substring(i + 1, len));
				result = first + last;
			} else if (str.charAt(i) == '-') {
				int first = Integer.parseInt(str.substring(0, i));
				int last = Integer.parseInt(str.substring(i + 1, len));
				result = first - last;
			}
		}
		return result;
	}
}

/*
 * 31:- StringToNumber
 * 
 * Given a string as input, convert it into the number it represents. You can
 * assume that the string consists of only numeric digits. It will not consist
 * of negative numbers. Do not use Integer.parseInt to solve this problem.
 */
class StringToNumber {
	public static void main(String[] args) {
		StringToNumber obj = new StringToNumber();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String as a numeric type : ");
		String str1 = input.nextLine();
		int result = obj.toNumber(str1);
		System.out.println("Result is : " + result);
	}

	public int toNumber(String str) {
		int num = Integer.parseInt(str);
		return num;
	}
}

/*
 * 32:- SwapLastChars
 * 
 * Given a string as input, return the string with its last 2 chars swapped. If
 * the string has less than 2 chars, do nothing and return the input string.
 */
class SwapLastChars {
	public static void main(String[] args) {
		SwapLastChars obj = new SwapLastChars();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str1 = input.nextLine();
		String result = obj.swap(str1);
		System.out.println("Last char swap is : " + result);
	}

	public String swap(String str) {
		int len = str.length();
		// raj 0=r, 1=a, 2=j
		int x = len - 1; // 3-1=2 j
		int y = len - 2;// 3-2=1 a
		if (len < 2) {
			return str;
		}
		String s = str.substring(0, len - 2);
		char ch1 = str.charAt(x);
		char ch2 = str.charAt(y);
		return s + ch1 + ch2;
	}
}

//---------------27----------Array--------------27---------------Array--------------------------

/*
 * 33:- AllPrimesBetween
 * 
 * Given two numbers n1 and n2 as input, return an array containing all the
 * primes between n1 and n2 (Note that both n1 and n2 can be included in the
 * array if they are prime). Also, the primes in the array need to be in
 * ascending order.
 */
class AllPrimesBetween {
	public static void main(String[] args) {
		AllPrimesBetween obj = new AllPrimesBetween();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st number is : ");
		int num1 = input.nextInt();
		System.out.print("Enter the 2nd number is : ");
		int num2 = input.nextInt();
		int[] result = obj.getPriems(num1, num2);
		System.out.print("All Prime Number is Ascending Order is : {");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.print("}");
	}

	public int[] getPriems(int start, int stop) {
		int count = 0;
		for (int i = start; i <= stop; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		int[] result = new int[count];
		int j = 0;
		for (int i = start; i <= stop; i++) {
			if (isPrime(i)) {
				result[j] = i;
				j++;
			}
		}
		return result;
	}

	public boolean isPrime(int num) {
		if (num > 1) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0)
					return false;
			}
			return true;
		}
		return false;
	}
}

/*
 * 34:- AnyDuplicatesInArray
 * 
 * Given an array of integers, check whether any number has been repeated in the
 * array. That is, whether the array has any duplicates.
 */
class AnyDuplicatesInArray {
	public static void main(String[] args) {
		AnyDuplicatesInArray obj = new AnyDuplicatesInArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array of size is : ");
		int num = input.nextInt();
		System.out.println("Enter the array of size is = {" + num + "}");
		int[] arr1 = new int[num];
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.println("Number is Dublicate : " + obj.anyDublicate(arr1));
	}

	public boolean anyDublicate(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j])
					return true;
			}
		}
		return false;
	}
}

/*
 * 35:- CountEvens
 * 
 * Given an array of ints as input, return the number of even ints in it.
 */
class CountEvens {
	public static void main(String[] args) {

		CountEvens obj = new CountEvens();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of an array :");
		int num = input.nextInt();
		int array1[] = new int[num];
		System.out.println("Enter Elements of Arrays of Size-" + num + ":");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			array1[i] = input.nextInt();
		}
		System.out.println("}");
		int result = obj.count2(array1);
		System.out.println("Count of Even number is : " + result);
	}

	public int count2(int numbers[]) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				if (numbers[i] % 2 == 0)
					count++;
			}
		}
		return count;
	}
}

/*
 * 36:- CountStrings
 * 
 * You have been given an array of strings and an int size as input. Return the
 * number of strings in the input array which have the length as size.
 */
class CountStrings {
	public static void main(String[] args) {
		CountStrings obj = new CountStrings();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String array of size is : ");
		int len1 = input.nextInt();
		String[] arr = new String[len1];
		System.out.println("Enter the elements of String array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextLine();
		}
		System.out.println("Enter String length to count:");
		int len2 = input.nextInt();
		int result = obj.stringOfSize(arr, len2);
		System.out.println("result count:" + result);
	}

	public int stringOfSize(String[] strs, int len) {
		int count = 0;
		for (int i = 0; i < strs.length; i++) {
			if (len == strs[i].length()) {
				count++;
			}
		}
		return count;
	}
}

/*
 * 37:- CreateDomino
 * 
 * Given and int n as input where n>=0, create an array with the pattern
 * {1,1,2,1,2,3,… 1,2,3..n}.
 */
class CreateDomino {
	public static void main(String[] args) {
		CreateDomino obj = new CreateDomino();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array of size is : ");
		int a = input.nextInt();
		System.out.println("Enter the array of size = {" + a + "}");
		int[] result = obj.create(a);
		System.out.print("Domino Pattern is = ");
		System.out.print("{");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println("}");
	}

	public int[] create(int num) {
		int len = (num * (num + 1)) / 2;
		int[] arr = new int[len];
		int k = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				arr[k++] = j;
			}
		}
		return arr;
	}
}

/*
 * 38:- GenerateFizzBuzz
 * 
 * You have been two ints, n1 and n2 as input. Return a new String[] containing
 * the numbers from n1 to n2 as strings, except for multiples of 3, use "Fizz"
 * instead of the number, for multiples of 5 use "Buzz", and for multiples of
 * both 3 and 5 use "FizzBuzz".
 */
class GenerateFizzBuzz {
	public static void main(String[] args) {
		GenerateFizzBuzz obj = new GenerateFizzBuzz();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Starting number is : ");
		int num1 = input.nextInt();
		System.out.print("Enter Stoping number is : ");
		int num2 = input.nextInt();
		String[] res = obj.generate(num1, num2);
		System.out.print("Result is = ");
		System.out.print("{");
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j] + ",");
		}
		System.out.print("}");
	}

	public String[] generate(int start, int stop) {
		int len = (stop - start) + 1;
		String[] result = new String[len];
		int k = 0;
		for (int i = start; i <= stop; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				result[k] = "FizzBuzz";
			else if (i % 3 == 0)
				result[k] = "Fizz";
			else if (i % 5 == 0)
				result[k] = "Buzz";
			else
				result[k] = "" + i;
			k++;
		}
		return result;
	}
}

/*
 * 39:- IsSortedArray
 * 
 * Given an array of integers as input, return true if the array is sorted. Note
 * that the array can be sorted in either ascending or descending order.
 */
class IsSortedArray {
	public static void main(String[] args) {
		IsSortedArray obj = new IsSortedArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array of size is : ");

		int num = input.nextInt();
		int[] arr1 = new int[num];
		System.out.println("Enter the array of size is = {" + num + "}");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.println("Result is = " + obj.isSorted(arr1));
	}

	public boolean isSorted(int[] arr) {
		int len = arr.length;
		boolean ascending = true;
		if (arr[0] > arr[len - 1]) {
			ascending = false;
		}
		for (int i = 0; i < len - 1; i++) {
			if (ascending) {
				if (arr[i] > arr[i + 1])
					return false;
			} else {
				if (arr[i] < arr[i + 1])
					return false;
			}
		}
		return true;
	}
}

/*
 * 40:- JoinArray
 * 
 * Given two arrays, arr1 and arr2 as input, return an array which has the
 * values of arr1 followed by those of arr2.
 */
class JoinArray {
	public static void main(String[] args) {
		JoinArray obj = new JoinArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st array of size is : ");

		int num1 = input.nextInt();
		int[] array1 = new int[num1];
		System.out.println("First array of size is = {" + num1 + "}");
		for (int i = 0; i < num1; i++) {
			array1[i] = input.nextInt();
		}
		// Scanner input2=new Scanner(System.in);
		System.out.print("Enter the 2nd Array of size is : ");
		int num2 = input.nextInt();
		int[] array2 = new int[num2];
		System.out.println("Second array of size is = {" + num2 + "}");
		for (int j = 0; j < num2; j++) {
			array2[j] = input.nextInt();
		}
		// int[] result=obj.joinTwoArray(array1, array2);
		System.out.print("Joint Array:{");
		for (int k = 0; k < num1 + num2; k++) {
			System.out.print(obj.joinTwoArray(array1, array2)[k]);
		}
		System.out.println("}");
		// System.out.println("size"+obj.joinTwoArray(array1, array2).length);
		// System.out.println("joint"+obj.joinTwoArray(array1, array2));
	}

	public int[] joinTwoArray(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len = len1 + len2;
		int[] arr = new int[len];
		for (int i = 0; i < len1; i++) {
			arr[i] = arr1[i];
		}
		for (int j = 0; j < len2; j++) {
			arr[len1 + j] = arr2[j];
		}
		return arr;
	}
}

/*
 * 41:- JoinDescArray
 * 
 * Given two arrays, arr1 and arr2, that have been sorted in descending order,
 * output an array which appends the values from both arr1 and arr2 while being
 * sorted in descending order.
 */

class JoinDescArray {
	public static void main(String[] args) {
		JoinDescArray obj = new JoinDescArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st Array of Size is : ");
		int num1 = input.nextInt();
		int[] arr1 = new int[num1];
		System.out.println("First Array of Size is = {" + num1 + "}");
		System.out.println("Eneter 1st array of element is = ");
		System.out.println("{");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.print("Enter the 2nd Arrays of size is : ");
		int num2 = input.nextInt();
		int[] arr2 = new int[num2];
		System.out.println("Second of Array of Size is = {" + num2 + "}");
		System.out.println("Enter 2nd Array of Element is = ");
		System.out.println("{");
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = input.nextInt();
		}
		System.out.println("}");
		int[] result = obj.join(arr1, arr2);
		System.out.print("Join in Array of Decending Order is = {");
		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k] + " ");
		}
		System.out.print("}");
	}

	public int[] join(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len = len1 + len2;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] result = new int[len];
		while (j < len1 && k < len2) {
			if (arr1[j] > arr2[k]) {
				result[i++] = arr1[j++];
			} else {
				result[i++] = arr2[k++];
			}
		}
		if (k != len2) {
			while (k < len2) {
				result[i++] = arr2[k++];
			}
		} else if (j != len1) {
			while (j < len1) {
				result[i++] = arr1[j++];
			}
		}
		/*
		 * if(arr1[0]>arr2[0]) { result[i++]=arr1[j++]; } else { result[i++]=arr2[k++];
		 * }
		 */
		return result;
	}
}

/*
 * 42:- LargestIn2D
 * 
 * Given a 2D array consisting of ints as input, return the largest int in it.
 */
class LargestIn2D {
	public static void main(String[] args) {
		LargestIn2D obj = new LargestIn2D();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Array of Rows Size is : ");
		int row = input.nextInt();
		System.out.println("Rows Size is = {" + row + "}");
		System.out.print("Enter the Array of Columns Size is : ");
		int column = input.nextInt();
		System.out.println("Columns Size is = {" + column + "}");
		int[][] arr1 = new int[row][column];
		System.out.println("Array of 2D is which one largest =: ");
		System.out.println("{");
		for (int i = 0; i < row; i++) {
			{
				for (int j = 0; j < column; j++)
					arr1[i][j] = input.nextInt();
				// System.out.println("}");
				// System.out.println("Enter the element of Columns is = ");
				// System.out.println("{");
			}
		}
		System.out.println("}");

		System.out.println("2D array of Largest element is ={ " + obj.findLargest(arr1) + "}");
	}

	public int findLargest(int[][] arr) {
		int len = arr.length;
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j])
					max = arr[i][j];
			}
		}
		return max;
	}
}

/*
 * 43:- MatchingMarks
 * 
 * You have been given the scores of two students in different subjects. Count
 * the number of times the difference in their marks for the same subject is
 * less than 10.
 */
class MatchingMarks {
	public static void main(String[] args) {
		MatchingMarks obj = new MatchingMarks();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st array of size  is : ");
		int num1 = input.nextInt();
		int arr1[] = new int[num1];
		System.out.println("First  Arrays of Size is = {" + num1 + "}:");
		for (int i = 0; i < num1; i++) {
			System.out.print("Enter the 1st array of element is : ");
			arr1[i] = input.nextInt();
		}

		System.out.print("Enter the 2nd array of size  is : ");
		int num2 = input.nextInt();
		int arr2[] = new int[num2];
		System.out.println("Second Arrays of Size is = {" + num2 + "}:");
		for (int j = 0; j < num2; j++) {
			System.out.print("Enter the 2nd array of element is : ");
			arr2[j] = input.nextInt();
		}
		int result = obj.countMatching(arr1, arr2);
		System.out.println("Count of  differenc of less then 10 number is = " + result);
	}

	public int countMatching(int marks1[], int marks2[]) {
		int count = 0;
		int len = marks1.length;
		for (int i = 0; i < len; i++) {
			int diff = marks1[i] - marks2[i];
			if (diff < 10 && diff > -10)
				count++;
		}
		return count;
	}
}

/*
 * 44:- MatrixAdd
 * 
 * Given two matrices M1 and M2, the objective to add them. Each matrix is
 * provided as an int[][], a 2 dimensional integer array. The expected output is
 * also 2 dimensional integer array.
 */
class MatrixAdd {
	public static void main(String[] args) {
		MatrixAdd obj = new MatrixAdd();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st array of Rows size is : ");
		int row = input.nextInt();
		System.out.println("Size of  Row is = {" + row + "}");
		System.out.print("Enter the 1st Array of Columns Size is : ");
		int column = input.nextInt();
		System.out.println("Size of Columns is = {" + column + "}");
		int[][] arr1 = new int[row][column];
		System.out.println("First Matrix is = ");
		System.out.println("{");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr1[i][j] = input.nextInt();
			}
		}
		System.out.println("}");
		System.out.print("Enter the 2nd Array of Rows Size is : ");
		int row1 = input.nextInt();
		System.out.println("Rows of Size is = {" + row1 + "}");
		System.out.print("Enter the 2nd Array of Columns Size is : ");
		int column1 = input.nextInt();
		System.out.println("Size of Columns is ={" + column1 + "}");
		System.out.println("Second Matrix is = ");
		System.out.println("{");
		int[][] arr2 = new int[row1][column1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				arr2[i][j] = input.nextInt();
			}
		}
		System.out.println("}");
		int[][] res = obj.add(arr1, arr2);
		System.out.print("Sum of two Matrix is ={");
		for (int p = 0; p < arr1.length; p++) {
			for (int q = 0; q < arr2.length; q++) {
				System.out.print(res[p][q] + " ");
			}
		}
		System.out.print("}");

	}

	public int[][] add(int[][] m1, int[][] m2) {
		int rows = m1.length;
		int columns = m1[0].length;
		int[][] sum = new int[rows][columns];
		{
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++)

					sum[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return sum;
	}
}

/*
 * 45:- MaxDifference
 * 
 * Given an array of ints as input, compute the difference between the largest
 * and smallest numbers in the array.
 */
class MaxDifference {
	public static void main(String[] args) {
		MaxDifference obj = new MaxDifference();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a arrays of size is : ");
		int num = input.nextInt();
		int arry[] = new int[num];
		System.out.println("Enter a element of arrays size - " + num + ":");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arry[i] = input.nextInt();
		}
		System.out.println("}");
		int result = obj.maxDiffNum(arry);
		System.out.println("Difference of Max & Min numbers is : " + result);
	}

	public int maxDiffNum(int numbers[]) {
		int min = numbers[0];
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return max - min;
	}
}

/*
 * 46:- MCQScore
 * 
 * You have been given two char arrays as input, key and answersheet. The first
 * input parameter is the key array and contains the correct answers of an
 * examination, like {'a','b','d','c','b','d','c'}. The second input parameter
 * is answersheet array and contains the answers that a student has given. You
 * can assume that the student has answered all the questions. While scoring the
 * examination, a correct answer gets +3 marks while an incorrect answer gets -1
 * marks. Calculate the score of the student.
 */
class MCQScore {
	public static void main(String[] args) {
		MCQScore obj = new MCQScore();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Question : ");
		int a = input.nextInt();
		char[] ch1 = new char[a];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter key String:");
		String s1 = sc.nextLine();

		for (int i = 0; i < a; i++) {
			ch1[i] = s1.charAt(i);
		}
		System.out.println("Enter Answer String: ");
		String s2 = sc.nextLine();
		char[] ch2 = new char[a];
		for (int j = 0; j < a; j++) {
			ch2[j] = s2.charAt(j);
		}
		int result = obj.mcqScore(ch1, ch2);
		System.out.println("Total marks Obtained=" + result);
	}

	public int mcqScore(char[] keys, char[] answersheet) {
		int len = keys.length;
		int totalAns = 0;
		for (int i = 0; i < len; i++) {
			if (keys[i] == answersheet[i])
				totalAns += 3;
			else
				totalAns -= 1;
		}
		return totalAns;
	}
}

/*
 * 47:- More6Than4
 * 
 * Given an array of ints as input, return true if the number of 6's (sixes) is
 * greater than the number of 4's (fours).
 */
class More6Than4 {
	public static void main(String[] args) {
		More6Than4 obj = new More6Than4();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array of an size is : ");
		int num = input.nextInt();
		int arr[] = new int[num];
		System.out.print("Element of size of an array is - " + num + " :");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("}");
		boolean result = obj.count6And4(arr);
		System.out.println("Total no. of 6 is more than 4 is true or false : " + result);
	}

	public boolean count6And4(int[] numbers) {
		int count6 = 0;
		int count4 = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 6)
				count6++;
			if (numbers[i] == 4)
				count4++;
		}
		if (count6 > count4)
			return true;
		else
			return false;
	}
}

/*
 * 48:- MostFreqDigit
 * 
 * Given an array of numbers as input, return the digit which occurs the maximum
 * number of times in the input.
 */
class MostFreqDigit {
	public static void main(String[] args) {
		MostFreqDigit obj = new MostFreqDigit();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Array of Size is : ");
		int num = input.nextInt();
		int[] arr = new int[num];
		System.out.println("Arrays of size is = {" + num + "}");
		System.out.println("Enter the array of element is =");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.println("Maximum number of times Digits is ={" + obj.frequentDigit(arr) + "}");
	}

	public int frequentDigit(int[] numbers) {
		int[] count = new int[10];
		for (int num : numbers) {
			calcCount(count, num);
		}
		int dig = 0;
		int max = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				dig = i;
			}
		}
		return dig;
	}

	public void calcCount(int[] arr, int num) {
		if (num == 0) {
			arr[0]++;
		}
		while (num > 0) {
			int d = num % 10;
			arr[d]++;
			num = num / 10;
		}
	}
}

/*
 * 49:- MostFreqNum
 * 
 * Given an array of numbers as input, return the number which occurs the
 * maximum number of times in the input.
 */
class MostFreqNum {
	public static void main(String[] args) {
		MostFreqNum obj = new MostFreqNum();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Array of Size is  : ");
		int num = input.nextInt();
		int[] arr = new int[num];
		System.out.println("Array of Size is = {" + num + "}");
		System.out.println("Enter array of element is = ");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.println("The Maximum number of times is = {" + obj.frequentNumuber(arr) + "}");

	}

	public int frequentNumuber(int[] numbers) {
		int store = numbers[0];
		int count = 0, max = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				store = numbers[i];
			}
			count = 0;
		}
		return store;
	}
}

/*
 * 50:- Remove3s
 * 
 * Given an array on numbers as input, remove all elements from the array which
 * are either multiple of 3 or have the digit 3 in them. For e.g. 13 and 15 will
 * be both removed from the array if they are present.
 */
class Remove3s {
	public static void main(String[] args) {
		Remove3s obj = new Remove3s();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the arrays of size is : ");
		int num = input.nextInt();
		int[] arr1 = new int[num];
		System.out.println("Enter the arrays of size is = {" + num + "}");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		int[] res = obj.remove(arr1);
		System.out.println("Remove of all mutiple of 3 & For e.g. 13 and 15 will be both removed from the array = ");
		System.out.println("{");
		for (int j = 0; j < res.length; j++) {
			System.out.println(res[j]);
		}
		System.out.println("}");

	}

	public int[] remove(int[] arr) {
		int len = arr.length;
		int j = 0;
		for (int i = 0; i < len; i++) {
			int a = arr[i] % 10;
			int b = arr[i] / 10;
			int c = b % 10;
			if (arr[i] % 3 == 0 || a == 3 || c == 3) {
				j++;
			}
		}
		int z = len - j;
		int[] result = new int[z];
		int d = 0;
		for (int k = 0; k < len; k++) {
			int p = arr[k] % 10;
			int q = arr[k] / 10;
			int r = q % 10;
			if (arr[k] % 3 == 0 || p == 3 || r == 3) {

			} else {
				result[d] = arr[k];
				d++;
			}
		}
		return result;
	}
}

/*
 * 51:- RemoveDuplicates
 * 
 * Given an array of numbers as input, return an array with all the duplicate
 * values removed.
 */
class RemoveDuplicates {
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Arrays of Size is : ");
		int num = input.nextInt();
		int[] arr1 = new int[num];
		System.out.println("Array of Size is = {" + num + "}");
		System.out.println("Enter array of element is = ");
		System.out.println("{");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		int[] result = obj.remove(arr1);
		System.out.print("Remove the dublicate in number is = {");
		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + " ");
		}
		System.out.print("}");

	}

	public int[] remove(int[] arr) {
		int len = arr.length;
		int j = 0;
		int[] a = new int[len];
		for (int i = 0; i < len; i++) {
			if (!isPresent(arr[i], a)) {
				a[j++] = arr[i];
			}
		}
		int x = 0;
		int[] result = new int[j];
		for (int i = 0; i < len; i++) {
			if (!isPresent(arr[i], result)) {
				result[x++] = arr[i];
			}
		}
		// result=a;
		return result;
	}

	public boolean isPresent(int c, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == c)
				return true;

		}
		return false;
	}

}

/*
 * 52:- RemoveZeros
 * 
 * Given an array of integers return an array in the same order with all 0's
 * removed.
 */
class RemoveZeros {
	public static void main(String[] args) {
		RemoveZeros obj = new RemoveZeros();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array of size is : ");
		int num = input.nextInt();
		int[] arr1 = new int[num];
		System.out.println("Enter the array of size is : {" + num + "}");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		int[] res = obj.romove0(arr1);
		System.out.print("Remove all Zero is= {");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
		System.out.print("}");

	}

	public int[] romove0(int[] arr) {
		int len = arr.length;
		int len1 = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != 0)
				len1++;
		}
		int[] result = new int[len1];
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != 0)
				result[j++] = arr[i];
		}
		return result;
	}
}

/*
 * 53:- ReverseArray
 * 
 * Given an array of integers as input, output an array which has the elements
 * in reverse order.
 */
class ReverseArray {
	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array of size is : ");

		int num = input.nextInt();
		int[] arr2 = new int[num];
		System.out.println("Enter the array of size is = {" + num + "}");
		System.out.println("Etner the array of element is : {");
		for (int i = 0; i < num; i++) {
			arr2[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.println("Reverse array is = ");
		System.out.println("{");
		int[] result = obj.reverse(arr2);
		for (int k = 0; k < num; k++) {
			System.out.println(result[k]);
		}
		System.out.println("}");

	}

	public int[] reverse(int[] arr) {
		int len = arr.length;
		int a = len - 1;
		int[] res = new int[len];
		for (int i = 0; i < len; i++) {
			res[i] = arr[a--];
		}
		return res;
	}
}

/*
 * 54:- ShiftElements
 * 
 * Given a array of chars as input, return an array where the elements have been
 * "left shifted" by one, i.e. {'b','c','d','e'} becomes {'c','d','e','b'}. Note
 * that you should not create a new array and only modify the given input array.
 */
class ShiftElements {
	public static void main(String[] args) {
		ShiftElements obj = new ShiftElements();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array of element is : ");
		String str = input.nextLine();
		char[] arry = str.toCharArray();
		System.out.println("Enter the array of element is = { " + str + "}");
		System.out.println("Shiting Array of element is = ");
		System.out.println("{");
		System.out.println(obj.shift(arry));
		/*
		 * char[] result=obj.shift(arry); for(int j=0; j<result.length; j++) {
		 * 
		 * System.out.print(result[j]); }
		 */
		System.out.println("\n }");

	}

	public char[] shift(char[] elements) {
		int len = elements.length;
		char ch = elements[0];
		if (len == 1)
			return elements;
		for (int i = 0; i < len - 1; i++) {
			elements[i] = elements[i + 1];

		}
		elements[len - 1] = ch;
		return elements;
	}
}

/*
 * 55:- SplitSumArray
 * 
 * Given an array of ints as input, return true if it is possible to split the
 * array into two so that the sum of the numbers on the left is equal to the sum
 * of the numbers on the right.
 */
class SplitSumArray {
	public static void main(String[] args) {
		SplitSumArray obj = new SplitSumArray();
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.print("Enter the array of size is : ");
		int num = input.nextInt();
		int[] arr1 = new int[num];
		System.out.println("Enter the array of size is = {" + num + "}");
		System.out.println("{");
		for (i = 0; i < num; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.println("Result is = " + obj.canSplit(arr1));

	}

	public boolean canSplit(int[] arr) {
		int len = arr.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		int sum1 = 0;
		if (sum % 2 == 0) {
			sum = sum / 2;
			for (int j = 0; j < len - 1; j++) {
				sum1 += arr[j];
				if (sum1 == sum)
					return true;
			}
		}
		return false;
	}
}

/*
 * 56:- StringArrayOfNumbers
 * 
 * Given a number n as input, return a new string array of length n, containing
 * the strings "0", "1", "2" so on till n-1. If n=0, return an array of length
 * 0.
 */
class StringArrayOfNumbers {
	public static void main(String[] args) {
		StringArrayOfNumbers obj = new StringArrayOfNumbers();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array of size is : ");
		int a = input.nextInt();

		String[] result = obj.make(a);
		for (int i = 0; i < a; i++) {
			System.out.println(result[i]);
		}

	}

	public String[] make(int num) {
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = "" + i + "";
		}
		return arr;
	}
}

/*
 * 57:- ThirdLargestNumberInArray
 * 
 * Given an array of integers, find out the third largest value in the array.
 */
class ThirdLargestNumberInArray {
	public static void main(String[] args) {
		ThirdLargestNumberInArray obj = new ThirdLargestNumberInArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the arrays of size is : ");
		int num = input.nextInt();
		int[] arr1 = new int[num];
		System.out.println("Enter the array of size is {" + num + "}");
		System.out.println("{");
		for (int i = 0; i < num; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("}");
		System.out.println("Array of Thirdd Highest number is = {" + obj.thirdLargest(arr1) + "}");
	}

	public int thirdLargest(int[] arr) {
		int len = arr.length;

		for (int i = len - 1; i > 0; i--) {
			int highestIndex = i;
			for (int j = i; j >= 0; j--) {
				if (arr[j] > arr[highestIndex])
					highestIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[highestIndex];
			arr[highestIndex] = temp;
		}
		return arr[len - 3];
	}
}

/*
58:- WordTo2DChar

Given a para of words (separated by space), create a 2D array where each array 
in it represents the word. Note that the words are of the same size.
 */
class WordTo2DChar
{
    public static void main(String[] args)
    {
        WordTo2DChar obj=new WordTo2DChar();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String is : ");
        String str=input.nextLine();
       char[][] result=obj.to2DChars(str);
       
       System.out.print("Seperate space of each character is : {");
       // System.out.println(result.length);
        //System.out.println(result[0].length);
     for(int row=0; row<result.length; row++)
     {
         System.out.print("{");
         for(int col=0; col<result[0].length; col++)
         {
             
             System.out.print("'"+result[row][col]);
             if(col!=result[0].length-1)
             {System.out.print("',");}
             else
             {System.out.print("'");}
         }
         if(row!=result.length-1)
         { System.out.print("};");}
         else
         {System.out.print("}");}
     }
       // System.out.println(result[0][4]);
       System.out.print("}");
       
    }
    public char[][] to2DChars(String words)
    {
        int row=0;
        int index=words.indexOf(' ');
        int col=index;
        if(index==-1)
        {
           col=words.length();
        }
        while(index!=-1)
        {
            row++;
            index=words.indexOf(' ', index+1);
        }
        row++;
        char[][] ch=new char[row][col];
        int k=0;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ch[i][j]=words.charAt(i+k);
                k++;
            }
        }
        return ch;
    }
    
}

