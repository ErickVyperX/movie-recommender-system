package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lesson3.RecommenderImplementation;
import io.datajek.spring.basics.movierecommendersystem.lesson3.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Constructor Injection
        RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
        String[] recommendations = recommenderImplementation.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(recommendations));

        //Setter Injection
        RecommenderImplementation2 recommenderImplementation2 = applicationContext.getBean(RecommenderImplementation2.class);
        String[] recommendations2 = recommenderImplementation2.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(recommendations2));
    }
}
