package sda.krk24.zajecia1.exception;

import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) throws IOException {
        ExceptionTest test = new ExceptionTest();
        try {
            test.notCatchCheckedException();
        } catch (IOException e) {
            e.printStackTrace();
//            throw new UnsupportedOperationException();
            throw new IOException();
        }
    }

    void notCatchCheckedException() throws IOException {
        throwCheckedException();
        throwCheckedException();
        throwCheckedException();
        throwCheckedException();
        throwCheckedException();
        throwCheckedException();
    }

    void throwCheckedException() throws IOException {
        throw new IOException();
    }

}
