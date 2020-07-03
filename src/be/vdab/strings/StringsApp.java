package be.vdab.strings;

import be.vdab.parameters.StringsParameters;

public class StringsApp {
    public static void main(String[] args) {
        String een = "Lepel";
        String twee = "http://www.smartdeveloper.be";
        String drie = "\"De mooie zeeman nam Anna mee zei oom Ed\"";
        StringsParameters stringsParameters = new StringsParameters();

        //counting the vowels of the strings

        stringsParameters.countVowels(een);
        stringsParameters.countVowels(twee);
        stringsParameters.countVowels(drie);


        // to check if a string(Lepel) is a palindrome

        if (StringsParameters.isPalindrome(een)) {
            System.out.printf("String %s is a palindrome %n", een);
        }
        else{
            System.out.printf("String %s is NOT a palindrome %n", een);
        }

        if (StringsParameters.isPalindrome(drie)){
            System.out.printf("String %s is a palindrome %n", drie);
        }
        else{
            System.out.printf("String %s is NOT a palindrome %n", drie);
        }


    }
}
