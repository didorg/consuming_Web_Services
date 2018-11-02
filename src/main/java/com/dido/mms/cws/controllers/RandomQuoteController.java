package com.dido.mms.cws.controllers;

import com.dido.mms.cws.api.ResultDTO;
import com.dido.mms.cws.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomQuoteController {

    @Autowired
    ResultService resultService;

    @RequestMapping(value = "/random")
    public ResultDTO getRandomQuotes(@RequestParam(value = "name", defaultValue = "enter param -> ?name=value") String name){
        return this.resultService.getResultDTO(name);
    }
}
