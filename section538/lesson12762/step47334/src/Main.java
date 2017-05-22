import java.math.BigInteger;

class Main {
//Stepik code: start

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= value; ++i){
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        return ret;


    }
//Stepik code: end
}
