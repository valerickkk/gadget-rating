package com.zurnachyan.gadrat.spring.repositories;

import com.zurnachyan.gadrat.entity.view.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepsitory extends JpaRepository<Image, Long> {
}
