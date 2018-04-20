package com.example.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties
{
    private Integer age;
    private String size;

    public Integer getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
