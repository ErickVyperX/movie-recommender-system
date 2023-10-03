package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter{
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Shrek", "Toy Story", "Mulan"};
    }
}
