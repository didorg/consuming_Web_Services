package com.dido.mms.cws.services;

import com.dido.mms.cws.api.QuoteDTO;
import com.dido.mms.cws.api.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultService {

  QuoteService quoteService;

  @Autowired
  public ResultService(QuoteService quoteService) {
    this.quoteService = quoteService;
  }

  public ResultDTO getResultDTO(String name) {
    ResultDTO resultDTO = new ResultDTO();

    resultDTO.setName(name);
    resultDTO.setQuotes(this.getQuotes());

    return resultDTO;
  }

  private List<QuoteDTO> getQuotes() {
    List<QuoteDTO> quotelist = new ArrayList<>();
    QuoteDTO dto1 = this.quoteService.getQuote();
    QuoteDTO dto2 = this.quoteService.getQuote();

    quotelist.add(dto1);
    quotelist.add(dto2);

    return quotelist;
  }
}
