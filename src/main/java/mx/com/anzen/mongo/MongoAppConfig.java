package mx.com.anzen.mongo;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.anzen.mongo.models.ConexionDataBean;
 
 
@Configuration 
public class MongoAppConfig {
	
	@Value("${host}")
	private String host;
	
	@Value("${port}")
	private String puerto;
	
	@Value("${database}")
	private String database;
	  
	@Bean
	public ConexionDataBean conexion(){ 
		return new ConexionDataBean(host, puerto,database);
	}
	
}
