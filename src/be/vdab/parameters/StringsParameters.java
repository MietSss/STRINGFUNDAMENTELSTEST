package be.vdab.parameters;

public class StringsParameters {



    // method to count the vowels of the strings
    public static void countVowels(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.printf("String %s has %d vowels. %n", string, count);
    }

    //method to check if word is a palindrome
    public static boolean isPalindrome(String string) {
        StringBuilder builder = new StringBuilder(string.toLowerCase());          // string omdraaien met Stringbuilder
        builder.reverse();
        String omgekeerdestring = builder.toString();

        if (string.toLowerCase().equals(omgekeerdestring)) {                        //strings vergelijken
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPhrasePalindrome(String string) {
    return true;
    }

    public static boolean isURL(String string) {
    return true;
    }

    public static int isVowel(String string) {
    return 1;
    }

}
