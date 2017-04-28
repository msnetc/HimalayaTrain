package cn.mobilemd.himalayatrain.dto.citys;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel("创建城市dto")
public class CreateCity {
    @ApiModelProperty(value = "名称",required = true)
private String name;

    @ApiModelProperty(value = "省份",required = true)
    private String state;

    @ApiModelProperty(value = "国家",required = true)
    private String country;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}