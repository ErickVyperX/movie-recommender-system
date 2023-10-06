package io.datajek.spring.basics.movierecommendersystem.repositorylayer;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    private static final int instances = 0;
    private int id;
    private String name;
    private String gender;
    private String producer;

    public Movie() {
    }

    public static int getInstances() {
        return Movie.instances;
    }
}
