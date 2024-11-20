package main.java.by.rymtsov.lesson13.exception;

/**
 * This class is a wrong password exception.
 */

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
