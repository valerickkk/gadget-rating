package com.zurnachyan.gadrat.spring.repositories;

import com.zurnachyan.gadrat.entity.view.GadgetImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepsitory extends JpaRepository<GadgetImage, Long> {
}
