package io.github.gefangshuai.rtat.model;

import com.google.gson.Gson;
import io.github.gefangshuai.constant.StatusEnum;
import io.github.gefangshuai.permission.model.User;
import io.github.gefangshuai.server.core.persistence.CoreModel;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

/**
 * 餐厅商铺表
 * Created by gefangshuai on 2015/11/9.
 */
@Entity
@Table(name = "b_restaurant")
public class Restaurant extends CoreModel{
    private String name;            // 门店名称

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> telNum;    // 联系方式，可以多个(前台页面暂时只支持一个)
    private String province;        // 省
    private String city;            // 市
    private String district;        // 区
    private String address;         // 详细地址

    private String memo;            // 门店描述
    private String imagePath;       // 门店图片地址
    private Boolean opening = true;        // 营业中
    private StatusEnum status = StatusEnum.INVALID; // 是否有效
    @OneToOne
    @JoinColumn(name = "userId")
    @Cascade(CascadeType.ALL)
    private User user;              // 对应用户表

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTelNum() {
        return telNum;
    }

    public void setTelNum(List<String> telNum) {
        this.telNum = telNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Boolean getOpening() {
        return opening;
    }

    public void setOpening(Boolean opening) {
        this.opening = opening;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
