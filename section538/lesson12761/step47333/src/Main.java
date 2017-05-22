class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
//Stepik code: start

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {

        String aftreg = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sB = new StringBuilder(aftreg);
            String reverse = new String(sB.reverse());
            if (aftreg.compareToIgnoreCase(reverse) == 0) {
                return true;
            }
        return false;
        }
//Stepik code: end
}
