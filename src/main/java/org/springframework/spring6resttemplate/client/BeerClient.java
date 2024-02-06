package org.springframework.spring6resttemplate.client;

import org.springframework.data.domain.Page;
import org.springframework.spring6resttemplate.model.BeerDTO;

import java.util.UUID;

public interface BeerClient {
    BeerDTO getBeerById(UUID beerId);

    Page<BeerDTO> listBeers();

    Page<BeerDTO> listBeers(String beerName, String beerStyle, Boolean showInventory, Integer pageNumber, Integer pageSize);
}
