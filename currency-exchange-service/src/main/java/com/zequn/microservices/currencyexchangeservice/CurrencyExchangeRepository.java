package com.zequn.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

// communicate with database
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> { // Entity and Prime Key

    CurrencyExchange findByFromAndTo(String from, String to);

}
