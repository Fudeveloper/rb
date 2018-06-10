package com.ifast.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 设备管理相关页面
 * @author lik
 */

@RequestMapping("/device")
@Controller
public class DeviceController {
    String prefix = "/device";


    @GetMapping("/monitor")
    public String monitor(){
        return prefix+"/monitor";
    }

    @GetMapping("/baseinfo")
    public String baseinfo(){
        return prefix+"/baseinfo";
    }

    @GetMapping("/report")
    public String report(){
        return prefix+"/report";
    }
}
