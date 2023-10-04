package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

@Component  //1 bean type Filter
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Shrek", "Toy Story", "Mulan"};
    }
}
