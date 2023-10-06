package io.datajek.spring.basics.movierecommendersystem.otherpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

    public void postConstruct() {
        //initialization code goes here
    }

    public void preDestroy() {
        //cleanup code
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter Name: " + filter.getClass().getSimpleName());
        return filter.getRecommendations(movie);
    }
}
