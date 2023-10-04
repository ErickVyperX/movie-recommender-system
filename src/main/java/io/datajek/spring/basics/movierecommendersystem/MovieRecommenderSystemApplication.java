package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lesson3.CollaborativeFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson3.ContentBasedFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        ContentBasedFilter cbf1 = applicationContext.getBean(ContentBasedFilter.class);
        System.out.println("ContentBasedFilter with Singleton scope \n " + cbf1);

        Movie movie1 = cbf1.getMovie();
        Movie movie2 = cbf1.getMovie();
        Movie movie3 = cbf1.getMovie();

        System.out.println("Movie with Prototype scope");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);

        System.out.println(ContentBasedFilter.getInstances());
        System.out.println(Movie.getInstances());

    }
}
