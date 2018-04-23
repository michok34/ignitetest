package io.choquet.project;

import io.choquet.project.config.SpringAppConfig;
import io.choquet.project.model.User;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan({"io.choquet.project"})
@EnableJpaRepositories({"io.choquet.project.persistence.cache"})
@EntityScan({"io.choquet.project.model"})
public class AppRunner {

    public static void main(String[] args) throws Exception {

//        SpringApplication app = new SpringApplication(AppRunner.class);
//        app.r
//        app.run(args);
//        AnnotationConfigEmbeddedWebApplicationContext ctx = new AnnotationConfigEmbeddedWebApplicationContext();
//        ctx.register(SpringAppConfig.class);
//        ctx.refresh();


        SpringApplication.run(AppRunner.class, args);
    }
}
