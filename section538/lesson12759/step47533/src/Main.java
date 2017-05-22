class Main {

    public static void main(String[] args) {
        System.out.println(leapYearCount(2017));
    }
    //Stepik code: start
    public static int leapYearCount(int year) {
        return year/4 - year/100 + year/400;
    }
//Stepik code: end
}
