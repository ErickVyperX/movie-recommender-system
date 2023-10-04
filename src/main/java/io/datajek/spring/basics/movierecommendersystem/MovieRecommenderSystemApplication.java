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

        //SINGLETON SCOPE
        CollaborativeFilter collaborativeFilter1 = applicationContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter collaborativeFilter2 = applicationContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter collaborativeFilter3 = applicationContext.getBean(CollaborativeFilter.class);

        System.out.println(collaborativeFilter1);
        System.out.println(collaborativeFilter2);
        System.out.println(collaborativeFilter3);
        
        //PROTOTYPE SCOPE
        ContentBasedFilter contentBasedFilter1 = applicationContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter contentBasedFilter2 = applicationContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter contentBasedFilter3 = applicationContext.getBean(ContentBasedFilter.class);

        System.out.println(contentBasedFilter1);
        System.out.println(contentBasedFilter2);
        System.out.println(contentBasedFilter3);

    }
}
