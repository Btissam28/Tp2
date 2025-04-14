package org.example.tp2scolarite.repository;

import org.example.tp2scolarite.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepository extends JpaRepository<Category, Long> {
}
