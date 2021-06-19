package com.example.eschatbot;

import com.example.eschatbot.database.tables.records.CustomerstateRecord;
import com.example.eschatbot.responses.CustomerStateResponse;
import com.example.eschatbot.services.CustomerStateService;
import com.example.eschatbot.util.QueriesUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EschatbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(EschatbotApplication.class, args);

//		CustomerstateRecord k = QueriesUtil.getCustomerState("6295836773");

//		CustomerStateResponse response = CustomerStateService.getCustomerState("6295836773");
//		System.out.println(response);


	}

}
