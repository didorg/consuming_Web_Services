package com.dido.mms.cws.services;

import com.dido.mms.cws.mappers.QuoteMapper;
import com.dido.mms.cws.rest.Quote;
import com.dido.mms.cws.api.QuoteDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
    private static final Logger logger = LoggerFactory.getLogger(QuoteService.class);

    @Autowired
    private QuoteMapper quoteMapper;

    public QuoteDTO getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        logger.info(quote.toString());

        QuoteDTO dto = this.quoteMapper.mapperToDTO(quote);

        return dto;
    }

}
