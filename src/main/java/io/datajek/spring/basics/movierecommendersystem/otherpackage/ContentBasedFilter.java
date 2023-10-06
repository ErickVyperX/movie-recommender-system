package io.datajek.spring.basics.movierecommendersystem.otherpackage;

public class ContentBasedFilter implements Filter {
    private static int instances = 0;

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
