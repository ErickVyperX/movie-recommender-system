package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.otherpackage.Movie;
import io.datajek.spring.basics.movierecommendersystem.otherpackage.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = "io.datajek.spring.basics.movierecommendersystem.lesson3")
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "io.datajek.spring.basics.movierecommendersystem.otherpackage"))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(recommender.getFilter());


    }
}
