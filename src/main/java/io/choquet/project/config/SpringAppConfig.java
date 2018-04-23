package io.choquet.project.config;

import io.choquet.project.model.User;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableIgniteRepositories
public class SpringAppConfig {



    @Bean
    public Ignite igniteInstance() {
        IgniteConfiguration cfg = new IgniteConfiguration();
        // Setting some custom name for the node.
        cfg.setIgniteInstanceName("springDataNode");
        // Enabling peer-class loading feature.
        cfg.setPeerClassLoadingEnabled(true);
        // Defining and creating a new cache to be used by Ignite Spring Data
        // repository.
        CacheConfiguration<Long, User> ccfgUser = new CacheConfiguration<>("UserCache");
        // Setting SQL schema for the cache.
        ccfgUser.setIndexedTypes(Long.class, User.class);
        cfg.setCacheConfiguration(ccfgUser);
        return Ignition.start(cfg);
    }

}
