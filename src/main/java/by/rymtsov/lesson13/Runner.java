package main.java.by.rymtsov.lesson13;

import main.java.by.rymtsov.lesson13.exception.WrongLoginException;
import main.java.by.rymtsov.lesson13.exception.WrongPasswordException;
import main.java.by.rymtsov.lesson13.service.Validator;

/**
 * This is the application runner class.
 */

public class Runner {
    public static void main(String[] args) {
        try {
            if(Validator.checkValidation("Ilya", "1234", "1234"))
                System.out.println("Login successful.");
            else
                System.out.println("Login failed.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
