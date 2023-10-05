package io.datajek.spring.basics.movierecommendersystem.otherpackage;

import org.springframework.beans.factory.annotation.Qualifier;
import javax.inject.Named;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    private static int instances = 0;
    public CollaborativeFilter() {
        instances++;
        System.out.println("ContentBasedFilter created!");
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Shrek", "Toy Story", "Mulan"};
    }
}
