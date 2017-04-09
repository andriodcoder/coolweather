package com.coolweather.app.model;

/**
 * Created by WU on 2017/4/8/0008.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }
    public void setProviceName(String provinceName){
        this.provinceName=provinceName;
    }
    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProviceCode(String provinceCode){
        this.provinceCode=provinceCode;
    }

}
