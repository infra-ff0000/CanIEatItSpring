package com.api.aeteris.thirdParty;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;

import java.nio.charset.Charset;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public class RestThirdParty implements IRestThirdParty {

	private Logger logger = Logger.getLogger(RestThirdParty.class);
	
	public static final String UTF_ENCODING =  "UTF-8";
	
	
	/**
	 * Get request doesn't require authorization
	 */
	@Override
	public String getRequest(String api) throws Exception {
		return restAPIRequest(api, null,HttpMethod.GET, APPLICATION_JSON_UTF8 , false);
	}
	
	@Override
	public String getRequest(String api,MediaType mediaType) throws Exception {
		return restAPIRequest(api, null, HttpMethod.GET, mediaType, false);
	}

	/**
	 * Post request doesn't require authorization
	 */
	@Override
	public String postRequest(String api, String requestPayLoad) throws Exception {
		return restAPIRequest(api, requestPayLoad, HttpMethod.POST,APPLICATION_JSON_UTF8, false);
	}
	
	/**
	 * Post request with authorization header parameters
	 */
	@Override
	public String postAuthorizationRequest(String api, String requestBody,
			HashMap<String, String> authorizationHeaderMap) throws Exception {
		return restAPIRequest(api, requestBody, HttpMethod.POST, APPLICATION_JSON_UTF8, false,authorizationHeaderMap);
	}	

	/**
	 * Post request doesn't require authorization
	 */
	@Override
	public String postRequestWithEncodedResposne(String api, String requestPayLoad, Boolean readEncodedResponse) throws Exception {
		return restAPIRequest(api, requestPayLoad, HttpMethod.POST, APPLICATION_JSON_UTF8, true);
	}

	/**
	 * Get request requires authorization
	 */
	@Override
	public String getAuthorizationRequest(String api, HashMap<String, String> authorizationHeaderMap) throws Exception {
		return restAPIRequest(api, null, HttpMethod.GET, APPLICATION_JSON_UTF8, false,
				authorizationHeaderMap);
	}
	
	private String restAPIRequest(String api, String requestPayload, 
			HttpMethod httpMethod, MediaType mediaType, Boolean readEncodedResponse) throws Exception {
		return restAPIRequest(api, requestPayload, httpMethod, APPLICATION_JSON_UTF8, false, null);
	}

	/**
	 * create an http request, hit third party rest API and parse response.
	 * 
	 * @param api
	 * @param requestPayload
	 * @param isAuthorizationRequired
	 * @param httpMethod
	 * @param mediaType
	 * @return
	 */
	//TODO throws and catch proper exception
	private String restAPIRequest(String api, String requestPayload,
			HttpMethod httpMethod, MediaType mediaType, Boolean readEncodedResponse,
			HashMap<String, String> authorizationHeaderMap) throws  Exception{
		try {
			RestTemplate restTemplate = new RestTemplate();
			//restTemplate.setErrorHandler(new CtResponseErrorHandler());
			HttpHeaders headers = new HttpHeaders();
			if (!CollectionUtils.isEmpty(authorizationHeaderMap))
				headers.setAll(authorizationHeaderMap);
			if (mediaType == null) {
				headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
			} else {
				headers.setContentType(mediaType);
			}
			HttpEntity<String> entity = new HttpEntity<String>(requestPayload, headers);
			
			if (readEncodedResponse) {
				restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName(UTF_ENCODING)));
			}
			
			logger.info("Rest API call :  " + api + " methodtype: " + httpMethod + " mediaType: " + mediaType + " authorizationHeaderMap: " 
					+ (!CollectionUtils.isEmpty(authorizationHeaderMap)) + " readEncodedResponse: " + readEncodedResponse + " request: "
					+ requestPayload );
			HttpEntity<String> response = restTemplate.exchange("" + api, httpMethod, entity, String.class);
			logger.info("Rest API call :  " + api + " Response: " + response.getBody());
			
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@Override
	public String getCtWidgetRedirectUrl(String api, 
			HttpMethod httpMethod, MediaType mediaType, Boolean readEncodedResponse,
			MultiValueMap<String, String> map) throws  Exception{
		return restAPIRequestWithFormData(api, 
				httpMethod,mediaType,readEncodedResponse,map);
	}
	
	private String restAPIRequestWithFormData(String api, 
			HttpMethod httpMethod, MediaType mediaType, Boolean readEncodedResponse,
			MultiValueMap<String, String> map) throws  Exception{
		try {
			RestTemplate restTemplate = new RestTemplate();
			//restTemplate.setErrorHandler(new CtResponseErrorHandler());
			HttpHeaders headers = new HttpHeaders();
			if (mediaType == null) {
				headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
			} else {
				headers.setContentType(mediaType);
			}
			//HttpEntity<String> entity = new HttpEntity<String>(requestPayload, headers);
			HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(map, headers);
			if (readEncodedResponse) {
				restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName(UTF_ENCODING)));
			}
			
			logger.info("Rest API call :  " + api + " methodtype: " + httpMethod + " mediaType: " + mediaType + " readEncodedResponse: " + readEncodedResponse  );
			HttpEntity<String> response = restTemplate.exchange("" + api, httpMethod, entity, String.class);
			logger.info("Rest API call :  " + api + " Response: " + response.getBody());
			
			return response.getBody();
		} catch (Exception e) {
			throw e;
		}
	}
	
}
