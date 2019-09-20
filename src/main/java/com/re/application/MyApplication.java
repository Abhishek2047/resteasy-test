package com.re.application;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.re.test.Test;
@ApplicationPath("/service")
public class MyApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		Set<Object> set = new HashSet<>();
		set.add(new Test());
		return set;
	}


	
	

}
