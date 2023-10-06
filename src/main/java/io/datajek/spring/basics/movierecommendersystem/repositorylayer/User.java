package io.datajek.spring.basics.movierecommendersystem.repositorylayer;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class User {
    private int id;
    private String name;
    private List<Movie> history;

    public User() {
        System.out.println("User created!");
    }

}
