package com.dido.mms.cws.mappers;

import com.dido.mms.cws.rest.Quote;
import com.dido.mms.cws.rest.Value;
import com.dido.mms.cws.api.QuoteDTO;
import com.dido.mms.cws.api.ValueDTO;
import org.springframework.stereotype.Component;

@Component
public class QuoteMapper {

    public QuoteDTO mapperToDTO(Quote quote) {
        QuoteDTO quoteDTO = new QuoteDTO();

        quoteDTO.setType(quote.getType());
        quoteDTO.setValue(this.mapperValue(quote.getValue()));

        return quoteDTO;
    }

    private ValueDTO mapperValue(Value value) {
        ValueDTO valueDTO = new ValueDTO();

        valueDTO.setId(value.getId());
        valueDTO.setQuote(value.getQuote());

        return valueDTO;
    }
}
