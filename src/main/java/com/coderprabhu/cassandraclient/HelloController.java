package com.coderprabhu.cassandraclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.SimpleStatement;

@RestController
public class HelloController {
	
	@Autowired CqlSession session;
	
	@GetMapping("hello")
	public String hello(){
		SimpleStatement si = SimpleStatement.builder("select JSON * from store.shopping_cart").build();
		ResultSet rs = session.execute(si);
		return "Total records are: " + rs.getAvailableWithoutFetching() ;
	}
}