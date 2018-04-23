package io.choquet.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ignite.cache.query.annotations.QuerySqlField;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@QuerySqlField(index = true)
    private Integer id;

    //@QuerySqlField(index = true)
    private String name;

    private String email;

}