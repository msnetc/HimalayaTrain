package cn.mobilemd.himalayatrain.service;


import cn.mobilemd.himalayatrain.dao.CityDao;
import cn.mobilemd.himalayatrain.model.bo.CityBo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CityService  implements ICityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityService.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private CityDao cityDao;

    public CityBo getCity(long id) {

        ValueOperations<String, CityBo> cityCacheOper = redisTemplate.opsForValue();
        String key=getCityKey(id);

        CityBo city = cityCacheOper.get(key);
        if (city==null) {
            city = cityDao.getCity(id);
            if(city==null) return null;
            cityCacheOper.set(key, city);
            return city;
        }
        return city;
    }

    public int createCity(CityBo city) {
      int ret = cityDao.createCity(city);
      return ret;
    }

    public List<CityBo> findAllCitys() {
        return null;
    }

    private String getCityKey(long id){
        String key =String.format("tmtrain.city.%d", id);
        return key;
    }
}
