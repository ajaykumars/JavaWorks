package com.ajaykumars.interview.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class ClerkHelperUtil {
    public static String Tickets(int[] peopleInLine) {
        String result = "YES";
        int count25 = 0, count50 = 0, count100 = 0;
        System.out.println(count25 + " " + count50 + " " + count100);
        for (int i = 0; i < peopleInLine.length; i++) {

            if (peopleInLine[i] == 25) {
                count25++;
            } else if (peopleInLine[i] == 50) {
                if (count25 > 0) {
                    count25--;
                    count50++;
                    continue;
                } else {
                    result = "NO";
                    break;
                }
            } else if (peopleInLine[i] == 100) {
                if (count50 > 0 && count25 > 0) {
                    count25--;
                    count50--;
                    count100++;
                    continue;
                } else if (count25 > 2) {
                    count25 = count25 - 3;
                    count100++;
                    continue;
                } else {
                    result = "NO";
                    break;
                }
            }
            System.out.println(count25 + " " + count50 + " " + count100);
        }
        System.out.println("Final");
        System.out.println(count25 + " " + count50 + " " + count100);
        return result;
    }
}

public class ClerkHelper {
    @Test
    public void test1() {
        assertEquals("YES", ClerkHelperUtil.Tickets(new int[]{25, 25, 50, 100}));
    }

    @Test
    public void test2() {
        assertEquals("NO", ClerkHelperUtil.Tickets(new int[]{25, 100}));
    }
}