class Main {

    //Stepik code: start
    public static boolean doubleExpression(double a, double b, double c) {
        boolean boo = false;
        if (Math.abs((a + b) - c) <= 1E-4){
            boo = true;
        }
        return boo;
    }

//Stepik code: end
}
