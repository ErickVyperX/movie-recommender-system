package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lesson2.CollaborativeFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson2.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson2.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation contentBasedFilter = new RecommenderImplementation(new ContentBasedFilter());
        System.out.println(Arrays.toString(contentBasedFilter.recommendMovies("Finding Dory")));
        RecommenderImplementation collaborativeFilter = new RecommenderImplementation(new CollaborativeFilter());
        System.out.println(Arrays.toString(collaborativeFilter.recommendMovies("Madagascar")));
    }
}
