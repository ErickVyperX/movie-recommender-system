package io.datajek.spring.basics.movierecommendersystem.otherpackage;


import io.datajek.spring.basics.movierecommendersystem.otherpackage.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
@Qualifier("collaborativeFilter")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Shrek", "Toy Story", "Mulan"};
    }
}
