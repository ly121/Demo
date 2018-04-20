package com.example.girl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity表示该类对应数据库中的一个数据表@GeneratedValue:表示自增
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer age;
    private String size;
    public Girl(){
    }
//没有get()，set()方法在查询女生列表时就就无法获取每个属性的值，返回结果变成[{},{}]
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
