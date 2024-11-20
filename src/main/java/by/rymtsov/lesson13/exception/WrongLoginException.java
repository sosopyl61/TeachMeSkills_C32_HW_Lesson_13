package main.java.by.rymtsov.lesson13.exception;

/**
 * This class is a wrong login exception.
 */

public class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
