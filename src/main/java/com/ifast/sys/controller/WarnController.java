package com.ifast.sys.controller;

import com.ifast.common.annotation.Log;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lik
 */

@RequestMapping("/sys")
@Controller
public class WarnController {
    String prefix = "sys/warn";

    @RequiresPermissions("sys:warn:warn")
    @Log("进入报警管理页面")
    @GetMapping("/warn")
    public String warn(){
        return prefix+"/warn";
    }

}
