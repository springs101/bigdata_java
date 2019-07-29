package com.serverBigdata.api.entity;

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.util.Date;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * Author jishuai
 * Date  2019-07-26
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Long userId;
    private String phone;
    private String aliwangwang;
    private String wechatId;
    private String zimeihuiUserId;
    private String userName;
    private String headImgurl;
    private String shendengUid;
    private String level;
    private Integer sex;
    private Integer height;
    private Integer weight;
    private String birthday;
    private Integer birthyear;
    private String country;
    private String province;
    private String city;
    private String county;
    private Integer chatCount;
    private String firstChatTime;
    private String firstChatPlatform;
    private String firstChatWith;
    private String lastChatTime;
    private String lastChatPlatform;
    private String lastChatWith;
    private Double payAmount;
    private Integer payCount;
    private Double refundAmount;
    private Integer refundCount;
    private Double lastPayAmount;
    private String lastPayTime;
    private Double firstPayAmount;
    private String firstPayTime;
    private String firstLoginTime;
    private String firstLoginPlatform;
    private Integer isTaobaoUser;
    private Integer isWechatUser;
    private Integer isZimeihuiUser;
    private Integer isTaobaoChated;
    private Integer isWechatChated;
    private Integer isZimeihuiChated;
    private Integer isTaobaoPayed;
    private Integer isWechatPayed;
    private Integer isZimeihuiPayed;
    private Double taobaoPayAmount;
    private Integer taobaoPayCount;
    private Double taobaoFirstPayAmount;
    private Integer taobaoFirstPayTime;
    private Double taobaoLastPayAmount;
    private String taobaoLastPayTime;
    private Integer wechatChatCout;
    private Integer wechatChatInfoTotal;
    private String wechatNo;
    private String wechatNickname;
    private String wechatBelongTo;
    private String wechatFirstAdd;
    private String wechatFirstAddTime;
    private String wechatFirstChatWith;
    private String wechatFirstChatTime;
    private String wechatLastChatWith;
    private String wechatLastChatTime;
    private Double wechatPayAmount;
    private Integer wechatPayCount;
    private String wechatFirstPayTime;
    private Double wecahtFirstPayAmount;
    private String wecahtLastPayTime;
    private Double wechatLastPayAmount;
    private String wechatLifeStatus;
    private Integer wechatIsVIPCardUser;
    private String wechatVIPTime;
    private Double wechatVIPCardBalance;
    private Double wechatVIPCardAmount;
    private String zimeihuiPhone;
    private String zimeihuiNickname;
    private String zimeihuiFXRole;
    private String zimeihuiRegisterTime;
    private String zimeihuiFirstPayTime;
    private Double zimeihuiFirstPayAmount;
    private String zimeihuiLastPayTime;
    private Double zimeihuiPayAmount;
    private Integer zimeihuiPayCount;
    private Integer isWOARegister;
    private String createTime;
    private String createSource;
    private String updateTime;
    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer page;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;

    public User(){
    }

    public void setId (Integer id) {this.id = id;} 
    public Integer getId(){ return id;} 
    public void setUserId (Long userId) {this.userId = userId;} 
    public Long getUserId(){ return userId;} 
    public void setPhone (String phone) {this.phone = phone;} 
    public String getPhone(){ return phone;} 
    public void setAliwangwang (String aliwangwang) {this.aliwangwang = aliwangwang;} 
    public String getAliwangwang(){ return aliwangwang;} 
    public void setWechatId (String wechatId) {this.wechatId = wechatId;} 
    public String getWechatId(){ return wechatId;} 
    public void setZimeihuiUserId (String zimeihuiUserId) {this.zimeihuiUserId = zimeihuiUserId;} 
    public String getZimeihuiUserId(){ return zimeihuiUserId;} 
    public void setUserName (String userName) {this.userName = userName;} 
    public String getUserName(){ return userName;} 
    public void setHeadImgurl (String headImgurl) {this.headImgurl = headImgurl;} 
    public String getHeadImgurl(){ return headImgurl;} 
    public void setShendengUid (String shendengUid) {this.shendengUid = shendengUid;} 
    public String getShendengUid(){ return shendengUid;} 
    public void setLevel (String level) {this.level = level;} 
    public String getLevel(){ return level;} 
    public void setSex (Integer sex) {this.sex = sex;} 
    public Integer getSex(){ return sex;} 
    public void setHeight (Integer height) {this.height = height;} 
    public Integer getHeight(){ return height;} 
    public void setWeight (Integer weight) {this.weight = weight;} 
    public Integer getWeight(){ return weight;} 
    public void setBirthday (String birthday) {this.birthday = birthday;} 
    public String getBirthday(){ return birthday;} 
    public void setBirthyear (Integer birthyear) {this.birthyear = birthyear;} 
    public Integer getBirthyear(){ return birthyear;} 
    public void setCountry (String country) {this.country = country;} 
    public String getCountry(){ return country;} 
    public void setProvince (String province) {this.province = province;} 
    public String getProvince(){ return province;} 
    public void setCity (String city) {this.city = city;} 
    public String getCity(){ return city;} 
    public void setCounty (String county) {this.county = county;} 
    public String getCounty(){ return county;} 
    public void setChatCount (Integer chatCount) {this.chatCount = chatCount;} 
    public Integer getChatCount(){ return chatCount;} 
    public void setFirstChatTime (String firstChatTime) {this.firstChatTime = firstChatTime;} 
    public String getFirstChatTime(){ return firstChatTime;} 
    public void setFirstChatPlatform (String firstChatPlatform) {this.firstChatPlatform = firstChatPlatform;} 
    public String getFirstChatPlatform(){ return firstChatPlatform;} 
    public void setFirstChatWith (String firstChatWith) {this.firstChatWith = firstChatWith;} 
    public String getFirstChatWith(){ return firstChatWith;} 
    public void setLastChatTime (String lastChatTime) {this.lastChatTime = lastChatTime;} 
    public String getLastChatTime(){ return lastChatTime;} 
    public void setLastChatPlatform (String lastChatPlatform) {this.lastChatPlatform = lastChatPlatform;} 
    public String getLastChatPlatform(){ return lastChatPlatform;} 
    public void setLastChatWith (String lastChatWith) {this.lastChatWith = lastChatWith;} 
    public String getLastChatWith(){ return lastChatWith;} 
    public void setPayAmount (Double payAmount) {this.payAmount = payAmount;} 
    public Double getPayAmount(){ return payAmount;} 
    public void setPayCount (Integer payCount) {this.payCount = payCount;} 
    public Integer getPayCount(){ return payCount;} 
    public void setRefundAmount (Double refundAmount) {this.refundAmount = refundAmount;} 
    public Double getRefundAmount(){ return refundAmount;} 
    public void setRefundCount (Integer refundCount) {this.refundCount = refundCount;} 
    public Integer getRefundCount(){ return refundCount;} 
    public void setLastPayAmount (Double lastPayAmount) {this.lastPayAmount = lastPayAmount;} 
    public Double getLastPayAmount(){ return lastPayAmount;} 
    public void setLastPayTime (String lastPayTime) {this.lastPayTime = lastPayTime;} 
    public String getLastPayTime(){ return lastPayTime;} 
    public void setFirstPayAmount (Double firstPayAmount) {this.firstPayAmount = firstPayAmount;} 
    public Double getFirstPayAmount(){ return firstPayAmount;} 
    public void setFirstPayTime (String firstPayTime) {this.firstPayTime = firstPayTime;} 
    public String getFirstPayTime(){ return firstPayTime;} 
    public void setFirstLoginTime (String firstLoginTime) {this.firstLoginTime = firstLoginTime;} 
    public String getFirstLoginTime(){ return firstLoginTime;} 
    public void setFirstLoginPlatform (String firstLoginPlatform) {this.firstLoginPlatform = firstLoginPlatform;} 
    public String getFirstLoginPlatform(){ return firstLoginPlatform;} 
    public void setIsTaobaoUser (Integer isTaobaoUser) {this.isTaobaoUser = isTaobaoUser;} 
    public Integer getIsTaobaoUser(){ return isTaobaoUser;} 
    public void setIsWechatUser (Integer isWechatUser) {this.isWechatUser = isWechatUser;} 
    public Integer getIsWechatUser(){ return isWechatUser;} 
    public void setIsZimeihuiUser (Integer isZimeihuiUser) {this.isZimeihuiUser = isZimeihuiUser;} 
    public Integer getIsZimeihuiUser(){ return isZimeihuiUser;} 
    public void setIsTaobaoChated (Integer isTaobaoChated) {this.isTaobaoChated = isTaobaoChated;} 
    public Integer getIsTaobaoChated(){ return isTaobaoChated;} 
    public void setIsWechatChated (Integer isWechatChated) {this.isWechatChated = isWechatChated;} 
    public Integer getIsWechatChated(){ return isWechatChated;} 
    public void setIsZimeihuiChated (Integer isZimeihuiChated) {this.isZimeihuiChated = isZimeihuiChated;} 
    public Integer getIsZimeihuiChated(){ return isZimeihuiChated;} 
    public void setIsTaobaoPayed (Integer isTaobaoPayed) {this.isTaobaoPayed = isTaobaoPayed;} 
    public Integer getIsTaobaoPayed(){ return isTaobaoPayed;} 
    public void setIsWechatPayed (Integer isWechatPayed) {this.isWechatPayed = isWechatPayed;} 
    public Integer getIsWechatPayed(){ return isWechatPayed;} 
    public void setIsZimeihuiPayed (Integer isZimeihuiPayed) {this.isZimeihuiPayed = isZimeihuiPayed;} 
    public Integer getIsZimeihuiPayed(){ return isZimeihuiPayed;} 
    public void setTaobaoPayAmount (Double taobaoPayAmount) {this.taobaoPayAmount = taobaoPayAmount;} 
    public Double getTaobaoPayAmount(){ return taobaoPayAmount;} 
    public void setTaobaoPayCount (Integer taobaoPayCount) {this.taobaoPayCount = taobaoPayCount;} 
    public Integer getTaobaoPayCount(){ return taobaoPayCount;} 
    public void setTaobaoFirstPayAmount (Double taobaoFirstPayAmount) {this.taobaoFirstPayAmount = taobaoFirstPayAmount;} 
    public Double getTaobaoFirstPayAmount(){ return taobaoFirstPayAmount;} 
    public void setTaobaoFirstPayTime (Integer taobaoFirstPayTime) {this.taobaoFirstPayTime = taobaoFirstPayTime;} 
    public Integer getTaobaoFirstPayTime(){ return taobaoFirstPayTime;} 
    public void setTaobaoLastPayAmount (Double taobaoLastPayAmount) {this.taobaoLastPayAmount = taobaoLastPayAmount;} 
    public Double getTaobaoLastPayAmount(){ return taobaoLastPayAmount;} 
    public void setTaobaoLastPayTime (String taobaoLastPayTime) {this.taobaoLastPayTime = taobaoLastPayTime;} 
    public String getTaobaoLastPayTime(){ return taobaoLastPayTime;} 
    public void setWechatChatCout (Integer wechatChatCout) {this.wechatChatCout = wechatChatCout;} 
    public Integer getWechatChatCout(){ return wechatChatCout;} 
    public void setWechatChatInfoTotal (Integer wechatChatInfoTotal) {this.wechatChatInfoTotal = wechatChatInfoTotal;} 
    public Integer getWechatChatInfoTotal(){ return wechatChatInfoTotal;} 
    public void setWechatNo (String wechatNo) {this.wechatNo = wechatNo;} 
    public String getWechatNo(){ return wechatNo;} 
    public void setWechatNickname (String wechatNickname) {this.wechatNickname = wechatNickname;} 
    public String getWechatNickname(){ return wechatNickname;} 
    public void setWechatBelongTo (String wechatBelongTo) {this.wechatBelongTo = wechatBelongTo;} 
    public String getWechatBelongTo(){ return wechatBelongTo;} 
    public void setWechatFirstAdd (String wechatFirstAdd) {this.wechatFirstAdd = wechatFirstAdd;} 
    public String getWechatFirstAdd(){ return wechatFirstAdd;} 
    public void setWechatFirstAddTime (String wechatFirstAddTime) {this.wechatFirstAddTime = wechatFirstAddTime;} 
    public String getWechatFirstAddTime(){ return wechatFirstAddTime;} 
    public void setWechatFirstChatWith (String wechatFirstChatWith) {this.wechatFirstChatWith = wechatFirstChatWith;} 
    public String getWechatFirstChatWith(){ return wechatFirstChatWith;} 
    public void setWechatFirstChatTime (String wechatFirstChatTime) {this.wechatFirstChatTime = wechatFirstChatTime;} 
    public String getWechatFirstChatTime(){ return wechatFirstChatTime;} 
    public void setWechatLastChatWith (String wechatLastChatWith) {this.wechatLastChatWith = wechatLastChatWith;} 
    public String getWechatLastChatWith(){ return wechatLastChatWith;} 
    public void setWechatLastChatTime (String wechatLastChatTime) {this.wechatLastChatTime = wechatLastChatTime;} 
    public String getWechatLastChatTime(){ return wechatLastChatTime;} 
    public void setWechatPayAmount (Double wechatPayAmount) {this.wechatPayAmount = wechatPayAmount;} 
    public Double getWechatPayAmount(){ return wechatPayAmount;} 
    public void setWechatPayCount (Integer wechatPayCount) {this.wechatPayCount = wechatPayCount;} 
    public Integer getWechatPayCount(){ return wechatPayCount;} 
    public void setWechatFirstPayTime (String wechatFirstPayTime) {this.wechatFirstPayTime = wechatFirstPayTime;} 
    public String getWechatFirstPayTime(){ return wechatFirstPayTime;} 
    public void setWecahtFirstPayAmount (Double wecahtFirstPayAmount) {this.wecahtFirstPayAmount = wecahtFirstPayAmount;} 
    public Double getWecahtFirstPayAmount(){ return wecahtFirstPayAmount;} 
    public void setWecahtLastPayTime (String wecahtLastPayTime) {this.wecahtLastPayTime = wecahtLastPayTime;} 
    public String getWecahtLastPayTime(){ return wecahtLastPayTime;} 
    public void setWechatLastPayAmount (Double wechatLastPayAmount) {this.wechatLastPayAmount = wechatLastPayAmount;} 
    public Double getWechatLastPayAmount(){ return wechatLastPayAmount;} 
    public void setWechatLifeStatus (String wechatLifeStatus) {this.wechatLifeStatus = wechatLifeStatus;} 
    public String getWechatLifeStatus(){ return wechatLifeStatus;} 
    public void setWechatIsVIPCardUser (Integer wechatIsVIPCardUser) {this.wechatIsVIPCardUser = wechatIsVIPCardUser;} 
    public Integer getWechatIsVIPCardUser(){ return wechatIsVIPCardUser;} 
    public void setWechatVIPTime (String wechatVIPTime) {this.wechatVIPTime = wechatVIPTime;} 
    public String getWechatVIPTime(){ return wechatVIPTime;} 
    public void setWechatVIPCardBalance (Double wechatVIPCardBalance) {this.wechatVIPCardBalance = wechatVIPCardBalance;} 
    public Double getWechatVIPCardBalance(){ return wechatVIPCardBalance;} 
    public void setWechatVIPCardAmount (Double wechatVIPCardAmount) {this.wechatVIPCardAmount = wechatVIPCardAmount;} 
    public Double getWechatVIPCardAmount(){ return wechatVIPCardAmount;} 
    public void setZimeihuiPhone (String zimeihuiPhone) {this.zimeihuiPhone = zimeihuiPhone;} 
    public String getZimeihuiPhone(){ return zimeihuiPhone;} 
    public void setZimeihuiNickname (String zimeihuiNickname) {this.zimeihuiNickname = zimeihuiNickname;} 
    public String getZimeihuiNickname(){ return zimeihuiNickname;} 
    public void setZimeihuiFXRole (String zimeihuiFXRole) {this.zimeihuiFXRole = zimeihuiFXRole;} 
    public String getZimeihuiFXRole(){ return zimeihuiFXRole;} 
    public void setZimeihuiRegisterTime (String zimeihuiRegisterTime) {this.zimeihuiRegisterTime = zimeihuiRegisterTime;} 
    public String getZimeihuiRegisterTime(){ return zimeihuiRegisterTime;} 
    public void setZimeihuiFirstPayTime (String zimeihuiFirstPayTime) {this.zimeihuiFirstPayTime = zimeihuiFirstPayTime;} 
    public String getZimeihuiFirstPayTime(){ return zimeihuiFirstPayTime;} 
    public void setZimeihuiFirstPayAmount (Double zimeihuiFirstPayAmount) {this.zimeihuiFirstPayAmount = zimeihuiFirstPayAmount;} 
    public Double getZimeihuiFirstPayAmount(){ return zimeihuiFirstPayAmount;} 
    public void setZimeihuiLastPayTime (String zimeihuiLastPayTime) {this.zimeihuiLastPayTime = zimeihuiLastPayTime;} 
    public String getZimeihuiLastPayTime(){ return zimeihuiLastPayTime;} 
    public void setZimeihuiPayAmount (Double zimeihuiPayAmount) {this.zimeihuiPayAmount = zimeihuiPayAmount;} 
    public Double getZimeihuiPayAmount(){ return zimeihuiPayAmount;} 
    public void setZimeihuiPayCount (Integer zimeihuiPayCount) {this.zimeihuiPayCount = zimeihuiPayCount;} 
    public Integer getZimeihuiPayCount(){ return zimeihuiPayCount;} 
    public void setIsWOARegister (Integer isWOARegister) {this.isWOARegister = isWOARegister;} 
    public Integer getIsWOARegister(){ return isWOARegister;} 
    public void setCreateTime (String createTime) {this.createTime = createTime;} 
    public String getCreateTime(){ return createTime;} 
    public void setCreateSource (String createSource) {this.createSource = createSource;} 
    public String getCreateSource(){ return createSource;} 
    public void setUpdateTime (String updateTime) {this.updateTime = updateTime;} 
    public String getUpdateTime(){ return updateTime;} 
    public void setRemark (String remark) {this.remark = remark;} 
    public String getRemark(){ return remark;} 

    public Integer getPage(){
        return this.page;
    }
    public void setPage(Integer page){
        this.page = page;
    }
    public Integer getLimit(){
        return this.limit;
    }
    public void setLimit(Integer limit){
        this.limit = limit;
    }


    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("id",id);
        json.put("userId",userId);
        json.put("phone",phone);
        json.put("aliwangwang",aliwangwang);
        json.put("wechatId",wechatId);
        json.put("zimeihuiUserId",zimeihuiUserId);
        json.put("userName",userName);
        json.put("headImgurl",headImgurl);
        json.put("shendengUid",shendengUid);
        json.put("level",level);
        json.put("sex",sex);
        json.put("height",height);
        json.put("weight",weight);
        json.put("birthday",birthday);
        json.put("birthyear",birthyear);
        json.put("country",country);
        json.put("province",province);
        json.put("city",city);
        json.put("county",county);
        json.put("chatCount",chatCount);
        json.put("firstChatTime",firstChatTime);
        json.put("firstChatPlatform",firstChatPlatform);
        json.put("firstChatWith",firstChatWith);
        json.put("lastChatTime",lastChatTime);
        json.put("lastChatPlatform",lastChatPlatform);
        json.put("lastChatWith",lastChatWith);
        json.put("payAmount",payAmount);
        json.put("payCount",payCount);
        json.put("refundAmount",refundAmount);
        json.put("refundCount",refundCount);
        json.put("lastPayAmount",lastPayAmount);
        json.put("lastPayTime",lastPayTime);
        json.put("firstPayAmount",firstPayAmount);
        json.put("firstPayTime",firstPayTime);
        json.put("firstLoginTime",firstLoginTime);
        json.put("firstLoginPlatform",firstLoginPlatform);
        json.put("isTaobaoUser",isTaobaoUser);
        json.put("isWechatUser",isWechatUser);
        json.put("isZimeihuiUser",isZimeihuiUser);
        json.put("isTaobaoChated",isTaobaoChated);
        json.put("isWechatChated",isWechatChated);
        json.put("isZimeihuiChated",isZimeihuiChated);
        json.put("isTaobaoPayed",isTaobaoPayed);
        json.put("isWechatPayed",isWechatPayed);
        json.put("isZimeihuiPayed",isZimeihuiPayed);
        json.put("taobaoPayAmount",taobaoPayAmount);
        json.put("taobaoPayCount",taobaoPayCount);
        json.put("taobaoFirstPayAmount",taobaoFirstPayAmount);
        json.put("taobaoFirstPayTime",taobaoFirstPayTime);
        json.put("taobaoLastPayAmount",taobaoLastPayAmount);
        json.put("taobaoLastPayTime",taobaoLastPayTime);
        json.put("wechatChatCout",wechatChatCout);
        json.put("wechatChatInfoTotal",wechatChatInfoTotal);
        json.put("wechatNo",wechatNo);
        json.put("wechatNickname",wechatNickname);
        json.put("wechatBelongTo",wechatBelongTo);
        json.put("wechatFirstAdd",wechatFirstAdd);
        json.put("wechatFirstAddTime",wechatFirstAddTime);
        json.put("wechatFirstChatWith",wechatFirstChatWith);
        json.put("wechatFirstChatTime",wechatFirstChatTime);
        json.put("wechatLastChatWith",wechatLastChatWith);
        json.put("wechatLastChatTime",wechatLastChatTime);
        json.put("wechatPayAmount",wechatPayAmount);
        json.put("wechatPayCount",wechatPayCount);
        json.put("wechatFirstPayTime",wechatFirstPayTime);
        json.put("wecahtFirstPayAmount",wecahtFirstPayAmount);
        json.put("wecahtLastPayTime",wecahtLastPayTime);
        json.put("wechatLastPayAmount",wechatLastPayAmount);
        json.put("wechatLifeStatus",wechatLifeStatus);
        json.put("wechatIsVIPCardUser",wechatIsVIPCardUser);
        json.put("wechatVIPTime",wechatVIPTime);
        json.put("wechatVIPCardBalance",wechatVIPCardBalance);
        json.put("wechatVIPCardAmount",wechatVIPCardAmount);
        json.put("zimeihuiPhone",zimeihuiPhone);
        json.put("zimeihuiNickname",zimeihuiNickname);
        json.put("zimeihuiFXRole",zimeihuiFXRole);
        json.put("zimeihuiRegisterTime",zimeihuiRegisterTime);
        json.put("zimeihuiFirstPayTime",zimeihuiFirstPayTime);
        json.put("zimeihuiFirstPayAmount",zimeihuiFirstPayAmount);
        json.put("zimeihuiLastPayTime",zimeihuiLastPayTime);
        json.put("zimeihuiPayAmount",zimeihuiPayAmount);
        json.put("zimeihuiPayCount",zimeihuiPayCount);
        json.put("isWOARegister",isWOARegister);
        json.put("createTime",createTime);
        json.put("createSource",createSource);
        json.put("updateTime",updateTime);
        json.put("remark",remark);

        json.put("page",page);
        json.put("limit",limit);
        return json.toJSONString();
    }
}