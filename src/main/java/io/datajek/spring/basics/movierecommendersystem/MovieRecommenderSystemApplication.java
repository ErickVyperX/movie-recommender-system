package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.otherpackage.RecommenderImplementation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);

        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(Arrays.toString(recommender.recommendMovies("Finding Dory")));
        applicationContext.close();
    }
}
