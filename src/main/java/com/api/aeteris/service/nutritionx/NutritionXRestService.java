package com.api.aeteris.service.nutritionx;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.aeteris.response.ProductDetailsResponse;
import com.api.aeteris.thirdParty.IRestThirdParty;

@Service
public class NutritionXRestService implements INutritionXRestService{
	private static final Logger logger = LoggerFactory.getLogger(NutritionXRestService.class);
	
	@Autowired
	IRestThirdParty restThirdParty;
			
	@Override
	public ProductDetailsResponse getProductDetails(String barcodex) throws Exception{
		String api = "https://api.nutritionix.com/v1_1/item?upc="+ barcodex +"&appId=23fcd10b&appKey=4c45fbf685535619d55963d6102366e8";
		try {
			//String response = restThirdParty.getRequest(api);
			RestTemplate restTemplate = new RestTemplate();
			String response = restTemplate.getForObject(api, String.class);
			System.out.println("respones" + response);
			ProductDetailsResponse parsedResponse = convertJsonToJavaObject(response, ProductDetailsResponse.class);
			return parsedResponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * generic method to convert json string to java list
	 * @param jsonResponse
	 * @param t
	 * @return
	 */
	public static <T> T convertJsonToJavaObject(String jsonResponse, Class<T> t)  {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			return mapper.readValue(jsonResponse, t);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("Exception while parsing jsonResponse to Java Object "
					, e);
		}
		return null;
	}

	
}
