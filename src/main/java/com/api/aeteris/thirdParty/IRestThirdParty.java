package com.api.aeteris.thirdParty;

import java.util.HashMap;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;

public interface IRestThirdParty {	
	
	public String getRequest(String api) throws Exception;
	
	public String getRequest(String api,MediaType mediaType) throws Exception;
			
	public String getAuthorizationRequest(String api,HashMap<String, String> authorizationHeaderMap) throws Exception;
	
	public String postRequest(String api,String requestPayLoad) throws Exception;
	
	public String postAuthorizationRequest(String api,String requestBody,HashMap<String, String> authorizationHeaderMap) throws Exception;
	
	public String postRequestWithEncodedResposne(String api, String requestPayLoad,
			Boolean readEncodedResponse) throws Exception;
	
	public String getCtWidgetRedirectUrl(String api, 
			HttpMethod httpMethod, MediaType mediaType, Boolean readEncodedResponse,
			MultiValueMap<String, String> map) throws  Exception;
	
}
