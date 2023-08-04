package howAboutExceptions;

import java.lang.Throwable;

public class CustomExceptionExample {
    public void doSomething() throws CustomCheckedException {
        String nose = "up";
        if (nose.equals("up")) {
            throw new CustomCheckedException("An error occurred.", 123);
        }
    }

    public static void main(String[] args) {
        CustomExceptionExample example = new CustomExceptionExample();
        try {
            example.doSomething();
        } catch (howAboutExceptions.CustomCheckedException e) {
            //required java.lang.throwable
            System.out.println("Custom Exception caught: " + e.getMessage());
            System.out.println("Error Code: " + e.getErrorCode());
        }
    }


}