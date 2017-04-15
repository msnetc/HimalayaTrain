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
        return this.sqlSession.selectOne("selectCityById", id);
    }

}
