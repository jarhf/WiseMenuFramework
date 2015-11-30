package io.github.gefangshuai.rtat.dao;

import io.github.gefangshuai.rtat.model.Food;
import io.github.gefangshuai.server.core.persistence.CoreDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * Created by gefangshuai on 2015/11/13.
 */
public interface FoodDao extends CoreDao<Food, Long> {
    Page<Food> findByNameLike(String name, Pageable pageable);
}
