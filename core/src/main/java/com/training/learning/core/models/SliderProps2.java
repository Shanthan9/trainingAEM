package com.training.learning.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SliderProps2 {

    @ValueMapValue
    private String title2;

    @ValueMapValue
    private String details2;

    public String getTitle2() {
        return title2;
    }

    public String getDetails2() {
        return details2;
    }

}
