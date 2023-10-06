package io.datajek.spring.basics.movierecommendersystem.servicelayer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("collaborativeFilter")
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        System.out.println("CollaborativeFilter created!");
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Shrek", "Toy Story", "Mulan"};
    }
}
