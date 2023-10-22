package org.BinarBEJ.Challenge5.CustomException;

import java.util.InputMismatchException;

public class CustomException2 extends InputMismatchException {
    public CustomException2() {

    }

    CustomException2(String pesan) {
        super("Masukkan tidak sesuai");
    }
}
