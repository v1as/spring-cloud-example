package com.v1as.cloud.mainapp.dao;

import com.v1as.cloud.mainapp.model.Entity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ivlasishen on 18.10.2018.
 */
@Repository
public interface Entity1Dao  extends JpaRepository<Entity1, Long> {

}
