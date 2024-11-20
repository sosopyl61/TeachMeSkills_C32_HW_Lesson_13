package main.java.by.rymtsov.lesson13.service;

import main.java.by.rymtsov.lesson13.exception.WrongLoginException;
import main.java.by.rymtsov.lesson13.exception.WrongPasswordException;

/**
 * This class contains method to check
 * if login or password is not valid.
 */

public class Validator {

    public static boolean checkIfStringContainsSpaces(String str) {
        char[] symb = str.toCharArray();
        for (char c : symb) {
            if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkValidation(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        /*if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login!");
        }*/

        if (login.length() > 20 || checkIfStringContainsSpaces(login)) {
            throw new WrongLoginException("Wrong login!");
        }

        if (password.length() > 20 ||
                checkIfStringContainsSpaces(password) ||
                !password.equals(confirmPassword) ||
                !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Wrong password!");
        }
        return true;
    }
}
