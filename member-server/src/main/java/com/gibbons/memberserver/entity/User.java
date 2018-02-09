/**
 * FileName: User
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:41
 * Description: 用户Entity
 */
package com.gibbons.memberserver.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:41
 * @since 1.0.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 6325730346193896323L;

    private Integer id;

    private String userName;

    private String password;

    private String mallPassword;

    private String actualName;

    private Integer paperworkTypeId;

    private String paperworkNumber;

    private String contactNumber;

    private String eMail;

    private String idCardImgz;

    private String idCardImgf;

    private Integer userTypeId;

    private Timestamp registrationTime;

    private Timestamp updateTime;

    private String referee;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMallPassword() {
        return mallPassword;
    }

    public void setMallPassword(String mallPassword) {
        this.mallPassword = mallPassword == null ? null : mallPassword.trim();
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName == null ? null : actualName.trim();
    }

    public Integer getPaperworkTypeId() {
        return paperworkTypeId;
    }

    public void setPaperworkTypeId(Integer paperworkTypeId) {
        this.paperworkTypeId = paperworkTypeId;
    }

    public String getPaperworkNumber() {
        return paperworkNumber;
    }

    public void setPaperworkNumber(String paperworkNumber) {
        this.paperworkNumber = paperworkNumber == null ? null : paperworkNumber.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getIdCardImgz() {
        return idCardImgz;
    }

    public void setIdCardImgz(String idCardImgz) {
        this.idCardImgz = idCardImgz == null ? null : idCardImgz.trim();
    }

    public String getIdCardImgf() {
        return idCardImgf;
    }

    public void setIdCardImgf(String idCardImgf) {
        this.idCardImgf = idCardImgf == null ? null : idCardImgf.trim();
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Timestamp getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}