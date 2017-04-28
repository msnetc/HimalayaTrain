package daomodel;

import datamodel.CourseBo;

public interface CourseBoMapper {
    int insert(CourseBo record);

    int insertSelective(CourseBo record);
}