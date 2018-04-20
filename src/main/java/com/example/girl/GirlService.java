package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    //数据库事务的操作，用于同时操作多条数据，
    // 成功则一起执行，若不成功则一起失败，只有查询不需要加事务
    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setSize("l");
        girlA.setAge(17);
        girlRepository.save(girlA);

        Girl girlB=new Girl();
        girlB.setSize("mmm");
        girlB.setAge(16);
        girlRepository.save(girlB);
    }

}
