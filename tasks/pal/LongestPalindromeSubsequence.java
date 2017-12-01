// Version: 2018010101
import java.io.*;
import java.util.*;
public class LongestPalindromeSubsequence {
    public ArrayList<Character> longestPalindromeSubsequence(ArrayList<Character> input) {
        ArrayList<Character> result = new ArrayList<>();

        // Implement your code here to compute
        // the longest palindrome subsequence of the input!

        return result;
    }

    public static void testAll() {
        clearTerminal();
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
    }

    public static void test1() {
        char[] input = { 'b', 'c', 'a', 'b', 'c', 'a', 'b', 'a' };
        char[] correctAnswer = { 'b', 'a', 'b', 'a', 'b' };
        runTest("test1", input, correctAnswer);
    }

    public static void test2() {
        char[] input = { 'a', 'i', 'b', 'o', 'h', 'p', 'h', 'o', 'b', 'i', 'a' };
        char[] correctAnswer = { 'a', 'i', 'b', 'o', 'h', 'p', 'h', 'o', 'b', 'i', 'a' };
        runTest("test2", input, correctAnswer);
    }

    public static void test3() {
        char[] input = { 'r', 'h', 'o', 't', 'a', 't', 'h', 'o', 'r', 'y' };
        char[] correctAnswer = { 'r', 'o', 't', 'a', 't', 'o', 'r' };
        runTest("test3", input, correctAnswer);
    }

    public static void test4() {
        char[] input = { 'r', 'a', 'h', 'a', 'n', 'n', 'a', 'h' };
        char[] correctAnswer = { 'h', 'a', 'n', 'n', 'a', 'h' };
        runTest("test4", input, correctAnswer);
    }

    public static void test5() {
        char[] input = { 'a', 'c', 'b', 'a', 'c' };
        char[] correctAnswer = { 'a', 'b', 'a' };
        runTest("test5", input, correctAnswer);
    }

    public static void test6() {
        char[] input = "aebecdceeccbadce".toCharArray();
        char[] correctAnswer = "abcceeccba".toCharArray();
        runTest("test6", input, correctAnswer);
    }

    public static void test7() {
        char[] input = "abcbda".toCharArray();
        char[] correctAnswer = "abcba".toCharArray();
        runTest("test7", input, correctAnswer);
    }

    private static void runTest(String testName, char[] input, char[] correctAnswer) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c : input) list.add(c);

        ArrayList<Character> answer;
        try {
            answer = new LongestPalindromeSubsequence().longestPalindromeSubsequence(list);
        } catch (Exception e) {
            e.printStackTrace();
            outputFail(testName, "Exception: " + e);
            return;
        }

        if (answer.size() != correctAnswer.length) {
            outputFail(testName,
                       "Expected palindrome of length " + correctAnswer.length + ", got " + answer);
            return;
        }

        int j = 0;
        for (int i : input) {
            if (j < answer.size() && answer.get(j) == i) j++;
        }
        if (j < answer.size()) {
            outputFail(testName, "Not a subsequence of the input: " + answer);
            return;
        }

        for (int i = 0; i < answer.size()-1-i; i++)
            if (answer.get(i) != answer.get(answer.size()-1-i)) {
                outputFail(testName, "Not a palindrome: " + answer);
                return;
            }

        outputPass(testName);
    }

    private static void clearTerminal() {
        System.out.print('\u000C');
    }

    private static void outputPass(String testName) {
        System.out.println("[Pass " + testName + "]");
    }

    private static void outputFail(String testName, String message) {
        System.out.println("[FAIL " + testName + "] " + message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        if (testcases == 0) testAll();
        for (int t = 0; t < testcases; ++t) {
            int n = sc.nextInt();
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < n; ++i) list.add(sc.next().charAt(0));
            LongestPalindromeSubsequence lis = new LongestPalindromeSubsequence();
            ArrayList<Character> pal = lis.longestPalindromeSubsequence(list);
            System.out.println(pal.size());
            for (int i = 0; i < pal.size(); i++)
                System.out.println(pal.get(i));
        }
    }
}
