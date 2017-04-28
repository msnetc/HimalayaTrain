package cn.mobilemd.himalayatrain.service;


import cn.mobilemd.himalayatrain.businessmodel.CityBo;

/**
 * Created by jerry on 2017/4/15.
 */
public interface ICityService {

    CityBo getCity(long id);

    int createCity(CityBo city);
}
