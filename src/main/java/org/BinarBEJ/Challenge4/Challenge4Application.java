package org.BinarBEJ.Challenge4;

import org.BinarBEJ.Challenge4.controller.MenuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Challenge4Application {

//	@Autowired
//	static MenuController menuController;
	public static void main(String[] args) {
		SpringApplication.run(Challenge4Application.class, args);

		MenuController menuController = new MenuController();
		menuController.greet();
	}


}
