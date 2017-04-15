package cn.mobilemd.himalayatrain.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * log4j api:https://logging.apache.org/log4j/2.0/manual/api.html
 */
@RestController
@Api("hello相关api")
public class HelloApi{

    private  final Logger logger = LogManager.getLogger(HelloApi.class);

    @RequestMapping(value="/hello", method= RequestMethod.GET )
    @ApiOperation(value="测试", notes="note:this is 测试，当返回hello world时说明api可以用了")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="name",dataType="String",required=true,value="姓名",defaultValue="jerrymiao")
              })
    public String Hello(@RequestParam("name") String name){
        if(name == null) return "请输入你的姓名";
        String ret =String.format("hello world, %s",name);
        logger.info(ret);
        return ret;
    }
}
