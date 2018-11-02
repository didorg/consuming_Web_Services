package com.dido.mms.cws.api;

import com.dido.mms.cws.constans.Sites;

import java.util.List;

public class ResultDTO {
    private String name;
    private String SIGNATURE = Sites.SIGNATURE;
    private String SITE = Sites.GITHUB;
    List<QuoteDTO> quotes;

    public ResultDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSIGNATURE() {
        return SIGNATURE;
    }

    public void setSIGNATURE(String SIGNATURE) {
        this.SIGNATURE = SIGNATURE;
    }

    public String getSITE() {
        return SITE;
    }

    public void setSITE(String SITE) {
        this.SITE = SITE;
    }

    public List<QuoteDTO> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<QuoteDTO> quotes) {
        this.quotes = quotes;
    }
}
