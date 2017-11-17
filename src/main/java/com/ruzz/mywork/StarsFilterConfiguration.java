package com.ruzz.mywork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.Filter;
import com.ruzz.mywork.Filter.MyLoginFilter;

@Configuration
public class StarsFilterConfiguration {

	@Bean
	public Filter AuthFilter() {
		return new MyLoginFilter();
	}

}
