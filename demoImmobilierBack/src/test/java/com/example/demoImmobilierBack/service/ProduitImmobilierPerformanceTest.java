package com.example.demoImmobilierBack.service;

import static org.junit.Assert.assertThat;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demoImmobilierBack.dto.ProduitImmobilierDTO;
import com.example.demoImmobilierBack.model.ProduitImmobilier;
import com.example.demoImmobilierBack.repository.ProduitImmobilierRepository;

import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.SECONDS;;

@RunWith(SpringRunner.class)
public class ProduitImmobilierPerformanceTest {
 
    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public ProduitImmobilierService produitImmobilierService() {
            return new ProduitImmobilierServiceImpl();
        }
    }
 
    @Autowired
    private ProduitImmobilierService produitImmobilierService;
 
    @MockBean
    private ProduitImmobilierRepository repository;
    
    Logger logger = LoggerFactory.getLogger(ProduitImmobilierPerformanceTest.class);
    
    private int page = 2;
    private int pageSize = 20;
    private int[] limit = {50,500,5000,50000};
    private int limit1 = 50;
 
    // write test cases here
    @Test
    public void test_Performance_Java5_method_against_Java8_method_For_50_element_in_list() {
    	for (int j = 0; j<limit.length; j++) {
    		limit1 = limit[j];
	    	List<ProduitImmobilierDTO> result = new ArrayList<ProduitImmobilierDTO>();
	    	List<ProduitImmobilier> listProduitImmobilier = new ArrayList<ProduitImmobilier>();
	    	for (int i = 0; i< this.limit1; i++) {
	    		listProduitImmobilier.add(new ProduitImmobilier());
	    	}
	    	LocalTime time1 = LocalTime.now();
	    	ArrayList<ProduitImmobilier> subListProduitImmobilier1 = new ArrayList<ProduitImmobilier>(listProduitImmobilier.subList((page-1)*pageSize, page*pageSize));
	    	LocalTime time2 = LocalTime.now();
	    	List<ProduitImmobilier> subListProduitImmobilier2 = listProduitImmobilier.subList((page-1)*pageSize, page*pageSize);
	    	LocalTime time3 = LocalTime.now();
	    	
	    	List<ProduitImmobilierDTO> result1 = listProduitImmobilier.stream().skip((page-1)*pageSize-1).limit(pageSize).map(p -> produitImmobilierService.convertProduitImmobilierToProduitImmobilierDTO(p, listProduitImmobilier.size())).collect(Collectors.toList());
	    	LocalTime time4 = LocalTime.now();
	    	for (int i = (page-1)*pageSize ; i < page*pageSize; i++) {
	    		result.add(produitImmobilierService.convertProduitImmobilierToProduitImmobilierDTO(listProduitImmobilier.get(i), listProduitImmobilier.size()));
	    	}
	    	LocalTime time5 = LocalTime.now();
	    	logger.info("Time consumed to construct a new ArrayList sublist for "+limit1+" elements in the list is= "+Math.floor(SECONDS.between(time1, time2))+" seconds, "+(MILLIS.between(time1, time2)-(Math.floor(SECONDS.between(time1, time2))*1000))+" ms");
	    	logger.info("Time consumed to  sublist for "+limit1+" elements in the list is= "+Math.floor(SECONDS.between(time2, time3))+" seconds, "+(MILLIS.between(time2, time3)-(Math.floor(SECONDS.between(time2, time3))*1000))+" ms");
	    	logger.info("Time consumed to construct a new List of DTO with Java 8, with "+limit1+" elements in the list is= "+Math.floor(SECONDS.between(time3, time4))+" seconds, "+(MILLIS.between(time3, time4)-(Math.floor(SECONDS.between(time3, time4))*1000))+" ms");
	    	logger.info("Time consumed to construct a new List of DTO with Java 5, with "+limit1+" elements in the list is= "+Math.floor(SECONDS.between(time4, time5))+" seconds, "+(MILLIS.between(time4, time5)-(Math.floor(SECONDS.between(time4, time5))*1000))+" ms");
	    	//Mockito.when(((OngoingStubbing) repository.findAll()).thenReturn(listProduitImmobilier));
	    	Assert.assertTrue(subListProduitImmobilier1.size() == 20);
	    	Assert.assertTrue(subListProduitImmobilier2.size() == 20);
	    	Assert.assertTrue(result1.size() == 20);
	    	Assert.assertTrue(result.size() == 20);
    	}
     }
}