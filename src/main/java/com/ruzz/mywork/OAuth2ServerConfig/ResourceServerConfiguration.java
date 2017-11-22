/**
 * 
 */
package com.ruzz.mywork.OAuth2ServerConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationProcessingFilter;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

/**
 * 资源服务器
 * @author ruzz
 *
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.stateless(true);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		 http
         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
         .and()
         .requestMatchers().anyRequest()
         .and()
         .anonymous()
         .and()
         .authorizeRequests()
         .antMatchers("/users/**").authenticated();//配置order访问控制，必须认证过后才可以访问
		 
	}
	
}
