package io.datajek.spring.basics.movierecommendersystem.otherpackage;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {
    private static int instances = 0;

    private int id;
    private String name;
    private String gender;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Movie created!");
    }

    public static int getInstances() {
        return Movie.instances;
    }
}
