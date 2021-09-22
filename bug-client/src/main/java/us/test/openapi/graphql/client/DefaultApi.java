package us.test.openapi.graphql.client;

import us.test.openapi.graphql.ApiClient;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-22T11:36:00.722-07:00[America/Los_Angeles]")@Component("us.test.openapi.graphql.client.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - good
     * @param nestedObjectName  (optional)
     * @param nestedObjectTypes  (optional)
     * @param nestedObjectParakeetColor  (optional)
     * @param nestedObjectParakeetSoundRepeater  (optional)
     * @param nestedObjectCount  (optional)
     * @param nestedObjectEnable  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void checkNestedObject(String nestedObjectName, List<String> nestedObjectTypes, String nestedObjectParakeetColor, Boolean nestedObjectParakeetSoundRepeater, Integer nestedObjectCount, Boolean nestedObjectEnable) throws RestClientException {
        checkNestedObjectWithHttpInfo(nestedObjectName, nestedObjectTypes, nestedObjectParakeetColor, nestedObjectParakeetSoundRepeater, nestedObjectCount, nestedObjectEnable);
    }

    /**
     * 
     * 
     * <p><b>200</b> - good
     * @param nestedObjectName  (optional)
     * @param nestedObjectTypes  (optional)
     * @param nestedObjectParakeetColor  (optional)
     * @param nestedObjectParakeetSoundRepeater  (optional)
     * @param nestedObjectCount  (optional)
     * @param nestedObjectEnable  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> checkNestedObjectWithHttpInfo(String nestedObjectName, List<String> nestedObjectTypes, String nestedObjectParakeetColor, Boolean nestedObjectParakeetSoundRepeater, Integer nestedObjectCount, Boolean nestedObjectEnable) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/nestedObject").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nestedObject[name]", nestedObjectName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "nestedObject[types][]", nestedObjectTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nestedObject[parakeet][color]", nestedObjectParakeetColor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nestedObject[parakeet][soundRepeater]", nestedObjectParakeetSoundRepeater));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nestedObject[count]", nestedObjectCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nestedObject[enable]", nestedObjectEnable));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
