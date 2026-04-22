package com.xeniaklimova.shap.repository;

import com.xeniaklimova.shap.entity.Stuff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuffRepository extends JpaRepository<Stuff, String> {
}
