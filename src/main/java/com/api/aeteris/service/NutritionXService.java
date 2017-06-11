package com.api.aeteris.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.aeteris.response.ProductDetailsResponse;
import com.api.aeteris.service.nutritionx.INutritionXRestService;


@Service
public class NutritionXService implements INutritionXService{
	
	@Autowired
	INutritionXRestService restService;
	
	@Override
	public ProductDetailsResponse getProductDetails(String barcodex) throws Exception {
		return restService.getProductDetails(barcodex);
	}
	
}
