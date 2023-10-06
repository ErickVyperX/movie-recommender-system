package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.otherpackage.RecommenderImplementation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        //Beans instanced
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        //retrieve bean from the application context
        System.out.println(applicationContext.getBean("recommenderImpl", RecommenderImplementation.class));

        System.out.println(applicationContext.getBean(RecommenderImplementation.class).getFilter());
    }
}
