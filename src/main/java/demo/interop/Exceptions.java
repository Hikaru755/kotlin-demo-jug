package demo.interop;

import java.io.IOException;

public class Exceptions {

    public static void throwIOExceptionFromJava() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            ExceptionsKt.throwIOExceptionFromKotlin();
        } catch (IOException e) {

        }
    }

}
