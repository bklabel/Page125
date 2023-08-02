package howAboutExceptions;

/*
//Note:  This code is not complete or working.

class GetThatError {


    public static void main(String[] args) {

        CustomExceptionExample example = new CustomExceptionExample();
        try {
            example.doSomething();
        } catch (CustomCheckedException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
            System.out.println("Error Code: " + e.getErrorCode());
        }
        GetThatError gte = new GetThatError();
        gte.CustomExceptionExample();  //how do I get gte to be seen inside of crossFingers?
    }

    /*This is the class that will cause the Exception to be called.*/
    public class CustomExceptionExample {
        public void doSomething() throws CustomCheckedException {
            // Some code that might trigger the exception
            throw new CustomCheckedException("An error occurred.", 123);
        }

        private void crossFingers() {
            try {
                gte.takeRisk(String"Something Bad Happened"); // cannot resolve symbol gte
            } catch (BadException e) {
                System.out.println("Aargh!");
                e.printStackTrace(); //cannot resolve method printStackTrace
            }
        }

        private void takeRisk() throws BadException { //There is an @ sign in the gutter. Inferred anotation??
            throw new BadException();                  //Cannot resolve symbol BadException
        }

        private void BadException(String abandonAllHope) {  //an @ annotation in the gutter.
            if (abandonAllHope.equals("Something Bad Happened")) {
                System.out.println("I am the BadException Handler and I fixed the issue");
            }
            private int errorCode;

          private CustomCheckedException(String message, int errorCode){
                super(message);
                this.errorCode = errorCode;
            }

            public int getErrorCode () {
                return errorCode;
            }
        }

        private class CustomCheckedException extends Exception {
            private int errorCode;

            public CustomCheckedException(String message, int errorCode) {
                super(message);
                this.errorCode = errorCode;
            }

            public int getErrorCode() {
                return errorCode;
            }
        }



    }
}

*/


