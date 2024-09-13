package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Shop;
import com.example.demo.Service.ShopService;

@RestController
public class ShopController {
	
	@Autowired
	ShopService ss;
	
	

	@GetMapping("/")
	public String getIt() {
		
		return "Hey buddy my name is Vaibhav !";
	}
	
	@GetMapping("/get")
	public Shop get(Shop shop) {
	
		shop.setSid(11);
		shop.setSname("Thuk");
		shop.setScity("Dholakpur");
		shop.setSmob("8308313970");
	
		ss.save(shop);
		
		return shop;
	}
	
	@PostMapping("/add")
	public String AddShop(@RequestBody Shop shop) {
	
		ss.addShop(shop);
		
		return "Shop Details Added Successfully !";
	}
	
	@GetMapping("/get/{sid}")
	public  Optional<Shop> getShopById(@PathVariable Integer sid) {
		
		return ss.getShop(sid);
	}
	
	@GetMapping("/getAll")
	public List<Shop>  getAll(@RequestBody Shop shop) {
		
		return ss.getAllShop(shop);
		
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Shop shop){
		
		ss.updateShop(shop);
		
		return "Shop Details Updated Successfully !";
		
	}
	
	@DeleteMapping("/delete/{sid}")
	public String delete(@PathVariable Integer sid) {
		
		ss.deleteShop(sid);
		
		return "Shop Details Are Deleted !";
	}
	
	
}
