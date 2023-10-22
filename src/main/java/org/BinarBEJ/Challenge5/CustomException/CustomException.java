package org.BinarBEJ.Challenge5.CustomException;

import java.util.InputMismatchException;

public class CustomException extends InputMismatchException {

    public CustomException(){

    }
    CustomException(String pesan){
        super("Terjadi Kesalahan akibat: "+pesan);

    }
}

