package com.cts.swr.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.cts.swr.config.JwtTokenUtil;
import com.cts.swr.model.AppSecurityToken;
import com.cts.swr.model.AppUserEntity;
import com.cts.swr.model.AppUserModel;
import com.cts.swr.service.AppUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtAuthenticationController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private AppUserDetailsService userDetailsService;
	
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AppUserModel user) throws Exception{
	authenticate(user.getUserName(),user.getPassword());
	final UserDetails userDetails=userDetailsService.loadUserByUsername(user.getUserName());
	final String token=jwtTokenUtil.generateToken(userDetails);
	return ResponseEntity.ok(new AppSecurityToken(token));
	}
	private void authenticate(String username,String password) throws Exception{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
		}catch(DisabledException e) {
			throw new Exception("USER_DISABLED",e);
		}catch(BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS",e);
		}
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ResponseEntity<AppUserEntity> saveUser(@RequestBody AppUserModel user) throws Exception{
		return ResponseEntity.ok(userDetailsService.save(user));
	}

}
