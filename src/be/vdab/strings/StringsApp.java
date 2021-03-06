package be.vdab.strings;

import be.vdab.parameters.StringsParameters;

public class StringsApp {
    public static void main(String[] args) {
        String een = "Lepel";
        String twee = "http://www.smartdeveloper.be";
        String drie = "\"De mooie zeeman nam Anna mee zei oom Ed\"";
        StringsParameters stringsParameters = new StringsParameters();

        //counting the vowels of the strings

        StringsParameters.countVowels(een);
        StringsParameters.countVowels(twee);
        StringsParameters.countVowels(drie);


        // to check if a string(Lepel) is a palindrome

        StringsParameters.isPalindrome(een);
        StringsParameters.isPalindrome(twee);


        // to check if the phrase is a palindrome

        StringsParameters.isPhrasePalindrome(drie);

        // to check if its a URL

        System.out.printf("%s is %s URL %n", een, StringsParameters.isURL(een)? "een": "geen");
        System.out.printf("%s is %s URL %n", twee, StringsParameters.isURL(twee)? "een": "geen");
        System.out.printf("%s is %s URL %n", drie, StringsParameters.isURL(drie)? "een": "geen");


    }
}
