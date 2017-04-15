package cn.mobilemd.himalayatrain.dao;
import cn.mobilemd.himalayatrain.model.bo.CityBo;

public interface ICityDao {
    CityBo getCity(long id);
    int  createCity(CityBo city);
    int  modifyCity(CityBo city);
}
