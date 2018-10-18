package com.v1as.cloud.mainapp.controller;

import com.v1as.cloud.mainapp.dao.Entity1Dao;
import com.v1as.cloud.mainapp.model.Entity1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ivlasishen on 18.10.2018.
 */
@RestController("/api/v1/entity1")
public class Entity1Controller {

    @Autowired
    private Entity1Dao entity1Dao;

    @GetMapping
    public List<Entity1> getAll(){
        return entity1Dao.findAll();
    }

}
