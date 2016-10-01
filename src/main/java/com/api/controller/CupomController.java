package com.api.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Cupom;
import com.api.model.Request;
import com.api.service.CupomService;
import com.api.service.RequestService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CupomController {
	
	private CupomService serviceCup = new CupomService();
	private RequestService serviceReq = new RequestService();
	
	@CrossOrigin
	@RequestMapping(value="/Cupom", method=RequestMethod.GET)
	public ResponseEntity<List<Cupom>> getCupom(HttpServletRequest infoReq){
		
		Request request = new Request(infoReq.getRemoteAddr(), infoReq.getHeader("User-Agent"), infoReq.getProtocol(), infoReq.getMethod(), "", "");
    	serviceReq.persistRequest(request);
    	
		return new ResponseEntity<List<Cupom>>(serviceCup.getCupons(), HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(value="/Cupom", method=RequestMethod.POST)
	public void putData(@RequestBody String info, HttpServletRequest infoReq){
		
		ObjectMapper mapper = new ObjectMapper();
		Cupom cupom = new Cupom();
		try {
			cupom = mapper.readValue(info, Cupom.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Request request = new Request(infoReq.getRemoteAddr(), infoReq.getHeader("User-Agent"), infoReq.getProtocol(), infoReq.getMethod(), "", info);
    	serviceReq.persistRequest(request);
    	
		serviceCup.persistCupom(cupom);
		
	}
}
