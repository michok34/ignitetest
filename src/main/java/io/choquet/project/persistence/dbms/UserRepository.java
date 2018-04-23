package io.choquet.project.persistence.dbms;

import io.choquet.project.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
