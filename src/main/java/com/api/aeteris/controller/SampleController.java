package com.api.aeteris.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.aeteris.requestDto.RequestDto;
import com.api.aeteris.response.ProductDetailsResponse;
import com.api.aeteris.response.ResponseDto;
import com.api.aeteris.service.INutritionXService;


@RestController
public class SampleController {
	@Autowired
	INutritionXService service;

	@RequestMapping("/greeting")
	public String greetings(){
			return "HELLO";

	}
	
	@RequestMapping(value = "greeting/user/{userName}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> getMessageForUser(@PathVariable("userName") String userName) throws Exception{
		
		return new ResponseEntity<String>("{\"Hello\":\"" + userName+"\"}", HttpStatus.CREATED);

	}
	
	@RequestMapping(value = "greeting/user/details", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<ResponseDto> getDetailsOfUser(@Valid RequestDto requestDto) throws Exception{
		ResponseDto responseDto = new ResponseDto();
		responseDto.setName(requestDto.getName());
		responseDto.setDepartment(requestDto.getDepartment());
		responseDto.setCompany(requestDto.getCompany());
		responseDto.setSkills("Java");
		responseDto.setSalary("1000$");
		responseDto.setAddress("vista,CA");
		responseDto.setPhoneNumber("99999");
		
		return new ResponseEntity<ResponseDto>(responseDto , HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value = "product/{productId}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<ProductDetailsResponse> getProductDetailsForBarcode(@PathVariable("productId") String productId) throws Exception{
		
		return new ResponseEntity<ProductDetailsResponse>(service.getProductDetails(productId), HttpStatus.OK);

	}
	
}
