package com.lry.handler;

import com.lry.service.bumenService.bumenService;
import com.lry.service.studentService.studentService;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.dc.pr.PRError;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author liurenyi
 * @create 2019--12--21--16:44
 */
@Controller
public class handler {
    @Resource
    private studentService studentser;
    @Resource
    private bumenService bumenser;


    @RequestMapping("/selectAll")
    public String selectAll(Map<String,Object> map){
        map.put("list",studentser.selectAll());
        return "index";
    }
}
