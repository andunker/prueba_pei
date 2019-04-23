package com.bolsadeideas.pruebafabio.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebafabioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebafabioApplication.class, args);
	}

//	 @Bean
//	    CommandLineRunner lookup(SOAPConnector soapConnector) {
//	        return args -> {
//	            String name = "1";//Default Name
//	            if(args.length>0){
//	                name = args[0];
//	            }
//	            CreditCardGetByUserCodeRequest request = new CreditCardGetByUserCodeRequest();
//	            request.setCode(name);
//	            CreditCardGetByUserCodeResponse response =(CreditCardGetByUserCodeResponse) soapConnector.callWebService("http://18.222.184.108:8080/ws/Test", request);
//	            System.out.println("Got Response As below ========= : ");
//	            System.out.println("Name : "+response.getCreditCards());
//	        };
//	    }
	
}
