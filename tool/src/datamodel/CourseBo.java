package datamodel;

import java.util.Date;

public class CourseBo {
    private Integer id;

    private String code;

    private String name;

    private Integer coursecategoryid;

    private Integer teachingwayid;

    private String discription;

    private Integer courselength;

    private Integer endcoursetypeid;

    private Long borderline;

    private Long sumscore;

    private Integer validdays;

    private Integer isrelease;

    private Date releasetime;

    private Date createtime;

    private Date updatetime;

    private String createuserid;

    private String updateuserid;

    private String companyid;

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
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        this.discription = discription == null ? null : discription.trim();
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
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }
}