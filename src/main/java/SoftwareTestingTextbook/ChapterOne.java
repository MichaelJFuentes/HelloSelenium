package SoftwareTestingTextbook;

import java.util.Collections;
import java.util.Vector;

public class ChapterOne {
    public static int findLastIndex(int[] x, int y) throws NullPointerException{
        if (x == null) {
            throw new NullPointerException();
        }
        for(int i = x.length -1; i >= 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

    public static int findZero(int[] x) throws NullPointerException{
        if (x == null) {
            throw new NullPointerException();
        }
        for(int i = x.length -1; i >= 0; i--) {
            if (x[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int countPositive(int[] x ) throws NullPointerException{
        if (x == null) {
            throw new NullPointerException();
        }
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int oddOrPositive(int[] x ) {
        if (x == null) {
            throw new NullPointerException();
        }
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i] % 2 ) == 1|| x[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void findLastIndexTest() {
        int[] x = {2,3,5};
        int y = 2;
        System.out.println(findLastIndex(x, y));
    }

    public static void findZeroTest() {
        int[] x = {0,1,0};
        System.out.println(findZero(x));
    }

    public static void countPositiveTest() {
        int[] x = {-4,2,0,2};
        System.out.println(countPositive(x));
    }
    public static void oddOrPositiveTest() {
        int[] x = {-3,-2,0,1,4};
        System.out.println(oddOrPositive(x));
    }

    public static void main(String[] args) {
        findLastIndexTest();
        findZeroTest();
        countPositiveTest();
        oddOrPositiveTest();
    }
}
