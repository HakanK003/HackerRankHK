package practice1;

/*
Task
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125
 */

import java.util.Scanner;

public class JavaStdinAndStdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();// Complete this line
        int c = scan.nextInt();// Complete this line

        System.out.println(a);
        System.out.println(b);// Complete this line
        System.out.println(c);// Complete this line
    }

}