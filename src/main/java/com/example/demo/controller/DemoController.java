package com.example.demo.controller;

import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import java.io.FileOutputStream;
import java.security.Principal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.web.servlet.*;

import com.example.demo.Models.AuthenticationRequest;
import com.example.demo.Models.AuthenticationResponse;
import com.example.demo.Models.Student;
import com.example.demo.Services.PwcUserService;
import com.example.demo.controller.Repository.StudentRepository;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class DemoController {
	// @Value("${datasource.url}")
    // private String userBucketPath;
    @Autowired
    private PwcUserService authService ;
    // @Autowired
    private AuthenticationManager authManager;
    // private String userBucketPather ;
    @Autowired
    StudentRepository dao ; 
    Student student;
    
    @GetMapping("/login/basic")
    public Principal basicLogin (Principal principal){
        System.out.println(principal);

        return principal;
        // return "Home";
    }
    @PostMapping(value="/upload")
    public String postMethodName(
    @RequestParam(value = "file", required = false) MultipartFile file) {
        try(FileOutputStream os = new FileOutputStream("resultfile.xlsx")) {
        
        byte[] data  = new byte[4];
        //  file.getInputStream().readAllBytes();
        os.write(data);
        
        //TODO: process POST request
        System.out.println(file);
        
        return "Sucess";
        }
        catch(Exception ex){
            System.out.print(ex.getStackTrace());
        }
        return "Success";
    }
  
    
    @RequestMapping("logout")
    public String logout (HttpServletRequest req){
        // service.
        return "logout";
    }
     
    @RequestMapping(value = "/authenticate",method= RequestMethod.POST)
    public ResponseEntity<?> authenticate (@RequestBody AuthenticationRequest  authRequest){
        try{
            authManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getuserName() ,authRequest.getPassword()));
        }
        catch(Exception ex){
            return ResponseEntity.status(500).body("invalid credentials");
            // throw new Exception("Incorrect username");
        }

        authService.loadUserByUsername(authRequest.getuserName());
        return ResponseEntity.ok(new AuthenticationResponse("Jwt here"));

    }
}
