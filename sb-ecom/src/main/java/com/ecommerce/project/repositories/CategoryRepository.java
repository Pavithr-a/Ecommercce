package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Cart;
import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(String categoryName);


}
