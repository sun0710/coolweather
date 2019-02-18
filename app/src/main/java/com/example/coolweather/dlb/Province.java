package com.example.coolweather.dlb;

/**
 * Created by 孙太梧 on 2019/2/18.
 */

public class Province extends  DataSuppot {
    private int id;
    private String provinceName;
    private int proinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return  provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProinceCode(){
        return proinceCode;
    }
    public void setProinceCode(int proinceCode){
        this.proinceCode = proinceCode;
    }
}
