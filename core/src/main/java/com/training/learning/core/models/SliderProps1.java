package com.training.learning.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SliderProps1 {

    @ValueMapValue
    private String title1;

    @ValueMapValue
    private String details1;

    public String getTitle1() {
        return title1;
    }

    public String getDetails1() {
        return details1;
    }

}
