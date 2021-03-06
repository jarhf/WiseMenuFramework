package io.github.gefangshuai.rtat.dao;

import io.github.gefangshuai.ext.persistence.CoreDao;
import io.github.gefangshuai.rtat.model.Food;
import io.github.gefangshuai.rtat.model.FoodType;
import io.github.gefangshuai.rtat.model.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Created by gefangshuai on 2015/11/13.
 */
public interface FoodDao extends CoreDao<Food, Long> {
    Page<Food> findByRestaurantAndNameLike(Restaurant restaurant, String name, Pageable pageable);

    Page<Food> findByRestaurantAndFoodTypeAndNameLike(Restaurant restaurant, FoodType foodType, String name, Pageable page);

    List<Food> findByPublishedAndRestaurantAndFoodType(boolean published, Restaurant restaurant, FoodType foodType);

    List<Food> findByPublishedAndRestaurant(boolean published, Restaurant restaurant);

    @Query("from Food where id in (:ids)")
    List<Food> findByIds(@Param("ids") Long[] ids);
}
