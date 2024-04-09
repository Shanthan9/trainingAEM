package com.training.learning.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NavigationComponent {
    @OSGiService
    private SlingHttpServletRequest request;

    @SlingObject
    private Resource currentResource;
    @SlingObject
    private ResourceResolver resourceResolver;

    @ValueMapValue
    private String[] patharray;

    List<String> list = new ArrayList();



    @PostConstruct
    protected void init() {

        for (int i = 0; i < patharray.length; i++) {
            Resource resource = resourceResolver.getResource(patharray[i]+"/jcr:content");
            ValueMap properties = resource.getValueMap();

            String pageTitle = properties.get("jcr:title", String.class);

            list.add(pageTitle);
        }
    }

    public String[] getPatharray() {
        return patharray;
    }

    public List<String> getList() {
        return list;
    }

}
