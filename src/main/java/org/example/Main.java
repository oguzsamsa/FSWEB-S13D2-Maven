package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;
        for (int i=0; i<n; i++) {
            if (digits[i] != digits[n-i-1]) return false;
        }

        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 0) return false;
        int sum = 0;
        for (int i=1; i<num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        char[] digits = String.valueOf(num).toCharArray();

        String result = "";

        for (char digit : digits) {
            switch (digit) {
                case '0':
                    result += "Zero ";
                    break;
                case '1':
                    result += "One ";
                    break;
                case '2':
                    result += "Two ";
                    break;
                case '3':
                    result += "Three ";
                    break;
                case '4':
                    result += "Four ";
                    break;
                case '5':
                    result += "Five ";
                    break;
                case '6':
                    result += "Six ";
                    break;
                case '7':
                    result += "Seven ";
                    break;
                case '8':
                    result += "Eight ";
                    break;
                case '9':
                    result += "Nine ";
                    break;
            }
        }

        return result.trim();
    }
}
