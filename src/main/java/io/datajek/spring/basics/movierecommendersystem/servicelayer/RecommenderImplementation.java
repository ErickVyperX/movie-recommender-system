package io.datajek.spring.basics.movierecommendersystem.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {
    private Filter filter;

    @Value("${recommender.implementation.favoriteMovie:Finding Dory}")
    private String favoriteMovie;

    @Autowired
    @Qualifier("collaborativeFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter Name: " + filter.getClass().getSimpleName());
        return filter.getRecommendations(movie);
    }
}
