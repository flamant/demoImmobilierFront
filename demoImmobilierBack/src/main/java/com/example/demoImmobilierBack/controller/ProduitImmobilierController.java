package com.example.demoImmobilierBack.controller;



import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demoImmobilierBack.dto.DossierSimulationDTO;
import com.example.demoImmobilierBack.dto.ProduitImmobilierDTO;
import com.example.demoImmobilierBack.dto.Search;
import com.example.demoImmobilierBack.model.DBFile;
import com.example.demoImmobilierBack.model.DossierSimulation;
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
    
    @RequestMapping(value = "/produitimmobilier/save",
    method = RequestMethod.POST)
    @ResponseBody
    public ProduitImmobilierDTO saveProduitImmobilier(@RequestBody ProduitImmobilierDTO produitImmobilierDto){
    	logger.info("CONTROLLER PRODUITIMMOBILIERSERVICE CA PASSE");
    	ProduitImmobilierDTO result = produitImmobilierService.save(produitImmobilierDto);
    	return result;
    }
    
    @RequestMapping(value = "/audit/dossier/{id}",
    method = RequestMethod.GET)
//    produces = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE},
//    consumes = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public DossierSimulationDTO findOne(@PathVariable("id") int id){
    	return produitImmobilierService.findDossierSimulationById(id);
    }
    
    @RequestMapping(value="/produitimmobilier/uploadFiles", method = RequestMethod.POST)
	public ResponseEntity<Void> uploadFiles(@RequestParam("document") List<MultipartFile> multipartFile, @RequestParam("id") Long id)
	{
    	logger.info("CONTROLLER UPLOADFILES CA PASSE");
    	logger.info("MULTIPARTFILE.size="+multipartFile.size()+"  id="+id);
    	DBFile[] files = new DBFile[multipartFile.size()];
    	int i = 0;
		try {
 
 
			for(MultipartFile mf: multipartFile)
			{
				String fileName = StringUtils.cleanPath(mf.getOriginalFilename());
				logger.info("fileName="+fileName);
				DBFile dbFile = new DBFile(fileName, mf.getContentType(), mf.getBytes());
				files[i] = dbFile;
				i++;
			}
			produitImmobilierService.uploadFiles(files, id);
 
		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
 
		return ResponseEntity.ok().build();
	}


}