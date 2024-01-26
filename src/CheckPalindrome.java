public class CheckPalindrome {
    public static String isPalindrome(String movieName) {
        String rev = "";

        for (int i = movieName.length() - 1; i >= 0; i--) {
            rev = rev + movieName.charAt(i);
        }

        if (movieName.equals(rev)) {
            return movieName.toUpperCase();
        } else {
            return "Not A Palindrome";
        }
    }
}
