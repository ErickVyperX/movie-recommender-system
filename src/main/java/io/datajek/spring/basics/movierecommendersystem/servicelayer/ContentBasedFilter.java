package io.datajek.spring.basics.movierecommendersystem.servicelayer;

import io.datajek.spring.basics.movierecommendersystem.repositorylayer.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("contentBasedFilter")
public class ContentBasedFilter implements Filter {

    @Autowired
    private Movie movie;
    public ContentBasedFilter() {
        System.out.println("ContentBasedFilter created!");
    }

    public Movie getMovie() {
        return movie;
    }

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
