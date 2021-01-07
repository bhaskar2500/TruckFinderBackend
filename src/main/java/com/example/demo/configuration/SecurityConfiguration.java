package com.example.demo.configuration;

import java.io.IOException;
import java.util.Collections;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.Services.PwcUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import com.example.demo.configuration.enumConfig;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Autowired
      private PwcUserService service;

    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
            auth.userDetailsService(service).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
  
	@Override
	protected void configure(HttpSecurity http) throws Exception {     
    // http
    // .csrf()
    // .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
    // .and()
    // .authorizeRequests()
    // .anyRequest().authenticated().and().formLogin().and().logout().logoutUrl("api/logout");
     http
     .csrf()
      .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
      .and()
      .authorizeRequests()
      .mvcMatchers(HttpMethod.GET,"/","/index.html").permitAll()
    
      .and()
      .httpBasic()
      // .authenticationEntryPoint(new AuthenticationEntryPoint(){
      // @Override
      // public void commence(HttpServletRequest request, HttpServletResponse response,
      //     org.springframework.security.core.AuthenticationException authException)
      //     throws IOException, ServletException {
      //   // TODO Auto-generated method stub
      //       response.sendError(HttpStatus.UNAUTHORIZED.value(),HttpStatus.UNAUTHORIZED.getReasonPhrase());
        
      // }
      // })
      .and().logout().logoutUrl("/logout");
 
  }

    // 
    @Bean
    public BCryptPasswordEncoder passwordEncoder() throws Exception {
      return new BCryptPasswordEncoder();
    }

    // protected void configure(AuthenticationManagerBuilder auth) throws Exception{
    //   auth.inMemoryAuthentication().withUser("fo").password("fo")
    // }
    
  @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
      return authenticationManager();
    }
    
}
