package com.emon;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
	
	public void throwNullPointerException() throws Exception{
		String s = null;
			//s.toString();
		if(s==null)
			throw new Exception("You are done...!!!!");
	}

}
