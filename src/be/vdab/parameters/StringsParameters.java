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
    public static void isPalindrome(String string) {
        StringBuilder builder = new StringBuilder(string.toLowerCase());          // string omdraaien met Stringbuilder
        builder.reverse();
        String omgekeerdestring = builder.toString();

        if (string.toLowerCase().equals(omgekeerdestring)) {                        //strings vergelijken
            System.out.printf("String %s is a palindrome %n", string);
        } else {
            System.out.printf("String %s is NOT  a palindrome %n", string);
        }
    }

    public static void isPhrasePalindrome(String string) {
            StringBuilder builder2 = new StringBuilder(string.toLowerCase());           //remove quotes from the string
            builder2.setCharAt(0, ' ');
            builder2.setCharAt(string.length()-1, ' ');
            builder2.trimToSize();

            builder2.reverse();

            String omgekeerdestring = builder2.toString();

            if (string.toLowerCase().equals(omgekeerdestring.toLowerCase())) {                        //strings vergelijken
                System.out.printf("String %s is a palindrome %n", string);
            } else {
                System.out.printf("String %s is NOT  a palindrome %n", string);
            }
    }


    public static boolean isURL(String string) {
            if(string.startsWith("http:/")){
                return true;
        }
            else{
                return false;
            }

    }


}
