package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

@Controller
public class FormController {
	@Autowired
	CustomerRepo repo;
	
	
	@RequestMapping("/index")
	public String edureka() {
		return "index.html";
	}
	
	@RequestMapping("/details")
	public String details(Customers customers) {
		repo.save(customers);
		return "edureka.jsp";
	}
	
	@PostMapping("/index")
	public String edureka1() {
		return "ayurveda.html";
	}
	
	@RequestMapping("/getdetails")
	public String getdetails() {
		return "ViewCustomerDetail.jsp";
	}
	
	
	@PostMapping("/getdetails")
	public ModelAndView viewdetails(@RequestParam int cid)
 {				ModelAndView mv=new ModelAndView("Retrieve");
 				Customers customers=repo.findById(cid).orElse(null);
 				mv.addObject(customers);
 				return mv;
			
	
		}
	
@RequestMapping("/customers")
@ResponseBody
public java.util.List<Customers> getCustomers() {
	return repo.findAll();
	
}
	

@RequestMapping("/customers/{cid}")
@ResponseBody
public Optional<Customers> getCustomers2(@PathVariable("cid") int cid) {
return repo.findById(cid);

}

@PostMapping("/customers")
public Customers getCustomers3(@RequestBody Customers customers) {
	repo.save(customers);
	return customers;
	
}
	
@DeleteMapping("/customers/{cid}")
public Customers getCustomers4(@PathVariable("cid") int cid){
	Customers cust=repo.getOne(cid);
	repo.delete(cust);
	return cust;
	
}

@PutMapping(path="/customers",consumes= {"application/json"})
public Customers getCustomers5(@RequestBody Customers customers){
	repo.save(customers);
	return customers;
}



}
