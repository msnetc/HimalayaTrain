package cn.mobilemd.himalayatrain.dao;

import cn.mobilemd.himalayatrain.datamodel.CityDo;
import cn.mobilemd.himalayatrain.businessmodel.CityBo;
import org.apache.ibatis.session.SqlSession;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CityDao  implements ICityDao{
    @Autowired
    DozerBeanMapper mapper;
    @Resource
    private SqlSession sqlSession;

    public CityBo getCity(long id) {
        CityDo city= this.sqlSession.selectOne("selectCityById", id);
        CityBo ret = ToBo(city);
        return ret;
    }

    public int createCity(CityBo city) {
        return this.sqlSession.insert("createCity", city);
    }

    public int modifyCity(CityBo city) {
        return this.sqlSession.update("modifycity", city);
    }

    private CityBo ToBo(CityDo city){
        CityBo dest = mapper.map(city, CityBo.class);
        return dest;
    }


}
