package com.zurnachyan.spring.repositories;

import com.zurnachyan.entity.view.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepsitory extends JpaRepository<Image, Long> {
}
