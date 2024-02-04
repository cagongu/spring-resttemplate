package org.springframework.spring6resttemplate.client;

import org.springframework.data.domain.Page;
import org.springframework.spring6resttemplate.model.BeerDTO;

public class BeerClientImpl implements BeerClient {
    @Override
    public Page<BeerDTO> listBeers() {
        return null;
    }
}
