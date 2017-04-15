package cn.mobilemd.himalayatrain.dao;

import cn.mobilemd.himalayatrain.model.bo.CityBo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

@Component
public class CityDao  implements ICityDao{

    @Resource
    private SqlSession sqlSession;

    public CityBo getCity(long id) {
        CityBo city= this.sqlSession.selectOne("selectCityById", id);
        return city;
    }

    public int createCity(CityBo city) {
        return this.sqlSession.insert("createCity", city);
    }

    public int modifyCity(CityBo city) {
        return this.sqlSession.update("modifycity", city);
    }
}
