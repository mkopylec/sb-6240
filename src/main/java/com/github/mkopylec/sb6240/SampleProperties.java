package com.github.mkopylec.sb6240;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static java.util.Arrays.asList;

@ConfigurationProperties("sample")
public class SampleProperties {

    public static final List<Class<? extends Throwable>> DEFAULT_CLASSES = asList(Exception.class, RuntimeException.class);

    private List<Class<? extends Throwable>> classes = new ArrayList<>(DEFAULT_CLASSES);

    public List<Class<? extends Throwable>> getClasses() {
        return classes;
    }

    public void setClasses(List<Class<? extends Throwable>> classes) {
        this.classes = classes;
    }
}
