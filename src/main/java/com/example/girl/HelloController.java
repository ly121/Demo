package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

//RestController==Controller+Response
@RestController
@RequestMapping(value = "hello")
public class HelloController {
    //@RequestMapping:url映射

    //@RequestMapping(value="/say/{id}",method=RequestMethod.GET)==@GetMapping(value="/say")
    // 访问的url格式是：http://localhost:8080/hello/say/100 获取id的方式是：@PathVariable("id")
    // public String say(@PathVariable("id") Integer myId ){
    //    return girlProperties.getSize()+girlProperties.getAge();
    //    return "id:"+myId;
    // }

    // @RequestMapping(value="/say",method=RequestMethod.GET)==@GetMapping(value="/say")
    // 访问的url格式是：http://localhost:8080/hello/say？id=100 获取id的方式是：@RequestParam("id")
    //required = false,defaultValue ="0" id默认是0，就算不传值也是id=0而不是null.
    @GetMapping(value="/say")
    public String say(@RequestParam(value="id",required = false,defaultValue ="0") Integer myId ){
        //return girlProperties.getSize()+girlProperties.getAge();
        return "id:"+myId;
    }

    @Autowired
    private GirlProperties girlProperties;
//    @Value("${age}")
//    private Integer age;
//    @Value("${size}")
//    private String size;
//    @Value("${content}")
//    private String content;
}
