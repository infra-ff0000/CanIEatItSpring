package com.api.aeteris.service;

import com.api.aeteris.response.ProductDetailsResponse;

public interface INutritionXService {
	public ProductDetailsResponse getProductDetails(String barcodex) throws Exception;
}
