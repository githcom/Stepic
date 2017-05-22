class Main {
    public static void main(String[] args) {
        System.out.println(Main.isPowerOfTwo(1458));
    }
//Stepik code: start

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        boolean result = false;
        double buffer = Math.abs(value);
        if (buffer == 1){
            return true;
        } else if (buffer == 2){
            return true;
        } else if (buffer == 0){
            return result;
        }
        if (buffer % 2 == 0) {
            for (int i = 0; i < 1000; i++) {
                buffer/=2;
                if (buffer == 2) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
    //Stepik code: end
}
