package de.telran.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {
	//  1 уровень сложности: 1. Вы пишете back-end для онлайн магазина.
	//  Создайте приложение Spring Boot, которое будет слушать порт 8088.
	//Создайте в приложении контроллеры, через которые пользователи будут
	// общаться с объектами магазина:
	//1) Cart - корзина
	//2) CartItems - товары в корзине
	//3) Orders - заказы
	//4) OrderItems - товары в заказе
	//5) Users - пользователи
	//6) Favorites - избранные товары
	//7) Products - товары
	//8) Categories - категории товаров.
	//В каждом из контроллеров создайте метод, который будет отвечать за Get
	// запрос от пользователя
	//к данному контроллеру и отвечать пользователю фразой "Привет, я контроллер
	// - <имя класса контроллера>".

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

}