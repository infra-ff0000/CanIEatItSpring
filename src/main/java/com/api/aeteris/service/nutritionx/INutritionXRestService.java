package com.api.aeteris.service.nutritionx;

import com.api.aeteris.response.ProductDetailsResponse;

public interface INutritionXRestService {
	public ProductDetailsResponse getProductDetails(String barcodex) throws Exception;
}
