package com.ajaykumars.debug;


public class Debug {



    public static void main(String[] args) {

//        String str1 = "bat";
//        String str2 = "tab";  // True
//
//        String str3 = "abc";  //False
//
//        String str4 = "batc"; //False
//
//        String str5 = "aaa"; //False
//
//        //Test Case 1
//        System.out.println(isAnagram(str1, str2));
//
//        //Test Case 2
//        System.out.println(isAnagram(str1, str3));
//
//        //Test Case 3
//        System.out.println(isAnagram(str1, str4));
//
//        //Test Case 4
//        System.out.println(isAnagram(str1, str5));
        if (args.length != 2) {
            System.out.println("Input args length should be 2");
            //exit();
        }

        System.out.println(isAnagram(args[0], args[1]));
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() == str2.length()) {

            boolean isAnagram = false;
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            boolean[] checked = new boolean[str1.length()];

            for (int i = 0; i < str1.length(); i++) {
                isAnagram = false;
                for (int j = 0; j < str2.length(); j++) {

                    if (charArray1[i] == charArray2[j] && checked[i] == false) {
                        checked[i] = true;
                        isAnagram = true;
                        break;
                    }

                }

            }

            return isAnagram;

        }

        return false;

    }


}
