package com.dido.cws.controllers;

import com.dido.cws.services.ResultService;
import com.dido.cws.api.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomQuoteController { 
	
    private ResultService resultService;
        
    @Autowired
    public RandomQuoteController(ResultService resultService) {
		this.resultService = resultService;
	}

	@GetMapping(value = "/random")
    public ResultDTO getRandomQuotes(@RequestParam(value = "name", defaultValue = "enter param -> ?name=value") String name){
        return this.resultService.getResultDTO(name);
    }
}
