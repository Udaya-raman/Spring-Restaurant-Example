package com.example.demo.RestaurantExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant saveRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }
    public void deleteRestaurant(Long id){
        restaurantRepository.deleteById(id);
    }
}
