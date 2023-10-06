package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.servicelayer.RecommenderImplementation;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;

@PropertySource("classpath:application.properties")
@Configuration("recommender.implementation.favoriteMovie")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        //Beans instanced
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        //retrieve bean from the application context
        System.out.println(applicationContext.getBean(RecommenderImplementation.class));

        //Verify Autowiring
        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(recommender.getFavoriteMovie());
        System.out.println(Arrays.toString(recommender.recommendMovies("recommender.implementation.favoriteMovie")));
    }
}
