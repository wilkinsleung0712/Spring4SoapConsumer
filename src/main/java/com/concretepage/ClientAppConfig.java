package com.concretepage;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class ClientAppConfig {
@Bean
public Jaxb2Marshaller marshaller(){
	Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	marshaller.setContextPath("com.concretepage.wsdl");
	return marshaller;
}

@Bean
public StudentClient studentClient(Jaxb2Marshaller marshaller){
	StudentClient client = new StudentClient();
	client.setDefaultUri("http://localhost:8080/Spring4SoapProducer/soapws/students.wsdl");
	client.setMarshaller(marshaller);
	client.setUnmarshaller(marshaller);
	return client;
}
}
