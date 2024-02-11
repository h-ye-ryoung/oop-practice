package org.example;

public class WrongFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "ab"; // 2글자 -> 항상 거짓
    }
}
