package com.training.learning.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(
        adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,resourceType = SliderModel.RESOURCE_TYPE,cache = true
)
@Exporter(name="jackson",extensions = "json")

public class SliderModel {

    public final static String RESOURCE_TYPE = "/apps/training/components/sliderslingmodel";

    @ChildResource
    private List<SliderProps1> sliderProps1;

    @ChildResource
    private List<SliderProps2> sliderProps2;

    public List<SliderProps1> getSliderProps1() {
        return sliderProps1;
    }

    public List<SliderProps2> getSliderProps2() {
        return sliderProps2;
    }

}
