package cn.mobilemd.himalayatrain.dto;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by jerry on 2017/4/15.
 */
public class ResponseBase<T> {

    private T data;

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @ApiModel("市dto")
    public static class CityDto {
    
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
        }}


}
