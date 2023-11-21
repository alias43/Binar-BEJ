package org.BinarBEJ.Challenge7.controller;


import lombok.extern.slf4j.Slf4j;
import org.BinarBEJ.Challenge7.model.Product;
import org.BinarBEJ.Challenge7.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Slf4j
public class MenuController {

    private Scanner sc = new Scanner(System.in);
    @Autowired
    private ProductService productService;


    public void mainMenu(){
        log.info("Metode berhasil dijalankan");
        System.out.println("Program telah berjalan");
        System.out.print("Selamat Datang di BinarFood");

        System.out.println("99. Konfirmasi Pembayaran");
        System.out.println("0.  Keluar");

        Product newProduct = Product.builder()
                .productName("Nasi Goreng")
                .price(15000)
                .build();
        productService.addNewProduct(newProduct);



//        try {
//            System.out.println("Masukkan Pilihan Anda:");
//            int input = sc.nextInt();
//            if (input < 0) {
//                throw new CustomException();
//            }
//            if (input > menu.jumlahMenu() && input != 99) {
//                throw new CustomException2();
//            }
//            validasiMenu(input);
//        }
//        catch (CustomException ce) {
//            System.out.println("Masukkan tidak boleh kurang dari 0");
//            sc.nextLine();
//            tampilMenu();
//        }
//        catch (CustomException2 ce2){
//            System.out.println("Opsi tidak tersedia! Silahkan pilih sesuai yang ada di menu");
//            sc.nextLine();
//            tampilMenu();
//        }
//        catch (InputMismatchException ime) {
//            System.out.println("Masukkan harus berupa angka");
//            sc.nextLine();
//            tampilMenu();
//        }

    }


}
