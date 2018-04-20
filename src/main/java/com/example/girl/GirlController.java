package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }
    /**
     *add一个女生
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("size") String size,
                          @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setSize(size);
        girl.setAge(age);
        return  girlRepository.save(girl);
    }
    /**
     * 通过id查询一个女生
     */
    @GetMapping(value = "/girls/{id}")
    public Girl selectGirl(@PathVariable(value = "id") Integer id
    ){
      return girlRepository.findOne(id);
    }
    /**
     * 通过年龄查询女生列表,此处应该避免映射重复问题，
     * /girls/18可能是id,也可能是age,
     * 所以要区分开,url改为/girls/age
     */
    @GetMapping(value = "/girls/age{age}")
    public List<Girl> girlListByAge(@PathVariable(value = "age") Integer age){
        return girlRepository.findByAge(age);
    }
    /**
     * 更新
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable(value = "id") Integer id,
                           @RequestParam("size") String size,
                           @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setSize(size);
        girl.setAge(age);
        return girlRepository.save(girl);
    }
    /**
     * 删除
     **/
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable(value = "id") Integer id){
         girlRepository.delete(id);
    }
    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }

}
