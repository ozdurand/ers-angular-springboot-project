package com.datajabs.ersproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Autowired
    private EntityManager entityManager;

    public MyDataRestConfig(EntityManager theEntityManager){
        entityManager= theEntityManager;

    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
            //call an internal helper method
            exposeIds(config);
    }

    private void exposeIds(RepositoryRestConfiguration config) {

            //expose entity ids
            //


            //get a list of all entity classes from the entity manager

            Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();

            // create an Array of the entity types

            List<Class> entityClasses = new ArrayList<>();

            // - get entity types for the entities

            for(EntityType tempEntityType : entities) {

                entityClasses.add(tempEntityType.getJavaType());
            }

            // - expose the entity ids for the array of entity/domain types

            Class[] domainTypes = entityClasses.toArray(new Class[0]);
            config.exposeIdsFor(domainTypes);

    }
}
