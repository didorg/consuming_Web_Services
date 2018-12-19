package com.dido.cws.services;

import com.dido.cws.mappers.QuoteMapper;
import com.dido.cws.rest.Quote;
import com.dido.cws.api.QuoteDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

  private static final Logger logger = LoggerFactory.getLogger(QuoteService.class);
  private QuoteMapper quoteMapper;

  @Autowired
  public QuoteService(QuoteMapper quoteMapper) {
    this.quoteMapper = quoteMapper;
  }

  QuoteDTO getQuote() {
    RestTemplate restTemplate = new RestTemplate();
    Quote quote = restTemplate
        .getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    if (quote != null) {
      logger.info(quote.toString());
    }

    return this.quoteMapper.mapperToDTO(quote);
  }

}
