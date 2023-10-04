package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary @Component     //2 bean type Filter, but Primary is the priority
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
