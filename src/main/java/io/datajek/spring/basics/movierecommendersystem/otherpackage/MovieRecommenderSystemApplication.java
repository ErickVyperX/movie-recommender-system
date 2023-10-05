package io.datajek.spring.basics.movierecommendersystem.otherpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "io.datajek.spring.basics.movierecommendersystem.lesson3")
//@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "io.datajek.spring.basics.movierecommendersystem.otherpackage"))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(recommender);

        //Retrieving prototype bean from application context twice
        Movie m1 = applicationContext.getBean(Movie.class);
        System.out.println(m1);

        Movie m2 = applicationContext.getBean(Movie.class);
        System.out.println(m2);

    }
}
