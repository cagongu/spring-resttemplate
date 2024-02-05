package org.springframework.spring6resttemplate.client;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.spring6resttemplate.model.BeerDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RequiredArgsConstructor
@Service
public class BeerClientImpl implements BeerClient {

    private final RestTemplateBuilder restTemplateBuilder;

    private static final String BASE_URL = "http://localhost:8080";

    private static final String GET_BEER_PATH = "/api/v1/beer";

    @Override
    public Page<BeerDTO> listBeers() {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<String> stringResponseEntity = restTemplate.getForEntity(BASE_URL + GET_BEER_PATH, String.class);

        ResponseEntity<Map> mapResponseEntity = restTemplate.getForEntity(BASE_URL + GET_BEER_PATH, Map.class);

//        cach su dung jsonNode https://www.baeldung.com/java-jsonnode-get-keys
        ResponseEntity<JsonNode> jsonNodeResponseEntity = restTemplate.getForEntity(BASE_URL + GET_BEER_PATH, JsonNode.class);

        jsonNodeResponseEntity.getBody().findPath("content").elements().forEachRemaining(node -> {
            System.out.println(node.get("beerName").asText());
        });

        System.out.println(stringResponseEntity.getBody());

        return null;
    }
}