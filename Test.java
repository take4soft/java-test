public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double number = 25.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        double secondSquareRoot = Math.sqrt(squareRoot);
        System.out.println("The square root of " + squareRoot + " is " + secondSquareRoot);
    }

    
    /**
     * @param number
     * @return
     */
    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
 
 
    /**
     * @param number
     * @return
     */
    public static Boolean isSame(double number) {
        return number == 0;
    }    
}