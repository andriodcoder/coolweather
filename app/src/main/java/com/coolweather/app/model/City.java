package com.coolweather.app.model;

/**
 * Created by WU on 2017/4/8/0008.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getcityName(){
        return cityName;
    }
    public void setcityName(String cityName){
        this.cityName=cityName;
    }
    public String getcityCode(){
        return cityCode;
    }
    public void setcityCode(String cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }

}
