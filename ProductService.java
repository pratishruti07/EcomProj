package com.sboot.Ecom.service;
    import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.sboot.Ecom.dao.ProductDao;
import com.sboot.Ecom.model.Product;

import java.util.*;

	@Service
	public class ProductService {
	       @Autowired
	     private ProductDao  ProductDao;
	       
	       
	       public List<Product> saveProduct(List<Product> products) {
	    	   return ProductDao.saveAll(products);
	       }
	       
	       
	       public List<Product> getProductDao(){
	    	   return ProductDao.findAll();
	       }
	       
	       
	       public Product getProduct(int prodId) {
	       	return  ProductDao.findById(prodId).get();
	       }
	       
	       public Product getProduct(String prodName){
		       	return  ProductDao.findByName(prodName).get();
		       }
	   	
	   
	       
	       public String deleteProduct(int prodId) {
	    	    ProductDao.deleteById(prodId); 
	    	    return "item deleted" + prodId;
	       }
	       
	       public Product updateProduct(Product product ) {
	    	  Product extProduct= ProductDao.findById(product.getProdId()).get();
	    	   extProduct.setProdName(product.getProdName());
	    	   extProduct.setProdImage(product.getProdImage());
	    	   extProduct.setProdDesc(product.getProdDesc());
	    	   extProduct.setProdPrice(product.getProdPrice());
	    	   extProduct.setProdStock(product.getProdStock());
	    	   
	    	   return ProductDao.save( extProduct);
	       }
	       }





