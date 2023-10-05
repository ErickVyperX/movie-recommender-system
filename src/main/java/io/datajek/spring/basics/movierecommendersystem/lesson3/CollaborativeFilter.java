package io.datajek.spring.basics.movierecommendersystem.lesson3;


import io.datajek.spring.basics.movierecommendersystem.otherpackage.Filter;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Shrek", "Toy Story", "Mulan"};
    }
}
