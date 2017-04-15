package cn.mobilemd.himalayatrain.api;

import cn.mobilemd.himalayatrain.dto.citys.GetCityResponse;
import cn.mobilemd.himalayatrain.model.bo.CityBo;
import cn.mobilemd.himalayatrain.service.ICityService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityApi {

    @Autowired
    private ICityService cityService;


    @RequestMapping(value="/city", method= RequestMethod.GET )
    @ApiOperation(value="city", notes="获取某个城市信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="id",dataType="Long",required=true,value="姓名",defaultValue="1")
    })
    public GetCityResponse GetCity(@RequestParam(value = "id", required = true) Long id) {
        GetCityResponse response=new GetCityResponse();
        CityBo city = cityService.getCity(id);
        if(city !=null){
            response.setData(city);
            response.setCode(200);
            return response;
        };
        response.setMessage(String.format("没有id为 %s 的城市", id));
        response.setCode(415);
        return response;
    }

//    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
//    public City findOneCity(@PathVariable("id") Long id) {
//        return cityService.findCityById(id);
//    }
//
//    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
//    public void createCity(@RequestBody City city) {
//        cityService.saveCity(city);
//    }
//
//    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
//    public void modifyCity(@RequestBody City city) {
//        cityService.updateCity(city);
//    }
//
//    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
//    public void modifyCity(@PathVariable("id") Long id) {
//        cityService.deleteCity(id);
//    }
}
