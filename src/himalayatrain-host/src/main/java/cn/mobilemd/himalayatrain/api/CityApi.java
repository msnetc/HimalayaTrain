package cn.mobilemd.himalayatrain.api;

import cn.mobilemd.himalayatrain.dto.citys.GetCityResponse;
import cn.mobilemd.himalayatrain.model.bo.CityBo;
import cn.mobilemd.himalayatrain.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityApi {

    @Autowired
    private ICityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
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
}
