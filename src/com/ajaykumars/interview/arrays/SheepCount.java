package com.ajaykumars.interview.arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;

public class SheepCount {
    Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }
}

class Counter {

    AtomicInteger count = new AtomicInteger();

    public int countSheeps(Boolean[] arrayOfSheeps) {

        //ArrayList<Boolean> sheepList = (ArrayList<Boolean>) Arrays.asList(arrayOfSheeps);
        Arrays.asList(arrayOfSheeps).forEach(bool -> {
            if (bool) {
                count.getAndIncrement();
            }
        });
        return count.intValue();
    }


}