package com.ajaykumars.interview.strings;

import java.util.Arrays;

public class ReverseWordsInASentence {

    public static void main(String[] args) {

        String str = "the sky is blue";

        String[] stringArray = str.split(" ");

        for(int i=stringArray.length-1; i>=0; i--){
            System.out.print(stringArray[i]+" ");
        }


        new ReverseWordsInASentence().reverseWords(str.toCharArray());

    }


    public void reverseWords(char[] s) {
        int i=0;
        for(int j=0; j<s.length; j++){
            if(s[j]==' '){
                reverse(s, i, j-1);
                i=j+1;
                System.out.println(s);
            }
        }


        System.out.println("----");
        reverse(s, i, s.length-1);

        System.out.println(s);

        System.out.println("--final");

        reverse(s, 0, s.length-1);

        System.out.println(s);
    }

    public void reverse(char[] s, int i, int j){
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
            System.out.println(s);
        }
    }


}
