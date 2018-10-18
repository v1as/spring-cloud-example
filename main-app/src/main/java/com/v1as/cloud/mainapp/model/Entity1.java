package com.v1as.cloud.mainapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 * Created by ivlasishen on 18.10.2018.
 */
@Data
@Entity
public class Entity1 {
    @Id
    private Long id;
}
