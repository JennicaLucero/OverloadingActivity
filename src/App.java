public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such x way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */

    /**
     * 
     * Create method that returns the greater integer value
     */
    private static int greaterValue(int x, int y){
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
     
    /**
     * 
     * Create method that returns the greater double value
     */
    private static double greaterValue(double x, double y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("The sum of 27 and 39 is " + computeSum(27, 39));
        System.out.println("The sum of 48, 156, and 714 is " + computeSum(48, 156, 714));

        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}
