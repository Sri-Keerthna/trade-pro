package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class StockController {

	@Autowired
	StockRepository stockRepository;
	
	@Autowired
	BuyerRepository buyerRepository;
	
	 @RequestMapping("/getAll")
	    public Iterable<Stock> getAllStocks() {
		 	 return stockRepository.findAll();		
		 
	 }
	 
	 @RequestMapping("/getById/{stockid}")
	    public Optional<Stock> getStockById(@PathVariable int stockid) {
		return stockRepository.findById(stockid);
	 }
	 
	 @RequestMapping("/getByBuyerId/{buy_id}")
	    public Optional<Buyer> getStockByBuyerId(@PathVariable int buy_id) {
		return buyerRepository.findById(buy_id);
	 }
	 
	 @RequestMapping("/buyStock")
	  public String BuyStockById(Stock stock) {
	
																				
		}
//
//	
//	 
//	 @RequestMapping(value="/saveBuy",method = RequestMethod.POST)    
//	    public String saveBuy(@ModelAttribute("order") Order order){    
//		 stockService.save(order);    
//	        return "redirect:/buyStock";   
//	    }    
//	 @RequestMapping("/getStockById")
//	    public ModelAndView getStockbyID(ModelAndView model, @ModelAttribute User user) {
//				 model.setViewName("StockById");
//		 return model;
//	    }
}