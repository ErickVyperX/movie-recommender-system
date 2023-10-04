package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter collaborativeFilter; //Matching ObjectName with BeanName, but ContentBasedFilter is @Primary

    public RecommenderImplementation(Filter collaborativeFilter) {
        super();
        this.collaborativeFilter = collaborativeFilter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter Name: " + collaborativeFilter.getClass().getSimpleName());
        return collaborativeFilter.getRecommendations(movie);
    }
}
