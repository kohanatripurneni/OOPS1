public class TestNumberFormat {
    public static void main(String[] args) {
   // write an application that throws abd catches arithmetic exception when u need to attempt the square root of negative value, to calculate the sq root use math.input method, the application either display the output or catch the exception
     double input = 25;
        try {
            if (input < 0) {
                throw new ArithmeticException("Cannot calculate the square root of a negative number.");
            }
            double result = Math.sqrt(input);
            System.out.println("The square root of " + input + " is: " + result);
        } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());}
                }
}