package com.vruksha.restclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ServerErrorException;

import com.vruksha.restclient.trainee.Trainee;

@Service
public class RestClientService {

	@Autowired
	RestTemplate rt;
	
	public void AddTrainee(Trainee t)
	{
		HttpEntity<Trainee> entity=new HttpEntity(t);
		rt.postForObject("http://localhost:8080/trainees",entity, Trainee.class);
	}
	
	public Trainee getTrainee(int id)
	{
		Trainee t=null;
		try {
		t=rt.getForObject("http://localhost:8080/trainees/"+id, Trainee.class);
		}
		catch(ServerErrorException ex)
		{
			
		}
		return t;
	}

	public String showPublicMsg() {
		// TODO Auto-generated method stub
	String s=rt.getForObject("http://localhost:8080/p/hello",String.class);
	return s;
	}
	public String showSecureMsg() {
		// TODO Auto-generated method stub
		System.out.println("Method Executed");
		//rt.getInterceptors().add(new BasicAuthorizationInterceptor("vineet", "12345"));
		String s=rt.getForObject("http://localhost:8080/c/hello", String.class);
	//String s=rt.getForEntity("http://localhost:8080/c/hello",String.class).toString();

	return s;
	}
	
	
	
}
