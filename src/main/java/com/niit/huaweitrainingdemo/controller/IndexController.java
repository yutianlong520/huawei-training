package com.niit.huaweitrainingdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: huawei-training-demo
 * @BelongsPackage: com.niit.huaweitrainingdemo.controller
 * @Author: Sky.yu
 * @CreateTime: 2024-10-12  14:01
 * @Description: TODO
 * @Version: 1.0
 */

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "hello world";
    }
}
