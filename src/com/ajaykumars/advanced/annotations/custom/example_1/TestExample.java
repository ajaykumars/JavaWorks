package com.ajaykumars.advanced.annotations.custom.example_1;


@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        createdBy = "mkyong.com",
        tags = {"sales","test" }
)
public class TestExample {

    @Test
    void testA() throws Exception {
        if (true)
        //throw new RuntimeException("This test always failed");
        throw  new Exception("assert failure");

    }

    @Test(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

}
