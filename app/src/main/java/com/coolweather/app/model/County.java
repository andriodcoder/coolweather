package com.coolweather.app.model;

/**
 * Created by WU on 2017/4/8/0008.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getCountyCode(){
        return countyCode;
    }
    public  void setCountyCode(String countyCode){
        this.countyCode=countyCode;
    }
    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
