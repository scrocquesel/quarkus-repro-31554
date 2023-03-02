package org.acme;

import java.util.Map;
import java.util.Optional;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "svcat")
interface SvcatConfiguration {

    @WithName("class")
    Map<String, ClassConfiguration> classes();

    interface ClassConfiguration {

        String id();

        boolean shared();


        @WithName("plan")
        Map<String, PlanConfiguration> plans();

        interface PlanConfiguration {
            String id();
            Optional<Double> capacity();
        }
    }
}
