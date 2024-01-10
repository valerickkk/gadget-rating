package com.zurnachyan.gadrat.spring.repositories;

import com.zurnachyan.gadrat.entity.gadget.BaseWatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchRepository extends JpaRepository<BaseWatch, Long> {
}
