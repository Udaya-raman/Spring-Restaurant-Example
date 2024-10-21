package com.example.demo.RestaurantExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;


    @GetMapping
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @PostMapping
    public Restaurant create(@RequestBody Restaurant restaurant){
        return restaurantService.saveRestaurant(restaurant);
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id){
        restaurantService.deleteRestaurant(id);
    }


}
