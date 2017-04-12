package mx.com.anzen.mongo.api;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.anzen.mongo.services.MongoService;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
  

@RestController
public class MongoController { 
	
	@Autowired
	private MongoService mongo;
	 
	
	@RequestMapping(value="/layout")
    public Map<String,Object> layout() throws UnknownHostException{ 
		
		Map<String,Object> map=new HashMap(); 
//		map.put("IdFileType",1);
		Map<String,Object> mapResult=mongo.consulta("ADBancaGenerica",map); 
		  
        return mapResult;
    }
}
