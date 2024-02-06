package org.springframework.spring6resttemplate.client;

import org.springframework.data.domain.Page;
import org.springframework.spring6resttemplate.model.BeerDTO;

public interface BeerClient {

    Page<BeerDTO> lisBeers();

    Page<BeerDTO> listBeers(String beerName, String beerStyle, Boolean showInventory, Integer pageNumber, Integer pageSize);
}
