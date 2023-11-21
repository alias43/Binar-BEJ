package org.BinarBEJ.Challenge7.CustomException;

import java.util.InputMismatchException;

public class CustomException2 extends InputMismatchException {
    public CustomException2() {

    }

    CustomException2(String pesan) {
        super("Masukkan tidak sesuai");
    }
}
