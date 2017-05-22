/**
 * Created by AVK on 08.04.2017.
 */
public class Temp {
    public static void main(String[] args) {
        //System.out.println(getCallerClassAndMethodName());
        System.out.println();

        anotherMethod();

    }

    public static void anotherMethod(){
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Exception().getStackTrace();
        return ste[2].getClassName() + " #" + ste[2].getMethodName(); // your implementation here


    }
}
