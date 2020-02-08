package com.module4a.specialClass;

import java.util.Scanner;
import com.module1a.basic.AddDigitNumbers;

//----------------------15-------------------AAA----------------------15----------------------------
/*
1:- AddDigitNumbers
Problem Statement

Given three digits as input, create a 4 digit number out of each input in which all the digits are the same. 
Then add all the 3 numbers and return the value.
*/
public class ModuleABC {
	static Scanner input;

	public static void main(String[] args) {
		AddDigitNumbers obj = new AddDigitNumbers();
		input = new Scanner(System.in);
		System.out.println("Enter a 1st number is = ");
		int a = input.nextInt();
		System.out.println("Enter a 1st number is = ");
		int b = input.nextInt();
		System.out.println("Enter a 1st number is = ");
		int c = input.nextInt();
		int result = obj.add3To4(a, b, c);
		System.out.println("sum of digit is = " + result);
	}

	public int add3To4(int digit1, int digit2, int digit3) {
		int sum1, sum2, sum3;
		int totalSum = 0;
		sum1 = digit1 * 1000 + digit1 * 100 + digit1 * 10 + digit1;
		sum2 = digit2 * 1000 + digit2 * 100 + digit2 * 10 + digit2;
		sum3 = digit3 * 1000 + digit3 * 100 + digit3 * 10 + digit3;
		totalSum = sum1 + sum2 + sum3;
		return totalSum;
	}
}

/*
 * 2:- AddTwoNums Given two numbers as input, calculate the sum of the numbers.
 */
class AddTwoNums {
	public static void main(String[] args) {
		AddTwoNums obj = new AddTwoNums();
		int result = obj.add(40, 80);
		System.out.println("Result = " + result);
	}

	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}

/*
 * 3:- AndBooleans Given three booleans as input, return the and of the all
 * three booleans
 */
class AndBooleans {
	public static void main(String[] args) {
		AndBooleans obj = new AndBooleans();
		boolean result = obj.andBooleans(true, true, true);
		System.out.println("Boolean is = " + result);

		boolean result1 = obj.andBooleans(true, true, false);
		System.out.println("Boolean is = " + result1);

		boolean result2 = obj.andBooleans(true, false, false);
		System.out.println("Boolean is = " + result2);

		boolean result3 = obj.andBooleans(false, true, true);
		System.out.println("Boolean is = " + result3);

		boolean result4 = obj.andBooleans(false, false, false);
		System.out.println("Boolean is = " + result4);

	}

	public boolean andBooleans(boolean bool1, boolean bool2, boolean bool3) {
		if (bool1 && bool2 && bool3)
			return true;
		else
			return false;
	}
}

/*
 * 4:- AreaOfSquare Problem Statement
 * 
 * You have been given 4 inputs x1,y1,x2 and y2. The points (x1,y1) and (x2,y2)
 * represent the end points of the diagonal of a square. Return the area of the
 * square.
 */

class AreaOfSquare {
	public static void main(String[] args) {
		AreaOfSquare obj = new AreaOfSquare();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 1st number is = ");
		int a = input.nextInt();
		System.out.println("Enter a 2nd number is = ");
		int b = input.nextInt();
		System.out.println("Enter a 3rd number is = ");
		int c = input.nextInt();
		System.out.println("Enter a 4th number is = ");
		int d = input.nextInt();
		double result = obj.areaOfSquare(a, b, c, d);
		System.out.println("Area of Square is = " + result);
	}

	public double areaOfSquare(int x1, int y1, int x2, int y2) {
		return (Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)) / 2;
	}
}

/*
 * 5:- HundredsDigit
 * 
 * Given a 4 digit number as input, find the value of its hundreds digit.
 */

class HundredsDigit {
	public static void main(String[] args) {
		HundredsDigit obj = new HundredsDigit();
		int result = obj.hundredsDigit(456896327);
		System.out.println(" 100 place digit number is : = " + result);
	}

	public int hundredsDigit(int num) {
		int a = num / 100;
		return a % 10;
	}
}

/*
 * 6:- LargerThanOne Given three numbers as input, num, num1 and num2, return
 * true if num is greater than atleast one of num1 and num2. Do not use if
 * statement to solve this problem.
 */
class LargerThanOne {
	public static void main(String[] args) {
		LargerThanOne obj = new LargerThanOne();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number is = ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		boolean bool = obj.largerThanOne(a, b, c);

		System.out.println("Boolean Result is = " + bool);

	}

	public boolean largerThanOne(int num, int num1, int num2) {
		boolean n = ((num > num1) || (num1 > num2) || (num2 < num));
		return n;
	}
}

/*
 * 7:- Make3Digit
 * 
 * Given a digit as input, create a 3 digit number in which all the digits are
 * the same as the input digit.
 */
class Make3Digit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number is = ");
		int num1 = input.nextInt();

		int digit = num1 * 100 + num1 * 10 + num1 * 1;
		System.out.println("Three digit number is = " + digit);
	}
}

/*
 * 8:- MakeDecimal Given 3 digits a,b and c as input, return a double of the
 * form a.bc
 * 
 */
class MakeDecimal {
	public static void main(String[] args) {
		MakeDecimal obj = new MakeDecimal();
		double result = obj.makeDecimal(4, 8, 1);
		System.out.println("Make 3 digit number is = " + result);

		double result1 = obj.makeDecimal(0, 0, 6);
		System.out.println("Make 3 digit number is another result = " + result1);

	}

	public double makeDecimal(int a, int b, int c) {
		double mkDecimal = ((a * 100) + (b * 10) + (c * 1)) / 100.0;
		return mkDecimal;
	}
}

/*
 * 9:- NumberInAscendingOrder
 * 
 * Given 3 numbers - num1, num2 and num3 as input, return true if they are in
 * ascending order.  Important - Do not use if statement in solution.
 */

class NumberInAscendingOrder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberInAscendingOrder obj = new NumberInAscendingOrder();
		System.out.println("Enter a first number is = ");
		int a = input.nextInt();
		System.out.println("Enter a second number is = ");
		int b = input.nextInt();
		System.out.println("Enter a  thirth number is = ");
		int c = input.nextInt();

		boolean bool = obj.numInAscendingOrder(a, b, c);

		System.out.println("Number order is = " + bool);

	}

	public boolean numInAscendingOrder(int num1, int num2, int num3) {
		if (num1 < num2 && num2 < num3 && num3 > num1)
			return true;
		else
			return false;
	}
}

/*
 * 10:- RequiredRunRate A team is chasing the target set in a one day
 * international match. The objective is to compute the required run rate. The
 * following have provided as input: target, maxOvers, currentScore, oversBowled
 * 
 */
class RequiredRunRate {
	public static void main(String[] args) {
		RequiredRunRate obj = new RequiredRunRate();
		double result = obj.runrateRequired(326, 49, 210, 33);
		System.out.println("Run Rate Required is = " + result);
	}

	public double runrateRequired(int target, int maxOvers, int currentScore, int oversBowled) {
		double remainOvers = maxOvers - oversBowled;
		double remainScore = target - currentScore;
		double totalrunrate = (remainScore / remainOvers);
		return totalrunrate;
	}
}

/*
 * 11:- RunsInSeries
 * 
 * The scores of a batsman in the five matches of a one day international series
 * have been provided. Calculate the total number of runs the batsman scored in
 * the series.
 */
class RunsInSeries {
	public static void main(String[] args) {
		RunsInSeries bat = new RunsInSeries();
		int result = bat.runScore(95, 105, 85, 115, 100);
		System.out.println("Batsman Score is = " + result);
	}

	public int runScore(int num1, int num2, int num3, int num4, int num5) {
		int totalRun = num1 + num2 + num3 + num4 + num5;
		return totalRun;
	}
}

/*
 * 12:- SecondsToTime
 * 
 * Given the time of a day in number of seconds, convert it into time in hhmmss
 * format. Note that the time is past noon, and hence the hours will never be
 * less than 12.
 */

class SecondsToTime {
	public static void main(String[] args) {
		SecondsToTime obj = new SecondsToTime();
		int result = obj.secondTotime(86399);
		System.out.println(" Time is hours minutes & seconds is = " + result);
		int result1 = obj.secondTotime(46800);
		System.out.println(" Time is hours minutes & seconds is = " + result1);
		int result2 = obj.secondTotime(55845);
		System.out.println(" Time is hours minutes & seconds is = " + result2);
		int result3 = obj.secondTotime(36000);
		System.out.println(" Time is hours minutes & seconds is = " + result3);
	}

	public int secondTotime(int seconds) {
		int numWorks = seconds / 60;
		int sec = seconds % 60;
		int hours = numWorks / 60;
		int min = numWorks % 60;
		int totalTime = hours * 10000 + min * 100 + sec;
		return totalTime;
	}
}

/*
 * 13:- SecondToHours
 * 
 * Given the time in number of seconds, find out how many hours have been
 * completed
 */

class SecondToHours {
	public static void main(String[] args) {
		SecondToHours obj = new SecondToHours();
		int result = obj.toHours(7700);
		System.out.println("Hours is : " + result);
	}

	public int toHours(int seconds) {
		int hours = 3600;
		return seconds / hours;
	}
}

/*
 * 14:- Sum2Digit
 * 
 * Given a 2 digit number as input, compute the sum of its digits. Assume that
 * the number has 2 digits.
 */

class Sum2Digit {
	public static void main(String[] args) {
		Sum2Digit obj = new Sum2Digit();
		int result = obj.sumTwoDigit(68);
		System.out.println("Sum of two digit no is = " + result);

		int result1 = obj.sumTwoDigit(10);
		System.out.println("sum of two digit no is = " + result1);
		int result2 = obj.sumTwoDigit(13);
		System.out.println("sum of two digit no is = " + result2);
		int result3 = obj.sumTwoDigit(19);
		System.out.println("sum of two digit no is = " + result3);
		int result4 = obj.sumTwoDigit(67);
		System.out.println("sum of two digit no is = " + result4);

	}

	public int sumTwoDigit(int n) {
		int digit = 0;
		digit = n / 10 + n % 10;
		return digit;
	}
}

/*
 * 15:- SumOf4Digits
 * 
 * Given a number as input, compute the sum of its last 4 digits. Assume that
 * the number has at least 4 digits.
 */

class SumOf4Digits {
	public static void main(String[] args) {
		SumOf4Digits obj = new SumOf4Digits();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number is = ");
		int a = input.nextInt();
		int num = obj.sum4Digit(a);
		System.out.println("Sum of maximum 4 digit Digit is = " + num);
	}

	public int sum4Digit(int n) {
		int sum = 0;
		sum = ((n % 10) + (n % 100) / 10 + (n % 1000) / 100 + (n % 10000) / 1000);
		return sum;
	}
}

//----------------25----------------------BBB---------------------25-----------------------------

/*
 * 16:- AddForThird
 * 
 * Given three numbers a, b and c, return true if the sum of any two equals the
 * third number.
 */

class AddForThird {
	public static void main(String[] args) {
		AddForThird obj = new AddForThird();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int num1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int num2 = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int num3 = input.nextInt();
		boolean result = obj.addThird(num1, num2, num3);
		System.out.println("Result is = " + result);
	}

	public boolean addThird(int a, int b, int c) {
		int sum1 = 0, sum2 = 0, sum3 = 0;
		sum1 = a + b;
		sum2 = b + c;
		sum3 = c + a;
		if (sum1 == c || sum2 == a || sum3 == b)
			return true;
		else
			return false;
	}
}
/*
 * 17:- ArithmeticOps
 * 
 * Two numbers a and b and a char c have been provided as inputs. The char c
 * represents a mathematical operation namely +,-,*,/,% (remainder). The task is
 * to perform the correct operation on a and b as specified by the char c.
 */

class ArithmeticOps {
	public static void main(String[] args) {
		ArithmeticOps obj = new ArithmeticOps();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st element is = ");
		int num1 = input.nextInt();
		System.out.print("Enter 1st element is = ");
		int num2 = input.nextInt();

		System.out.print("Which Arithmeic operation perform = ");
		char oper = input.next().charAt(0);
		int result = obj.compute(num1, num2, oper);
		System.out.println("Result  is = " + result);
	}

	public int compute(int a, int b, char operator) {
		switch (operator) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		case '%':
			return a % b;
		default:
			return 0;
		}
	}
}

/*
 * 18:- Blackjack
 * 
 * Given 2 int values greater than 0, return whichever value is nearest to 21
 * without being greater than 21. Return -1 if the values are greater than 21.
 * Also return -2 if both the values are same and less or equal to 21.
 */

class Blackjack {
	public static void main(String[] args) {
		Blackjack obj = new Blackjack();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int b = input.nextInt();
		int result = obj.calculateBlackjack(a, b);
		System.out.println("Result is = " + result);

	}

	public int calculateBlackjack(int num1, int num2) {
		if (num1 <= 21 && num2 <= 21) {
			if (num1 > num2 && num1 != num2)
				return num1;
			if (num2 > num1 && num1 != num2)
				return num2;
			if ((num1 == num2) || (num1 < 21 && num2 < 21) || (num1 == 21 && num2 == 21))
				return -2;
		} else if (num1 > 21 && num2 > 21) {
			return -1;
		} else if ((num1 < 21 && num2 > 21) || (num2 < 21 && num1 > 21)) {
			if (num1 < num2)
				return num1;
			else
				return num2;
		}
		return 0;
	}
}
/*
 * 19:- ChangeCharCase
 * 
 * Given a char as input, if it is an alphabet change its case otherwise return
 * it as it is.
 */

class ChangeCharCase {
	public static void main(String[] args) {
		ChangeCharCase obj = new ChangeCharCase();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character & number function key = ");
		char ch1 = input.next().charAt(0);
		char result = obj.changeCase(ch1);
		System.out.println("Result is = " + result);
	}

	public char changeCase(char ch)

	{
		if (ch >= 'A' && ch <= 'Z')
			ch += 32;
		else if (ch >= 'a' && ch <= 'z')
			ch -= 32;
		return ch;

	}
}
/*
 * 20:- ComputeGrade Problem Statement
 * 
 * Given the marks of a student in five subjects, compute the overall grade. The
 * grades will be on the basis of the aggregate percentage.if overall percentage
 * >= 85%, grade is A, if it is >=75% it is B, >=60% is C, >=45% is D, if it is
 * >=33% it is E else F.
 */

class ComputeGrade {
	public static void main(String[] args) {
		ComputeGrade obj = new ComputeGrade();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st number is =");
		int a = input.nextInt();
		System.out.print("Enter 1st number is =");
		int b = input.nextInt();
		System.out.print("Enter 1st number is =");
		int c = input.nextInt();
		System.out.print("Enter 1st number is =");
		int d = input.nextInt();
		System.out.print("Enter 1st number is =");
		int e = input.nextInt();
		char result = obj.isComputeGrade(a, b, c, d, e);
		System.out.println("Grade is = " + result);

	}

	public char isComputeGrade(int marks1, int marks2, int marks3, int marks4, int marks5) {
		int percentage = (marks1 + marks2 + marks3 + marks4 + marks5) * 100 / 500;
		if (percentage >= 85)
			return 'A';
		else if (percentage >= 75)
			return 'B';
		else if (percentage >= 60)
			return 'C';
		else if (percentage >= 45)
			return 'D';
		else if (percentage >= 33)
			return 'E';
		else
			return 'F';
	}
}

/*
 * 21:- ConsecutiveCentury
 * 
 * Given the scores of a batsman in four innings, return whether he scored at
 * least two centuries or not.
 */

class ConsecutiveCentury {
	public static void main(String[] args) {
		ConsecutiveCentury obj = new ConsecutiveCentury();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int b = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int c = input.nextInt();
		System.out.print("Enter a 4th number is = ");
		int d = input.nextInt();
		boolean result = obj.isConsecutiveCentury(a, b, c, d);
		System.out.println("Result is = " + result);

	}

	public boolean isConsecutiveCentury(int score1, int score2, int score3, int score4) {
		if ((score1 >= 100 && score2 >= 100) || (score3 >= 100 && score4 >= 100) || (score3 >= 100 && score1 >= 100)
				|| (score2 >= 100 && score4 >= 100))
			return true;
		else
			return false;
	}
}

/*
 * 22:- DaysInMonth
 * 
 * Given the number of the month in 2013 (1 for January, 12 for December),
 * return the number of days in it.
 */
class DaysInMonth {
	public static void main(String[] args) {
		DaysInMonth obj = new DaysInMonth();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month in number is  = ");
		int a = input.nextInt();
		int result = obj.numOfDays(a);
		System.out.println("Month of days is = " + result);

	}

	public int numOfDays(int month) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}
}

/*
 * 23:- Diff25
 * 
 * Given three ints as input , return true if one of them is 25 or more less
 * than one of the other numbers.
 */
class Diff25 {
	public static void main(String[] args) {
		Diff25 obj = new Diff25();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int num1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int num2 = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int num3 = input.nextInt();
		boolean result = obj.checkDiff25(num1, num2, num3);
		System.out.println("Result is = " + result);

	}

	public boolean checkDiff25(int a, int b, int c) {
		int x = a - b;
		int y = b - c;
		int z = c - a;
		if (x >= 25 || y >= 25 || z >= 25 || x <= (-25) || y <= (-25) || z <= (-25))
			return true;
		else
			return false;
	}
}

/*
 * 24:- IsDigit
 * 
 * Given a char as input, return true if it is a digit (i.e. between 0 to 9).
 */
class IsDigit {
	public static void main(String[] args) {
		IsDigit obj = new IsDigit();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Element is = ");
		char ch1 = input.next().charAt(0);
		boolean result = obj.isDigit(ch1);
		System.out.println("Result is = " + result);
	}

	public boolean isDigit(char ch) {
		if (ch >= '0' && ch <= '9')
			return true;
		else
			return false;
	}
}

/*
 * 25:- LargestOfThree
 * 
 * Given three numbers as input, return the largest number.
 */
class LargestOfThree {
	public static void main(String[] args) {
		LargestOfThree obj = new LargestOfThree();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers is = ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int result = obj.largestOfThree(num1, num2, num3);
		System.out.println("Largest number is = " + result);
	}

	public int largestOfThree(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > c && b > a)
			return b;
		else
			return c;
	}
}

/*
 * 26:- LeapYear
 * 
 * Given a year, return true if it is a leap year otherwise return false. Please
 * note that years that are multiples of 100 are not leap years, unless they are
 * also multiples of 400.
 */
class LeapYear {
	public static void main(String[] args) {
		LeapYear obj = new LeapYear();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year in number = ");
		int a = input.nextInt();
		boolean result = obj.isLeapYear(a);
		System.out.println("Result is = " + result);
	}

	public boolean isLeapYear(int year) {
		if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
			return true;
		else
			return false;
	}
}

/*
 * 27:- LotteryPrize
 * 
 * Jack bought a lottery ticket. He will get a reward based on the number of the
 * lottery ticket. The rules are as follows - If the ticket number is divisible
 * by 4, he gets 6 - If the ticket number is divisible by 7, he gets 10 - If the
 * ticket number is divisible by both 4 and 7, he gets 20 - Otherwise, he gets
 * 0. Given the number of the lottery ticket as input, compute the reward he
 * will receive
 */

class LotteryPrize {
	public static void main(String[] args) {
		LotteryPrize obj = new LotteryPrize();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.lotteryReward(a);
		System.out.println("Result is = " + result);
	}

	public int lotteryReward(int ticketNumber) {
		if (ticketNumber % 4 == 0 && ticketNumber % 7 != 0)
			return 6;
		else if (ticketNumber % 7 == 0 && ticketNumber % 4 != 0)
			return 10;
		else if (ticketNumber % 4 == 0 && ticketNumber % 7 == 0)
			return 20;
		else
			return 0;
	}
}

/*
 * 28:- LotteryPrize3
 * 
 * Jack bought 3 lottery tickets. He will get a reward based on the number of
 * the lottery ticket. The rules are as follows - If the ticket number is
 * divisible by 4, he gets 6 - If the ticket number is divisible by 7, he gets
 * 10 - If the ticket number is divisible by both 4 and 7, he gets 20 -
 * Otherwise, he gets 0. Given the numbers of the 3 lottery tickets as input,
 * compute the total reward he will receive. In this problem define a function
 * to compute the reward given the ticket number and use that function to
 * calculate the total reward.
 */
class LotteryPrize3 {
	public static void main(String[] args) {
		LotteryPrize3 obj = new LotteryPrize3();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st nubmer is = ");
		int a = input.nextInt();
		System.out.print("Enter a 2nd nubmer is = ");
		int b = input.nextInt();
		System.out.print("Enter a 3rd nubmer is = ");
		int c = input.nextInt();
		int result = obj.lotteryTicketfor3(a, b, c);

		System.out.println("Result is = " + result);

	}

	public int lotteryTicketfor3(int ticketNumber1, int ticketNumber2, int ticketNumber3) {
		int num1, num2, num3;
		num1 = totalReward(ticketNumber1);
		num2 = totalReward(ticketNumber2);
		num3 = totalReward(ticketNumber3);
		int sum = num1 + num2 + num3;
		return sum;
	}

	public int totalReward(int n) {
		if (n % 4 == 0 && n % 7 != 0)
			return 6;
		else if (n % 7 == 0 && n % 4 != 0)
			return 10;
		else if (n % 7 == 0 && n % 4 == 0)
			return 20;
		else
			return 0;
	}
}

/*
 * 29:- LotteryTicket
 * 
 * You have purchased a lottery ticket showing 3 digits a, b, and c. The digits
 * can be 0, 1, or 2. If they all have the value 2, the result is 10. Otherwise
 * if they are all the same, the result is 5. Otherwise if both b and c are
 * different from a, the result is 1. Otherwise the result is 0.
 */
class LotteryTicket {
	public static void main(String[] args) {
		LotteryTicket obj = new LotteryTicket();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int a2 = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int a3 = input.nextInt();
		int result = obj.lotteryTicket(a1, a2, a3);
		System.out.println("Result is = " + result);
	}

	public int lotteryTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2)
			return 10;
		else if (a == b && b == c && c == a && a != 2)
			return 5;
		else if (a != b && a != c)
			return 1;
		else
			return 0;
	}
}

/*
 * 30:- MiddleChar
 * 
 * Given three chars as input, return the char that would come in the middle if
 * the chars were arranged in order. Note that > operator can be used for chars.
 */

class MiddleChar {
	public static void main(String[] args) {
		MiddleChar obj = new MiddleChar();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Element is = ");

		char a = input.next().charAt(0);
		System.out.print("Enter 2nd Element is = ");
		char b = input.next().charAt(0);
		System.out.print("Enter 3rd Element is = ");
		char c = input.next().charAt(0);
		char result = obj.middle(a, b, c);
		System.out.println("Result of Middle element is = " + result);
	}

	public char middle(char ch1, char ch2, char ch3) {
		if ((ch1 >= ch2 && ch1 <= ch3) || (ch1 >= ch3 && ch1 <= ch2))
			return ch1;
		else if ((ch2 >= ch3 && ch2 <= ch1) || (ch2 >= ch1 && ch2 <= ch3))
			return ch2;
		else
			return ch3;
	}
}

/*
 * 31:- Multiple37
 * 
 * Given a number n, return true if it is divisible by either 3 or 7.
 */
class Multiple37 {
	public static void main(String[] args) {
		Multiple37 obj = new Multiple37();

		System.out.println("Enter a 1st number is = ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		boolean result1 = obj.multiple37(num1);
		System.out.println("1st Boolean result is = " + result1);

		System.out.println("Enter a 2nd number is = ");
		int num2 = input.nextInt();
		boolean result2 = obj.multiple37(num2);
		System.out.println("2nd Boolean result is = " + result2);
	}

	public boolean multiple37(int n) {
		if (n % 3 == 0 || n % 7 == 0)
			return true;
		else
			return false;
	}
}

/*
 * 32:- MultipleCheck
 * 
 * Given a number n as input, return true if n is divisible by at least three
 * and not divisible by at least one of 2,3,5,7 and 11.
 */
class MultipleCheck {
	public static void main(String[] args) {
		MultipleCheck obj = new MultipleCheck();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number = ");
		int a = input.nextInt();
		boolean result = obj.isMultipleCheck(a);
		System.out.println("Result is = " + result);
	}

	public boolean isMultipleCheck(int num)

	{
		if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0 && num % 7 == 0 && num % 11 == 0)
			return false;
		else if ((num % 2 == 0 && num % 3 == 0 && num % 5 == 0) || (num % 2 == 0 && num % 3 == 0 && num % 7 == 0)
				|| (num % 3 == 0 && num % 7 == 0 && num % 11 == 0))
			return true;
		else if ((num % 2 == 0 && num % 3 == 0 && num % 11 == 0) || (num % 5 == 0 && num % 7 == 0 && num % 11 == 0)
				|| (num % 2 == 0 && num % 5 == 0 && num % 11 == 0))
			return true;
		else if ((num % 2 == 0 && num % 5 == 0 && num % 7 == 0) || (num % 3 == 0 && num % 5 == 0 && num % 7 == 0)
				|| (num % 2 == 0 && num % 7 == 0 && num % 11 == 0))
			return true;

		else if (num % 2 != 0 || num % 3 != 0 || num % 5 != 0 || num % 7 != 0 || num % 11 != 0)
			return false;
		else
			return false;
	}
}

/*
 * 33:- Reverse3
 * 
 * Given a 3 digit number as input, reverse it.
 */
class Reverse3 {
	public static void main(String[] args) {
		Reverse3 obj = new Reverse3();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.reverseDigit(a);
		System.out.println("Reverse Digits is = " + result);
	}

	public int reverseDigit(int num) {
		int revNum = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			revNum = (revNum * 10) + rem;
			num = num / 10;
		}
		return revNum;
	}
}

/*
 * 34:- SameLast2Digits
 * 
 * You have been given 4 numbers as input. Return true if any one the numbers
 * has the same last 2 digits. For e.g. 123455 has the same last 2 digits (5 and
 * 5) whereas 123545 does not (4 and 5). In this problem, define a function that
 * check whether a number has the same two digits or not and returns true or
 * false. Use that function to calculate for the 4 numbers
 */
class SameLast2Digits {
	public static void main(String[] args) {
		SameLast2Digits obj = new SameLast2Digits();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 1st number is = ");
		int a1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int a2 = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int a3 = input.nextInt();
		System.out.print("Enter a 4th number is = ");
		int a4 = input.nextInt();

		boolean result = obj.isSameLastDigit(a1, a2, a3, a4);
		System.out.println("Result is = " + result);
	}

	public boolean isSameLastDigit(int num1, int num2, int num3, int num4) {
		boolean a = checkLast2Digit(num1);
		boolean b = checkLast2Digit(num2);
		boolean c = checkLast2Digit(num3);
		boolean d = checkLast2Digit(num4);
		if (a | b | c | d == true)
			return true;
		else
			return false;
	}

	public boolean checkLast2Digit(int num) {
		int n1, n2;
		n1 = num % 10;
		n2 = (num / 10) % 10;
		if (n1 == n2)
			return true;
		else
			return false;
	}
}

/*
 * 35:- SameLastDigit
 * 
 * Given 2 non negative numbers a and b, return true if both of them have the
 * same last digit.
 */
class SameLastDigit {
	public static void main(String[] args) {
		SameLastDigit obj = new SameLastDigit();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st number is = ");
		int x = input.nextInt();
		System.out.print("Enter 2nd number is = ");
		int y = input.nextInt();
		boolean result = obj.isSameLarstDigit(x, y);
		System.out.println("Result is a%b = " + result);
	}

	public boolean isSameLarstDigit(int a, int b) {
		int num1 = a % 10;
		int num2 = b % 10;
		if (num1 == num2)
			return true;
		else
			return false;
	}
}

/*
 * 36:- ScoredCentury
 * 
 * The scores of a batsman in his last three innings have been provided. You
 * have to determine whether he has scored a century in the last three innings
 * or not. If yes, return true else return false.
 */
class ScoredCentury {
	public static void main(String[] args) {
		ScoredCentury obj = new ScoredCentury();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st innings run = ");
		int inn1 = input.nextInt();
		System.out.print("Enter a 1st innings run = ");
		int inn2 = input.nextInt();
		System.out.print("Enter a 1st innings run = ");
		int inn3 = input.nextInt();
		boolean result = obj.hasScored(inn1, inn2, inn3);
		System.out.println("Boolean result is = " + result);
	}

	public boolean hasScored(int score1, int score2, int score3) {
		if (score1 >= 100 || score2 >= 100 || score3 >= 100)
			return true;
		else
			return false;
	}
}

/*
 * 37:- Special20Number
 * 
 * A number is special20 if it is a multiple of 20 or if it is one more than a
 * multiple of 20. Write a function that return true if the given non-negative
 * number is special20.
 */
class Special20Number {
	public static void main(String[] args) {
		Special20Number obj = new Special20Number();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		boolean result = obj.special20(a);
		System.out.println("Result is = " + result);
	}

	public boolean special20(int num) {
		if (num % 20 == 0 || num % 20 == 1)
			return true;
		else
			return false;
	}
}

/*
 * 38:- SumDivide11
 * 
 * You have been given 4 numbers as input. Return true if you can find 3 numbers
 * among them whose sum is divisible by 11. In this problem, define a function
 * that takes 3 numbers as input and returns true if there sum is divisible by
 * 11. Use this function to check for the 4 numbers.
 */
class SumDivide11 {
	public static void main(String[] args) {
		SumDivide11 obj = new SumDivide11();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int a2 = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int a3 = input.nextInt();
		System.out.print("Enter a 4th number is = ");
		int a4 = input.nextInt();

		boolean result = obj.sumDivBy11(a1, a2, a3, a4);
		System.out.println("Result is = " + result);
	}

	public boolean sumDivBy11(int num1, int num2, int num3, int num4) {
		boolean a = checkSumDivBy11(num1, num2, num3);
		boolean b = checkSumDivBy11(num2, num3, num4);
		boolean c = checkSumDivBy11(num3, num4, num1);
		boolean d = checkSumDivBy11(num4, num1, num2);
		if (a | b | c | d == true)
			return true;
		else
			return false;
	}

	public boolean checkSumDivBy11(int x, int y, int z) {
		int sum = x + y + z;
		if (sum % 11 == 0)
			return true;
		else
			return false;
	}
}

/*
 * 39:- SumLast3
 * 
 * Given a number as input, return the sum of its last 3 digits.
 */
class SumLast3 {
	public static void main(String[] args) {
		SumLast3 obj = new SumLast3();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int n = input.nextInt();
		int result = obj.sumOfLast3Digits(n);
		System.out.println("Sum of Last 3 digits is = " + result);
	}

	public int sumOfLast3Digits(int num) {
		int sum = 0;
		sum = num % 10 + (num % 100) / 10 + (num % 1000) / 100;
		return sum;
	}
}

/*
 * 40:- TicketNumbers
 * 
 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers
 * are all different from each other, the result is 0. If all of the numbers are
 * the same, the result is 20. If two of the numbers are the same, the result is
 * 10.
 */
class TicketNumbers {
	public static void main(String[] args) {
		TicketNumbers obj = new TicketNumbers();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int a2 = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int a3 = input.nextInt();
		int result = obj.calcuPrize(a1, a2, a3);
		System.out.println("Result is = " + result);
	}

	public int calcuPrize(int a, int b, int c) {
		if (a != b && b != c && c != a)
			return 0;
		else if (a == b && b == c && c == a)
			return 20;
		else
			return 10;
	}
}

//-------------------24------------------------CCC------------------24------------------------

/*
 * 41:- AllFactorsArePrime
 * 
 * Given a number n, return true is all the factors of n are prime numbers. Note
 * that 1 and the number itself are not considered as factors in this problem.
 */
class AllFactorsArePrime {
	public static void main(String[] args) {
		AllFactorsArePrime obj = new AllFactorsArePrime();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int num = input.nextInt();
		boolean result = obj.areAllFactorsPrime(num);
		System.out.println("Multiple of factor is given number prime or not = " + result);
	}

	public boolean areAllFactorsPrime(int n) {

		for (int i = 2; i <= n / 2; i++) {
			int a = 0;
			if (n % i == 0) {
				a = i;
			}
			if (!isPrime(a))
				return false;
		}
		return true;
	}

	public boolean isPrime(int x) {
		if (x == 2)
			return true;
		for (int i = 3; i <= x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
}

/*
 * 42:- AnyonePrime
 * 
 * Given three numbers as input, return true if at least one of them is a prime
 * number.
 * 
 * For solving this problem, define a function that checks whether a number is a
 * prime or not and use that function.
 */
class AnyonePrime {
	public static void main(String[] args) {
		AnyonePrime obj = new AnyonePrime();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int a2 = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int a3 = input.nextInt();

		boolean result = obj.anyOnePrimeNo(a1, a2, a3);
		System.out.println("Number is Prime or no = " + result);
	}

	public boolean anyOnePrimeNo(int num1, int num2, int num3) {
		boolean a = isPrimeNo(num1);
		boolean b = isPrimeNo(num2);
		boolean c = isPrimeNo(num3);
		if (a | b | c == true)
			return true;
		else
			return false;
	}

	public boolean isPrimeNo(int num) {
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
 * 43:- ComputeNthPrime
 * 
 * Given an input n, find out the nth prime
 */
class ComputeNthPrime {
	public static void main(String[] args) {
		ComputeNthPrime obj = new ComputeNthPrime();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number is = ");
		int a = input.nextInt();
		int result = obj.computePrime(a);
		System.out.println("Whose prime number count given number  = " + result);
	}

	public int computePrime(int n) {
		int currentNum = 1;
		int count = 0;
		while (count != n) {
			currentNum++;
			if (isPrime(currentNum))
				count++;
		}
		return currentNum;
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
 * 44:- Count3Den
 * 
 * A number is defined as a 3Den if it is a multiple of 3 or has the digit 3 in
 * it. Given a number num as input, count the number of 3Den between 1 and num.
 */
class Count3Den {
	public static void main(String[] args) {
		Count3Den obj = new Count3Den();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number is = ");
		int b = input.nextInt();
		int result = obj.count(b);
		System.out.println("Divied by 3 given a number is = " + result);
	}

	public int count(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 || check3Den(i))
				count++;
		}
		return count;
	}

	public boolean check3Den(int x) {
		while (x > 0) {
			int a = x % 10;
			if (a == 3)
				return true;
			x = x / 10;
		}
		return false;
	}
}

/*
 * 45:- CountFactors
 * 
 * Given a number n as input, find the count of its factors other than 1 and n.
 */
class CountFactors {
	public static void main(String[] args) {
		CountFactors obj = new CountFactors();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.countOfFactors(a);
		System.out.println("Count the number of factor is = " + result);
	}

	public int countOfFactors(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				count++;
		}
		return count;
	}
}

/*
 * 46:- CountTheDigit
 * 
 * Given a number n and a digit d as input, find the number of time d occurs in
 * n. You can assume that the number is non-negative.
 */
class CountTheDigit {
	public static void main(String[] args) {
		CountTheDigit obj = new CountTheDigit();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number is = ");
		int a = input.nextInt();
		System.out.print("Enter a digit: ");
		int b = input.nextInt();
		int result = obj.findDigitCount(a, b);
		System.out.println("Number of Digit Occur in the number = " + result);
	}

	public int findDigitCount(int num, int digit) {
		int temp = 0, count = 0;
		while (num > 0) {
			temp = num % 10;
			if (temp == digit)
				count++;
			num = num / 10;
		}
		return count;
	}
}

/*
 * 47:- FirstDigit
 * 
 * Given a number as input, find the most significant digit in it. You can
 * assume that the number is not negative.
 */
class FirstDigit {
	public static void main(String[] args) {
		FirstDigit obj = new FirstDigit();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.firstDigit(a);
		System.out.println("First Digit is = " + result);
	}

	public int firstDigit(int num) {
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
		}
		return rem;
	}
}

/*
 * 48:- FizzBuzz
 * 
 * A number is considered fizz if it is divisible by 3. It is considered buzz if
 * it is divisible by 5. It is considered fizzbuzz if it is divisible by both 3
 * and 5. A fizzbuzz is neither fizz nor buzz. Given two numbers n1 and n2 such
 * that n2>n1, let f be the number of fizz, b be the number of buzz and fb be
 * the number of fizzbuzz between n1 and n2(both n1 and n2 are included).
 * Calculate and return the value of 3*f+5*b-15*fb.
 */
class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzz obj = new FizzBuzz();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int b = input.nextInt();
		int result = obj.isFizzBuzz(a, b);
		System.out.println("Result is = " + result);
	}

	public int isFizzBuzz(int num1, int num2) {
		int fb = 0, f = 0, b = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				fb = fb + 1;
			else if (i % 3 == 0)
				f = f + 1;
			else if (i % 5 == 0)
				b = b + 1;
		}
		return 3 * f + 5 * b - 15 * fb;
	}
}

/*
 * 49:- Is3Den
 * 
 * A number is defined as a 3den if it is a multiple of 3 or has the digit 3 in
 * it. Given a number as input, determine whether it is a 3den or not.
 */
class Is3Den {
	public static void main(String[] args) {
		Is3Den obj = new Is3Den();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		boolean result = obj.is3Den(a);
		System.out.println("Result is = " + result);
	}

	public boolean is3Den(int num) {
		int i = 0;
		if (num % 3 == 0)
			return true;
		while (num > 0) {
			i = num % 10;
			if (i == 3)
				num = num / 10;
			return true;
		}
		return false;
	}
}

/*
 * 50:- IsPrimeNumber
 * 
 * Given a number n as input, return whether the number is a prime number or
 * not. Please note that 1 is not a prime number.
 */
class IsPrimeNumber {
	public static void main(String[] args) {
		IsPrimeNumber obj = new IsPrimeNumber();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		boolean result = obj.isPrime(a);
		System.out.println("Number is prime = " + result);
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
 * 51:- LargestDigit
 * 
 * Given a number as input, find the largest digit in it. You can assume that
 * the number is not negative.
 */
class LargestDigit {
	public static void main(String[] args) {
		LargestDigit obj = new LargestDigit();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.maxDigit(a);
		System.out.println("Maximum digit is = " + result);
	}

	public int maxDigit(int num) {
		int max = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem > max)
				max = rem;
			num = num / 10;
		}
		return max;
	}
}

/*
 * 52:- NextMultiple37
 * 
 * Given a number num as input, find the smallest number greater than num that
 * is a multiple of both 3 and 7.
 */
class NextMultiple37 {
	public static void main(String[] args) {
		NextMultiple37 obj = new NextMultiple37();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.findNextMultiple37(a);
		System.out.println("A number is Next multiple of 3 & 7 is = " + result);
	}

	public int findNextMultiple37(int num) {
		int mul = 0;
		// for(int i=num; i<=10000; i++)
		for (int i = num; i >= num; i++) {
			if (i % 3 == 0 && i % 7 == 0)
				break;
			mul = i + 1;
		}
		return mul;
	}
}

/*
 * 54:- NthPower
 * 
 * Given a number a, compute the nth power of a.
 */
class NthPower {
	public static void main(String[] args) {
		NthPower obj = new NthPower();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a1 = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int a2 = input.nextInt();
		int result = obj.nthPower(a1, a2);
		System.out.println("a of b power number is = " + result);
	}

	public int nthPower(int a, int b) {
		int temp = 1;
		if (b == 0)
			return 1;
		for (int i = 1; i <= b; i++) {
			temp = temp * a;
		}
		return temp;
	}
}

/*
 * 55:- PerfectNumber
 * 
 * A perfect number is a positive integer that is equal to the sum of its
 * factors. For example, 6 is a perfect number because 6=1+2+3; but 24 is not
 * perfect because 24<1+2+3+4+6+8+12. Given a number n, the objective is find
 * out whether it is a perfect number or not.
 */
class PerfectNumber {
	public static void main(String[] args) {
		PerfectNumber obj = new PerfectNumber();
		Scanner inpput = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = inpput.nextInt();
		boolean result = obj.isPerfect(a);
		System.out.println("Perfect number is true or false  = " + result);
	}

	public boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				sum = i + sum;
		}
		if (sum == num)
			return true;
		else
			return false;
	}
}

/*
 * 56:- ReverseNumber
 * 
 * Given a number as input, reverse it. You can assume that the number is not
 * negative.
 */
class ReverseNumber {
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.reverse(a);
		System.out.println("Reverse number is = " + result);
	}

	public int reverse(int num) {

		int revNum = 0;
		while (num > 0) {
			int rem = num % 10;
			revNum = (revNum * 10) + rem;
			num = num / 10;
		}
		return revNum;
	}
}

/*
 * 57:- SameFirst
 * 
 * Given three numbers as input, return true if the first digit of any two of
 * them is the same. The first digit of 2345 is 2, of 981201 is 9. Assume all
 * the numbers are positive integers greater than 0. For solving this problem,
 * define a function that computes the first digit if a number and use that
 * function.
 */
class SameFirst {
	public static void main(String[] args) {
		SameFirst obj = new SameFirst();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int b = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int c = input.nextInt();
		boolean result = obj.sameFirstDigit(a, b, c);
		System.out.println("First number occure 2nd number or 3rd number = " + result);
	}

	public boolean sameFirstDigit(int num1, int num2, int num3) {
		int x = findDigit(num1);
		int y = findDigit(num2);
		int z = findDigit(num3);
		if (x == y || y == z || z == x)
			return true;
		else
			return false;
	}

	public int findDigit(int num) {
		int temp = 0, rem = 0;
		while (num > 0) {
			rem = num % 10;
			temp = rem;
			num = num / 10;
		}
		return temp;
	}
}

/*
 * 58:- SumNumbers
 * 
 * Given a number n as input, output the sum of numbers from 1 to n.
 */
class SumNumbers {
	public static void main(String[] args) {
		SumNumbers obj = new SumNumbers();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nubmer is = ");
		int a = input.nextInt();
		int result = obj.sumOfNumbers(a);
		System.out.println("Sum of number is = " + result);
	}

	public int sumOfNumbers(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

/*
 * 59:- SumNumbers1
 * 
 * Given a number n as input, find the sum of all numbers from 1 to n which are
 * not divisible by either 2 or 3.
 */
class SumNumbers1 {
	public static void main(String[] args) {
		SumNumbers1 obj = new SumNumbers1();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.isSum(a);
		System.out.println("Add of number is = " + result);
	}

	public int isSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0 && i % 3 != 0)
				sum = sum + i;
		}
		return sum;
	}
}

/*
 * 60:- SumOfDigits
 * 
 * Given a number n, find the sum of its digits.
 */
class SumOfDigits {
	public static void main(String[] args) {
		SumOfDigits obj = new SumOfDigits();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		int result = obj.sumDigits(a);
		System.out.println("Sum of digit is = " + result);
	}

	public int sumDigits(int num) {
		int sumDig = 0;
		while (num > 0) {
			int rem = num % 10;
			sumDig = sumDig + rem;
			num = num / 10;
		}
		return sumDig;
	}
}

/*
 * 61:- SumOfDigitsWithCount
 * 
 * Given 2 inputs, a number n and the number of digits it has d , find the sum
 * of its digits.
 */
class SumOfDigitsWithCount {
	public static void main(String[] args) {
		SumOfDigitsWithCount obj = new SumOfDigitsWithCount();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int num = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int count = input.nextInt();
		int result = obj.sumDigits(num, count);
		System.out.println("Sum of digit is & also count digit is = " + result + ", " + count);
	}

	public int sumDigits(int num, int count) {
		int sum = 0;
		for (int i = 1; i <= count; i++) {
			int b = num % 10;
			sum = sum + b;
			num = num / 10;
		}
		return sum;
	}
}

/*
 * 62:- SumOfSquares
 * 
 * Given two numbers n1 and n2 such that n2>n1, find sum of squares of all
 * numbers from n1 to n2 (including n1 and n2).
 */
class SumOfSquares {
	public static void main(String[] args) {
		SumOfSquares obj = new SumOfSquares();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st Number is = ");
		int a = input.nextInt();
		System.out.print("Enter a 2nd Number is = ");
		int b = input.nextInt();
		int result = obj.computeSumOfSquares(a, b);
		System.out.println("Sum of total number is = " + result);
	}

	public int computeSumOfSquares(int n1, int n2) {
		int sum = 0;
		if (n2 >= n1)
			for (n1 = n1; n1 <= n2; n1++) {
				sum = sum + n1 * n1;
			}
		return sum;
	}
}

/*
 * 63:- SumRounded
 * 
 * Round a number to the next multiple of 10 if its ones digit is 5 or more,
 * otherwise round it the previous multiple of 10. So, 25 and 26 round to 30
 * where as 23 and 24 round to 20. 20 also rounds to 20. You have been given 4
 * ints as input. Round each of the input values and return their sum.
 */
class SumRounded {
	public static void main(String[] args) {
		SumRounded obj = new SumRounded();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 1st number is = ");
		int a = input.nextInt();
		System.out.print("Enter a 2nd number is = ");
		int b = input.nextInt();
		System.out.print("Enter a 3rd number is = ");
		int c = input.nextInt();
		System.out.print("Enter a 4th number is = ");
		int d = input.nextInt();
		int result = obj.sumRounded(a, b, c, d);
		System.out.println("Sum of Rounded number is = " + result);
	}

	public int sumRounded(int num1, int num2, int num3, int num4) {
		int n1 = roundedNum(num1);
		int n2 = roundedNum(num2);
		int n3 = roundedNum(num3);
		int n4 = roundedNum(num4);
		return n1 + n2 + n3 + n4;
	}

	public int roundedNum(int num) {
		int rem = num % 10;
		num = num / 10;
		if (rem >= 0 && rem < 5)
			return num * 10;
		else
			return num * 10 + 10;
	}
}

/*
 * 64:- SuperDivide
 * 
 * A positive int is called super-divide if every digit in the number divides
 * the number. So for example 128 divides itself since 128 is divisible by 1, 2,
 * and 8. Note that no number is divisible by 0. Given a number as input,
 * determine if it is a super-divide.
 */
class SuperDivide {
	public static void main(String[] args) {
		SuperDivide obj = new SuperDivide();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number is = ");
		int a = input.nextInt();
		boolean result = obj.checkSuper(a);
		System.out.println("Number divide the given digit own by it self = " + result);
	}

	public boolean checkSuper(int num) {
		if (num % 10 == 0)
			return false;
		else if (num % 10 != 0) {
			int temp = num;
			while (temp > 0) {
				int rem = temp % 10;
				if (num % rem != 0)
					return false;
				temp = temp / 10;
			}
		}
		return true;
	}
}
