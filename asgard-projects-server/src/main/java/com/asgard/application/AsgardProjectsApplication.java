package com.asgard.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.asgard.application.backend.DatabaseBackend;
import com.asgard.application.resource.TestResource;

/**
 * Main entry point to the asgard-projects API server.
 */
public final class AsgardProjectsApplication extends Application<AsgardProjectsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new AsgardProjectsApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<AsgardProjectsConfiguration> bootstrap) {

    }

    @Override
    public void run(final AsgardProjectsConfiguration configuration, final Environment environment) {
        DatabaseBackend databaseBackend = configuration.getDatabaseBackend(environment);

        environment.jersey().register(new TestResource());
    }
}
