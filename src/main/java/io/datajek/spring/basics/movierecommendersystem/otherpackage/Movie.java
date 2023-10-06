package io.datajek.spring.basics.movierecommendersystem.otherpackage;

public class Movie {
    private static int instances = 0;
    private int id;
    private String name;
    private String gender;
    private String producer;

    public Movie() {
        super();
    }

    private void postConstruct() {
        //initialization code
    }

    private void preDestroy() {
        //cleanup code
    }

    public static int getInstances() {
        return Movie.instances;
    }
}
