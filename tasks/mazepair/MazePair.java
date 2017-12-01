// Version: 2018010101

import java.io.*;
import java.util.*;

public class MazePair {
    public int shortestPath(char[][] maze) {
        int height = maze.length;
        int width = maze[0].length;

        // Implement your path-finding algorithm here!
        return 0;
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
        test8();
        test9();
        test10();
        test11();
        test12();
    }

    public static void test1() {
        char[][] maze = {
            "oooooo".toCharArray(),
            "or..bo".toCharArray(),
            "or..bo".toCharArray(),
            "or..bo".toCharArray(),
            "oooooo".toCharArray(),
        };
        int correctAnswer = 3;
        runTest("test1", maze, correctAnswer);
    }

    public static void test2() {
        char[][] maze = {
            "ooooo".toCharArray(),
            "orooo".toCharArray(),
            "ooooo".toCharArray(),
            "ooobo".toCharArray(),
            "ooooo".toCharArray(),
        };
        int correctAnswer = Integer.MAX_VALUE;
        runTest("test2", maze, correctAnswer);
    }

    public static void test3() {
        char[][] maze = {
            "oooooooo".toCharArray(),
            "o..r...o".toCharArray(),
            "oooooo.o".toCharArray(),
            "o......o".toCharArray(),
            "o.oooooo".toCharArray(),
            "o..b...o".toCharArray(),
            "oooooooo".toCharArray(),
        };
        int correctAnswer = 14;
        runTest("test3", maze, correctAnswer);
    }

    public static void test4() {
        char[][] maze = {
            "ooooooooo".toCharArray(),
            "o.o...o.o".toCharArray(),
            "oro.o.o.o".toCharArray(),
            "obo.o.o.o".toCharArray(),
            "o.o.o.o.o".toCharArray(),
            "o...o...o".toCharArray(),
            "ooooooooo".toCharArray(),
        };
        int correctAnswer = 1;
        runTest("test4", maze, correctAnswer);
    }

    public static void test5() {
        char[][] maze = {
            "ooooooooooooo".toCharArray(),
            "ob..o.......o".toCharArray(),
            "o.o.o.ooo.ooo".toCharArray(),
            "o.o...o...o.o".toCharArray(),
            "o.ooooooooo.o".toCharArray(),
            "o.ooo.o...o.o".toCharArray(),
            "o.o...o.o...o".toCharArray(),
            "o.o.o.o.ooo.o".toCharArray(),
            "o...o.....o.o".toCharArray(),
            "ooooo...oooro".toCharArray(),
            "ooooooooooooo".toCharArray(),
        };
        int correctAnswer = 28;
        runTest("test5", maze, correctAnswer);
    }

    public static void test6() {
        char[][] maze = {
            "ooooooooooooo".toCharArray(),
            "o...........o".toCharArray(),
            "ooooo.ooobo.o".toCharArray(),
            "o.....o.o...o".toCharArray(),
            "oooro.o.ooo.o".toCharArray(),
            "obo.o.r.....o".toCharArray(),
            "o.o.o.o.o.o.o".toCharArray(),
            "o.o.....o...o".toCharArray(),
            "o.o.ooo.o.o.o".toCharArray(),
            "o...o...o.o.o".toCharArray(),
            "ooooooooooooo".toCharArray(),
        };
        int correctAnswer = 10;
        runTest("test6", maze, correctAnswer);
    }

    public static void test7() {
        char[][] maze = {
            "ooooooooooooo".toCharArray(),
            "or..o.......o".toCharArray(),
            "ooo.o.o.ooo.o".toCharArray(),
            "o...o.o.....o".toCharArray(),
            "o.o.o.ooooo.o".toCharArray(),
            "oro.o.....obo".toCharArray(),
            "o.o.o.ooo.ooo".toCharArray(),
            "o.o...o...o.o".toCharArray(),
            "o.o.o.obo.o.o".toCharArray(),
            "o...o.o.....o".toCharArray(),
            "ooooooooooooo".toCharArray(),
        };
        int correctAnswer = 21;
        runTest("test7", maze, correctAnswer);
    }

    public static void test8() {
        char[][] maze = {
            "ooooooooooooo".toCharArray(),
            "or..........o".toCharArray(),
            "ooo.oo.oo.ooo".toCharArray(),
            "ooo.oo.oo.ooo".toCharArray(),
            "o...........o".toCharArray(),
            "oo.oo.oo.oo.o".toCharArray(),
            "oo.oo.oo.oo.o".toCharArray(),
            "oo.........bo".toCharArray(),
            "ooooooooooooo".toCharArray(),
        };
        int correctAnswer = 16;
        runTest("test8", maze, correctAnswer);
    }

    public static void test9() {
        char[][] maze = {
            "oooooooooooooo".toCharArray(),
            "or.o.........o".toCharArray(),
            "o.o..........o".toCharArray(),
            "o..o.........o".toCharArray(),
            "o.oo...o.ooo.o".toCharArray(),
            "o.o...o.o....o".toCharArray(),
            "o.o.ooo...oooo".toCharArray(),
            "o...ooo.....bo".toCharArray(),
            "oooooooooooooo".toCharArray(),
        };
        int correctAnswer = 31;
        runTest("test9", maze, correctAnswer);
    }

    public static void test10() {
        char[][] maze = {
            "ooooooooooooo".toCharArray(),
            "o.o.o.....obo".toCharArray(),
            "o.o.ooo.ooo.o".toCharArray(),
            "o...r...o...o".toCharArray(),
            "ooooo.o.o.ooo".toCharArray(),
            "o.....o.....o".toCharArray(),
            "o.ooooooo.o.o".toCharArray(),
            "o.ooo.oboro.o".toCharArray(),
            "o...o.ooooo.o".toCharArray(),
            "ooo.o.......o".toCharArray(),
            "o.....b.ooo.o".toCharArray(),
            "ooooooooooooo".toCharArray(),
        };
        int correctAnswer = 8;
        runTest("test10", maze, correctAnswer);
    }

    public static void test11() {
        char[][] maze = {
            "oooooooo".toCharArray(),
            "obo....o".toCharArray(),
            "obo.o..o".toCharArray(),
            "o.o.orro".toCharArray(),
            "o.o.o..o".toCharArray(),
            "o...o..o".toCharArray(),
            "oooooooo".toCharArray(),
        };
        int correctAnswer = 13;
        runTest("test11", maze, correctAnswer);
    }

    public static void test12() {
        char[][] maze = {
            "oooooooo".toCharArray(),
            "o..bo.oo".toCharArray(),
            "ooo.oboo".toCharArray(),
            "o.....oo".toCharArray(),
            "ooo.o.oo".toCharArray(),
            "orr....o".toCharArray(),
            "oooooooo".toCharArray(),
        };
        int correctAnswer = 5;
        runTest("test12", maze, correctAnswer);
    }

    private static void runTest(String testName, char[][] maze, int correctAnswer) {
        try {
            int output = new MazePair().shortestPath(maze);

            if (output != correctAnswer)
                outputFail(testName,
                           "Expected output " + correctAnswer +
                           " but got " + output);
            else
                outputPass(testName);
        } catch (Exception e) {
            e.printStackTrace();
            outputFail(testName, "Exception: " + e);
        }
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
            int m = sc.nextInt();
            char[][] maze = new char[n][];
            for (int i = 0; i < n; ++i) {
                maze[i] = sc.next().toCharArray();
                if (maze[i].length != m) {
                    System.out.println("Wrong length of line "+(i+1)+": "+maze[i].length+" != "+m);
                    return;
                }
            }
            System.out.println(new MazePair().shortestPath(maze));
        }
    }
}
