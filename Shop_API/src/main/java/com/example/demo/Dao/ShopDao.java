package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Shop;
import com.example.demo.Repo.ShopRepo;
import com.example.demo.Service.ShopService;

@Service
public class ShopDao implements ShopService{

	@Autowired
	ShopRepo sr;
	
	@Override
	public void save(Shop shop) {
		// TODO Auto-generated method stub
		
		sr.save(shop);
	}

	@Override
	public void addShop(Shop shop) {
		// TODO Auto-generated method stub
		sr.save(shop);
	}

	@Override
	public Optional<Shop> getShop(Integer sid) {
		// TODO Auto-generated method stub
		 
		return sr.findById(sid);
	}

	@Override
	public List<Shop> getAllShop(Shop shop) {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void updateShop(Shop shop) {
		// TODO Auto-generated method stub
		
		sr.save(shop);
	}

	public void deleteShop(Integer sid) {
		// TODO Auto-generated method stub
		sr.deleteById(sid);
	}

	

}
