package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {

	private String jsonContent;
	private Set<String> s= new HashSet<>(); 
	
	
	@RequestMapping("/jsonfetch")
	@CrossOrigin(origins="*")
	public String EventResources() throws IOException{
		
		File resource = new ClassPathResource("test-assignment.json").getFile();
		jsonContent=new String(Files.readAllBytes(resource.toPath()));
		//System.out.println(jsonContent);
		return jsonContent;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/event")
	@CrossOrigin(origins="*")
	public String eventData(HashMap val){
		System.out.println("===========I am here================");
		if(!s.contains(val)){
		return "success";
		}
		else{
			return "already voted";
		}
	}
}
