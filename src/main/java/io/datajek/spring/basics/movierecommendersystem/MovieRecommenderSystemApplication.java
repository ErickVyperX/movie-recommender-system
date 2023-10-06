package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.otherpackage.CollaborativeFilter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        //check the beans which have been loaded
        System.out.println("Beans loaded...");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        //retrieve bean from the application context
        System.out.println(applicationContext.getBean("collaborativeFilter", CollaborativeFilter.class));

        ////call method to get recommendations and verify autowiring
        System.out.println(Arrays.toString(applicationContext.getBean(CollaborativeFilter.class).getRecommendations("Finding Dory")));
        applicationContext.close();
    }
}
