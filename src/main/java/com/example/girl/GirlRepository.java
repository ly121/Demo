package com.example.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄查询，返回的值可能有多个要用list,接口的方法只有声明。
    public List<Girl> findByAge(Integer age);

}
