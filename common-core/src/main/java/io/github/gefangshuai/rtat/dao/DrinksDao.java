package io.github.gefangshuai.rtat.dao;

import io.github.gefangshuai.rtat.model.*;
import io.github.gefangshuai.server.core.persistence.CoreDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * Created by gefangshuai on 2015/11/13.
 */
public interface DrinksDao extends CoreDao<Drinks, Long> {
    Page<Drinks> findByRestaurantAndNameLike(Restaurant restaurant, String name, Pageable pageable);

    Page<Drinks> findByRestaurantAndDrinksTypeAndNameLike(Restaurant restaurant, DrinksType drinksType, String name, Pageable page);
}
