package io.datajek.spring.basics.movierecommendersystem.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {
    private Filter filter;

    @Autowired
    @Qualifier("collaborativeFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter Name: " + filter.getClass().getSimpleName());
        return filter.getRecommendations(movie);
    }
}
