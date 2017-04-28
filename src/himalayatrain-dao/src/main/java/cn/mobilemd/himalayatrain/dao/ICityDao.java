package cn.mobilemd.himalayatrain.dao;

import cn.mobilemd.himalayatrain.businessmodel.CityBo;

public interface ICityDao {
    CityBo getCity(long id);
    int  createCity(CityBo city);
    int  modifyCity(CityBo city);
}
