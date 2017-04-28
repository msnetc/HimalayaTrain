package daomodel;

import cn.mobilemd.himalayatrain.datamodel.CourseCategoryDo;

public interface CourseCategoryDoMapper {
    int insert(CourseCategoryDo record);

    int insertSelective(CourseCategoryDo record);
}