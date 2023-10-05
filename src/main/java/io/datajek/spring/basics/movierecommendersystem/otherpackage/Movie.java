package io.datajek.spring.basics.movierecommendersystem.otherpackage;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import javax.inject.Named;

@Named
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static final int instances = 0;
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
