package com.zurnachyan.spring.repositories;

import com.zurnachyan.entity.baseentity.gadgets.BaseWatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchRepository extends JpaRepository<BaseWatch, Long> {
}
