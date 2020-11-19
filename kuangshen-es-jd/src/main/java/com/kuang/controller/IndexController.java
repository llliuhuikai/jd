package com.kuang.controller;

import com.kuang.domain.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "空调")
@RestController
@RequestMapping("/api1")
public class IndexController {
    @GetMapping("/{id}")
    @ResponseBody
    @ApiOperation(value = "增加空调")
    public List<Map<String, Object>> index(@PathVariable("id") String id ){
        //Student student=new Student("张三","20");
        Map<String,Object> map=new HashMap();Map<String,Object> map2=new HashMap();
        List<Map<String,Object>> list=new ArrayList<>();
        map.put("name","张三");
        System.out.println(map);
        map.put("age",30);map2.put("name","李四");
        map2.put("age",33);
        list.add(map2);
        list.add(map);
        return list;

    }
}
