package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    private Filter filter;
    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter invoked");
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter Name: " + filter.getClass().getSimpleName());
        return filter.getRecommendations(movie);
    }
}
