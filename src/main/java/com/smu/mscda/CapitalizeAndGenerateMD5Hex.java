package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.util.Scanner;

public class CapitalizeAndGenerateMD5Hex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String ");
        String inputString=sc.nextLine();
        String capitalizedString = WordUtils.capitalize(inputString);
        String md5Hex = DigestUtils.md5Hex(inputString);
        System.out.println("Capatalized string is : "+capitalizedString);
        System.out.println("MD5 hex is : "+md5Hex);




    }
    public static String capatalize (String input){
        return WordUtils.capitalize(input);



    }
    public static String generateMD5Hex (String input){
        return DigestUtils.md5Hex(input);



    }


}