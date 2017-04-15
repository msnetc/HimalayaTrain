package cn.mobilemd.himalayatrain.service;


import cn.mobilemd.himalayatrain.dao.CityDao;
import cn.mobilemd.himalayatrain.model.bo.CityBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CityService  implements ICityService {

    @Autowired
    private CityDao CityDao;

    public CityBo getCity(long id) {
        CityBo city = CityDao.getCity(id);
        return city;
    }


}
