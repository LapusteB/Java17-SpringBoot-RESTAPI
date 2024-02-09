package com.spring1.springframework1;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration config;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration RetrieveAllCourses()
	{
		return config;
	}

}
