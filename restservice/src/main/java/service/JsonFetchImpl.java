package service;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

@Service
public class JsonFetchImpl implements JsonFetch {

	@Override
	public Object jsonContent(){
	JSONParser parser=new JSONParser();
	Object obj=null;
	JSONObject jsonObj=null;

	try{
		 obj=parser.parse(new FileReader("C:\\test-assignment.json"));
		 System.out.println(obj);
		 jsonObj=(JSONObject)obj;
	}
	catch(Exception e){
		
	}
	
	return obj;
	}
	
}
