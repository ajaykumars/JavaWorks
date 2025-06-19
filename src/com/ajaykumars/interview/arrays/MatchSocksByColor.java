package com.ajaykumars.interview.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class MatchSocksByColor {

    public static void main(String[] args) {

        int totalSocks = 9;
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        ArrayList<Integer> socksColor = new ArrayList<>();
        HashMap<Integer, Integer> socksColorCount = new HashMap<>();
        int pair = 0;
        for (int i = 0; i < totalSocks; i++) {
            int count = 0;
            if (!socksColor.contains(socks[i])) {
                socksColor.add(socks[i]);

                for (int j = 0; j < totalSocks; j++) {
                    if (socks[j] == socks[i]) {
                        count++;
                    }
                }
            }
            pair = pair + ((int) count / 2);
        }

        System.out.println(pair);
    }

}
