package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.servicelayer.RecommenderImplementation;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;

@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        //Beans instanced
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        //retrieve bean from the application context
        System.out.println(applicationContext.getBean(RecommenderImplementation.class));

        //Verify Autowiring
        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
        String favMovie = recommender.getFavoriteMovie();
        System.out.println(favMovie);
        System.out.println(Arrays.toString(recommender.recommendMovies(favMovie)));
    }
}
