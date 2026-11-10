package com.example.ecommerce.repositories;

import com.example.ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositary extends JpaRepository<Category, Long> {
}
