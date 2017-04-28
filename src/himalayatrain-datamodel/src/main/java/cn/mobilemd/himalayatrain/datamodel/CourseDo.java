package cn.mobilemd.himalayatrain.datamodel;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class CourseDo implements Serializable {
    private Integer id;

    /**
     * 课程代码
     */
    private String code;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程类型
     */
    private Integer coursecategoryid;

    /**
     * 授课方式
     */
    private Integer teachingwayid;

    /**
     * 课程描述
     */
    private String discription;

    /**
     * 课程时长
     */
    private Integer courselength;

    /**
     * 结课方式
     */
    private Integer endcoursetypeid;

    /**
     * 及格分数
     */
    private Long borderline;

    /**
     * 试题总分数
     */
    private Long sumscore;

    /**
     * 课程有效天数
     */
    private Integer validdays;

    /**
     * 发布状态
     */
    private Integer isrelease;

    /**
     * 发布时间
     */
    private Date releasetime;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 创建人
     */
    private String createuserid;

    /**
     * 修改人
     */
    private String updateuserid;

    /**
     * 公司标识
     */
    private String companyid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoursecategoryid() {
        return coursecategoryid;
    }

    public void setCoursecategoryid(Integer coursecategoryid) {
        this.coursecategoryid = coursecategoryid;
    }

    public Integer getTeachingwayid() {
        return teachingwayid;
    }

    public void setTeachingwayid(Integer teachingwayid) {
        this.teachingwayid = teachingwayid;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Integer getCourselength() {
        return courselength;
    }

    public void setCourselength(Integer courselength) {
        this.courselength = courselength;
    }

    public Integer getEndcoursetypeid() {
        return endcoursetypeid;
    }

    public void setEndcoursetypeid(Integer endcoursetypeid) {
        this.endcoursetypeid = endcoursetypeid;
    }

    public Long getBorderline() {
        return borderline;
    }

    public void setBorderline(Long borderline) {
        this.borderline = borderline;
    }

    public Long getSumscore() {
        return sumscore;
    }

    public void setSumscore(Long sumscore) {
        this.sumscore = sumscore;
    }

    public Integer getValiddays() {
        return validdays;
    }

    public void setValiddays(Integer validdays) {
        this.validdays = validdays;
    }

    public Integer getIsrelease() {
        return isrelease;
    }

    public void setIsrelease(Integer isrelease) {
        this.isrelease = isrelease;
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }
}