package io.datajek.spring.basics.movierecommendersystem.servicelayer;

public interface Filter {
    String[] getRecommendations(String movie);

}
