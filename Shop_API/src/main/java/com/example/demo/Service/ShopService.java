
package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Shop;

public interface ShopService {

	void save(Shop shop);

	void addShop(Shop shop);

	Optional<Shop> getShop(Integer sid);

	List<Shop> getAllShop(Shop shop);

	

	

	void updateShop(Shop shop);

	void deleteShop(Integer sid);

}
