package in.delshad.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.delshad.binding.Product;

@RestController

/* @RequestMapping(path = "/xml-output", produces = "application/xml") */
 
public class ProductRestController {
	//below method returning product data in json formate coz bydefualt restapi convert 
	// in json formate coz we dont specify any producess nither we perform marshling to 
	//convert in xml formate
	@GetMapping("/product")
	public ResponseEntity<Product> getProduct(){
		
		Product productObj=new Product();
		productObj.setPId(101);
		productObj.setPName("Samsung");
		productObj.setPrice(5000.00);
		return new ResponseEntity<>(productObj,HttpStatus.OK);
		
	}
	@GetMapping(value="/productDtls",produces = {"application/xml", "application/json"})
	public ResponseEntity<Product>getProductDetls(){
		
		Product productObj=new Product();
		productObj.setPId(101);
		productObj.setPName("Realme");
		productObj.setPrice(5000.00);
		return new ResponseEntity<>(productObj,HttpStatus.OK);
	}
	
	/*
	 * @RequestMapping(value="/getProductList",method =
	 * RequestMethod.GET,consumes=MediaType.ALL_VALUE, produces =
	 * {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}) public
	 * ResponseEntity<List<Product>> getListOfProduct(){ Product p1=new
	 * Product(101,"Hindi",200.00); Product p2=new Product(102,"English",300.00);
	 * List<Product> asList = Arrays.asList(p1,p2); return new
	 * ResponseEntity<>(asList,HttpStatus.OK);
	 * 
	 * }
	 */
}
