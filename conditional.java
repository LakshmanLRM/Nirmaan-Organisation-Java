package day4;

public class conditional {
    public static void main(String[] args) {
        int a = 10, b = 20, number = -5, age = 17;

        // 1. Maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("Maximum number: " + max);

        // 2. Even or Odd
        String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number " + number + " is " + evenOdd);

        // 3. Positive, Negative, or Zero
        String sign = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("Number " + number + " is " + sign);

        // 4. Voting eligibility
        String vote = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Person is " + vote);
    }
}