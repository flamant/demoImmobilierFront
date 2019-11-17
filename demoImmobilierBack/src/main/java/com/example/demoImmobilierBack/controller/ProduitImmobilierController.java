package com.example.demoImmobilierBack.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoImmobilierBack.dto.DossierPinelDTO;
import com.example.demoImmobilierBack.dto.ProduitImmobilierDTO;
import com.example.demoImmobilierBack.dto.Search;
import com.example.demoImmobilierBack.service.ProduitImmobilierPerformanceTest;
import com.example.demoImmobilierBack.service.ProduitImmobilierService;
import com.example.demoImmobilierBack.service.ProduitImmobilierServiceImpl;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ProduitImmobilierController {
	
	Logger logger = LoggerFactory.getLogger(ProduitImmobilierController.class);

    @Autowired
    private ProduitImmobilierService produitImmobilierService;

    @RequestMapping(value = "/produitimmobilier/all",
    method = RequestMethod.POST
//    ,produces = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE}
//    ,consumes =MediaType.APPLICATION_JSON_VALUE
//    ,consumes ="application/json"
//    ,consumes = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE}

    )
    @ResponseBody
    public Search findAll(@RequestBody Search search){
    	logger.info("CONTROLLER PRODUITIMMOBILIERSERVICE CA PASSE");
    	int page = search.getPage();
    	int pageSize = search.getPageSize();
    	List<ProduitImmobilierDTO> result = produitImmobilierService.findAll(pageSize, page, search);
    	ProduitImmobilierDTO[] array = result.toArray(new ProduitImmobilierDTO[result.size()]);
    	search.setResult(array);
    	return search;
    }
    
    @RequestMapping(value = "/produitimmobilier/{id}",
    method = RequestMethod.GET,
    produces = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE},
    consumes = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public DossierPinelDTO findOne(@PathVariable("id") int id){
    	return produitImmobilierService.findById(id);
    }


}