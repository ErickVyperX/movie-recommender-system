package io.datajek.spring.basics.movierecommendersystem.otherpackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named @Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    private static int instances = 0;

    @Autowired
    private Movie movie;
    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter created!");
    }

    public void postConstruct() {
        //initialization code goes here
    }

    private void preDestroy() {
        //clear movies from cache
    }

    @Lookup
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return instances;
    }

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
