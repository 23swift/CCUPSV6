package com.bdo.ccups.controllers;

import java.util.List;


import com.bdo.ccups.model.Institution;
import com.bdo.ccups.model.Product;
import com.bdo.ccups.repo.InstitutionRepository;
import com.bdo.ccups.repo.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dd")
public class DropDownController {

    @Autowired
    private  ProductRepository productRepo;

    @Autowired
    private InstitutionRepository institutionRepo;

    @GetMapping("products")
    public Iterable<Product> getProducts(){
        Iterable<Product> result = this.productRepo.findAll();
        
        return result;
          
    }
    // @GetMapping("findProductByIstitutionId")
    // public Iterable<Product> getProductsByInstitutionId(@RequestParam(name="Id") Long Id){

    //     Iterable<Product> result= this.institutionRepo.findById(Id).get().getProducts();
    //     return result;
          
    // }
    @GetMapping("institutions")
    public Iterable<Institution> getInstitution(){
        Iterable<Institution> result = this.institutionRepo.findAll();
        
        return result;
          
    }
    
}