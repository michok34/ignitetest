package io.choquet.project.persistence.cache;

import io.choquet.project.model.User;
import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;


@RepositoryConfig(cacheName = "UserCache")
public interface UserRepository extends IgniteRepository<User, Long> {
}
