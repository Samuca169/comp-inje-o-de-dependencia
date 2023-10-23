package com.samucabarr.desafiospringboot;

import com.samucabarr.entities.Order;
import com.samucabarr.services.OrderService;
import com.samucabarr.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DesafioSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309,95.90,0.0);
		ShippingService ss = new ShippingService();
		OrderService os = new OrderService(ss);

		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ "  + String.format("%.2f", os.total(order)));
	}
}
