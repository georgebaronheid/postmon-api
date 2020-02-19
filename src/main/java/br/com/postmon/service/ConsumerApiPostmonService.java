package br.com.postmon.service;

import br.com.postmon.model.Address;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerApiPostmonService {

    @Value("${url.postmon}")
    private String baseUrl;

    public Address consumer(final String cep) {
        final String fullUrl = baseUrl + cep;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(fullUrl, Address.class);

    }
}
