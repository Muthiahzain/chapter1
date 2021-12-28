package com.codingtroops.restaurantsapp.restaurants.domain

import com.codingtroops.restaurantsapp.Restaurant
import com.codingtroops.restaurantsapp.restaurants.data.RestaurantsRepository

class ToggleRestaurantUseCase {
    private val repository = RestaurantsRepository()
    suspend operator fun invoke( id: Int,
                                 oldValue: Boolean): List<Restaurant> {
        val updatedIsFavorite = oldValue.not()
        return repository.toggleFavoriteRestaurant(id, updatedIsFavorite)
    }
}