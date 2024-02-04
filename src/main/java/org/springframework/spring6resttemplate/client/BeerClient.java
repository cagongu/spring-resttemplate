package org.springframework.spring6resttemplate.client;

import org.springframework.data.domain.Page;
import org.springframework.spring6resttemplate.model.BeerDTO;

public interface BeerClient {
    Page<BeerDTO> listBeers();
}
