package cn.mobilemd.himalayatrain.api;

import cn.mobilemd.himalayatrain.businessmodel.CityBo;
import cn.mobilemd.himalayatrain.dto.citys.CityDto;
import cn.mobilemd.himalayatrain.dto.citys.CreateCity;
import cn.mobilemd.himalayatrain.dto.citys.GetCityResponse;
import cn.mobilemd.himalayatrain.service.ICityService;
import io.swagger.annotations.*;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityApi {

    @Autowired
    private ICityService cityService;

    @Autowired
    DozerBeanMapper mapper;

    @RequestMapping(value="/api/city/getcity", method= RequestMethod.GET )
    @ApiOperation(value="获取某个城市信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="id",dataType="Long",required=true,value="姓名",defaultValue="1")
    })
    public GetCityResponse GetCity(@RequestParam(value = "id", required = true) Long id) {
        GetCityResponse response=new GetCityResponse();
        CityBo city = cityService.getCity(id);
        CityDto cityDto=CityBoToDto(city);
        if(city !=null){
            response.setData(cityDto);
            response.setCode(200);
            return response;
        };
        response.setMessage(String.format("没有id为 %s 的城市", id));
        response.setCode(415);
        return response;
    }

    @RequestMapping(value = "/api/city/createcity", method = RequestMethod.POST)
    @ApiOperation(value = "创建城市")
    @ApiResponses(value = { @ApiResponse(code = 405, message = "invalid input") })
    public int createCity(@RequestBody CreateCity city) {
        CityBo item = cityDtoToBo(city);
        int ret=cityService.createCity(item);
        return ret;
    }

    private CityBo cityDtoToBo(CreateCity city){
        CityBo dest = mapper.map(city, CityBo.class);
        return dest;
    }

    private CityDto CityBoToDto(CityBo item){
        CityDto dest = mapper.map(item, CityDto.class);
        return dest;
    }

}
