package cn.mobilemd.himalayatrain.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloApi{

    @RequestMapping(value="/{name}", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE )
//    @ApiOperation(value="测试", notes="note:this is 测试，当返回hello world时说明api可以用了")
//    @ApiImplicitParam(name = "name", value = "你的姓名", dataType = "String")
    public String Hello(@PathVariable String name){
        if(name == null) return "请输入你的姓名";
        String ret =String.format("hello world, %s",name);
        return ret;
    }
}
