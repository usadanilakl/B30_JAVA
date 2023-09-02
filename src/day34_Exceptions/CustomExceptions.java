package day34_Exceptions;

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            throw new CheckedCustomException("This is custom check Exception");
        } catch (CheckedCustomException e) {
            System.out.println(e.getMessage());
        }

        int n = 5;

        if(n>0){
            throw new UncheckedCustomException("Hello, this is unchecked one");
        }

    }
}

class CheckedCustomException extends Exception{
    public CheckedCustomException(String message){
        super(message);
    }
}

class UncheckedCustomException extends RuntimeException{
    public UncheckedCustomException(String message){
        super(message);
    }
}
