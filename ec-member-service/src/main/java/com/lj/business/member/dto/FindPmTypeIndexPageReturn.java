package com.lj.business.member.dto;

import java.io.Serializable;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class FindPmTypeIndexPageReturn.
 */
public class FindPmTypeIndexPageReturn implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5986464173269864146L;

	 /**
     * 客户编号  .
     */
    private String memberNo;

    /**
     * 客户名称 .
     */
    private String memberName;

    /**
     * 导购编号 .
     */
    private String memberNoGm;

    /**
     * 导购姓名 .
     */
    private String memberNameGm;

    /**
     * 微信号 .
     */
    private String noWx;
    
    /**
     * 昵称备注_微信 .
     */
    private String nickNameRemarkWx;
    
    /** 昵称备注_本地. */
    private String nickNameRemarkLocal;
    
    /**
     * 昵称_微信 .
     */
    private String nickNameWx;
    
    /**
     * 头像地址 .
     */
    private String headAddress;
    
    /**
     * 动态描述 .
     */
    private String behaviorDesc;
    /**
     * 行为时间 .
     */
    private Date behaviorDate;
    
    /**
     * 客户客户分类关联表CODE .
     */
    private String codePmTypePm;
    
    /**
     * 紧急客户
		是：Y
		否：N .
     */
    private String urgencyPm;

    /**
     * 手机号 .
     */
    private String mobile;
    
    /** 完成百分比. */
    private Double ratioClientInfo;
    
    /** 交叉客户数量. */
    private int repeatCount;
    
    private String pmTypeCode;
    private String pmTypeName;
    private String pmTypeType;
    
	/**
	 * @return the pmTypeType
	 */
	public String getPmTypeType() {
		return pmTypeType;
	}

	/**
	 * @param pmTypeType the pmTypeType to set
	 */
	public void setPmTypeType(String pmTypeType) {
		this.pmTypeType = pmTypeType;
	}

	/**
	 * @return the pmTypeCode
	 */
	public String getPmTypeCode() {
		return pmTypeCode;
	}

	/**
	 * @param pmTypeCode the pmTypeCode to set
	 */
	public void setPmTypeCode(String pmTypeCode) {
		this.pmTypeCode = pmTypeCode;
	}

	/**
	 * @return the pmTypeName
	 */
	public String getPmTypeName() {
		return pmTypeName;
	}

	/**
	 * @param pmTypeName the pmTypeName to set
	 */
	public void setPmTypeName(String pmTypeName) {
		this.pmTypeName = pmTypeName;
	}

	/**
	 * Gets the 客户编号  .
	 *
	 * @return the 客户编号  
	 */
	public String getMemberNo() {
		return memberNo;
	}

	/**
	 * Sets the 客户编号  .
	 *
	 * @param memberNo the new 客户编号  
	 */
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	/**
	 * Gets the 客户名称 .
	 *
	 * @return the 客户名称 
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * Sets the 客户名称 .
	 *
	 * @param memberName the new 客户名称 
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * Gets the 导购编号 .
	 *
	 * @return the 导购编号 
	 */
	public String getMemberNoGm() {
		return memberNoGm;
	}

	/**
	 * Sets the 导购编号 .
	 *
	 * @param memberNoGm the new 导购编号 
	 */
	public void setMemberNoGm(String memberNoGm) {
		this.memberNoGm = memberNoGm;
	}

	/**
	 * Gets the 导购姓名 .
	 *
	 * @return the 导购姓名 
	 */
	public String getMemberNameGm() {
		return memberNameGm;
	}

	/**
	 * Sets the 导购姓名 .
	 *
	 * @param memberNameGm the new 导购姓名 
	 */
	public void setMemberNameGm(String memberNameGm) {
		this.memberNameGm = memberNameGm;
	}

	/**
	 * Gets the 微信号 .
	 *
	 * @return the 微信号 
	 */
	public String getNoWx() {
		return noWx;
	}

	/**
	 * Sets the 微信号 .
	 *
	 * @param noWx the new 微信号 
	 */
	public void setNoWx(String noWx) {
		this.noWx = noWx;
	}

	/**
	 * Gets the 昵称_微信 .
	 *
	 * @return the 昵称_微信 
	 */
	public String getNickNameWx() {
		return nickNameWx;
	}

	/**
	 * Sets the 昵称_微信 .
	 *
	 * @param nickNameWx the new 昵称_微信 
	 */
	public void setNickNameWx(String nickNameWx) {
		this.nickNameWx = nickNameWx;
	}

	/**
	 * Gets the 头像地址 .
	 *
	 * @return the 头像地址 
	 */
	public String getHeadAddress() {
		return headAddress;
	}

	/**
	 * Sets the 头像地址 .
	 *
	 * @param headAddress the new 头像地址 
	 */
	public void setHeadAddress(String headAddress) {
		this.headAddress = headAddress;
	}

	/**
	 * Gets the 动态描述 .
	 *
	 * @return the 动态描述 
	 */
	public String getBehaviorDesc() {
		return behaviorDesc;
	}

	/**
	 * Sets the 动态描述 .
	 *
	 * @param behaviorDesc the new 动态描述 
	 */
	public void setBehaviorDesc(String behaviorDesc) {
		this.behaviorDesc = behaviorDesc;
	}

	/**
	 * Gets the 昵称备注_微信 .
	 *
	 * @return the 昵称备注_微信 
	 */
	public String getNickNameRemarkWx() {
		return nickNameRemarkWx;
	}

	/**
	 * Sets the 昵称备注_微信 .
	 *
	 * @param nickNameRemarkWx the new 昵称备注_微信 
	 */
	public void setNickNameRemarkWx(String nickNameRemarkWx) {
		this.nickNameRemarkWx = nickNameRemarkWx;
	}

	/**
	 * Gets the 客户客户分类关联表CODE .
	 *
	 * @return the 客户客户分类关联表CODE 
	 */
	public String getCodePmTypePm() {
		return codePmTypePm;
	}

	/**
	 * Sets the 客户客户分类关联表CODE .
	 *
	 * @param codePmTypePm the new 客户客户分类关联表CODE 
	 */
	public void setCodePmTypePm(String codePmTypePm) {
		this.codePmTypePm = codePmTypePm;
	}

	/**
	 * Gets the 行为时间 .
	 *
	 * @return the 行为时间 
	 */
	public Date getBehaviorDate() {
		return behaviorDate;
	}

	/**
	 * Sets the 行为时间 .
	 *
	 * @param behaviorDate the new 行为时间 
	 */
	public void setBehaviorDate(Date behaviorDate) {
		this.behaviorDate = behaviorDate;
	}

	/**
	 * Gets the 紧急客户 是：Y 否：N .
	 *
	 * @return the 紧急客户 是：Y 否：N 
	 */
	public String getUrgencyPm() {
		return urgencyPm;
	}

	/**
	 * Sets the 紧急客户 是：Y 否：N .
	 *
	 * @param urgencyPm the new 紧急客户 是：Y 否：N 
	 */
	public void setUrgencyPm(String urgencyPm) {
		this.urgencyPm = urgencyPm;
	}

	/**
	 * Gets the 手机号 .
	 *
	 * @return the 手机号 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the 手机号 .
	 *
	 * @param mobile the new 手机号 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Gets the ratio client info.
	 *
	 * @return the ratio client info
	 */
	public Double getRatioClientInfo() {
		return ratioClientInfo;
	}

	/**
	 * Sets the ratio client info.
	 *
	 * @param ratioClientInfo the new ratio client info
	 */
	public void setRatioClientInfo(Double ratioClientInfo) {
		this.ratioClientInfo = ratioClientInfo;
	}
	
	/**
	 * Gets the nick name remark local.
	 *
	 * @return the nick name remark local
	 */
	public String getNickNameRemarkLocal() {
		return nickNameRemarkLocal;
	}

	/**
	 * Sets the nick name remark local.
	 *
	 * @param nickNameRemarkLocal the new nick name remark local
	 */
	public void setNickNameRemarkLocal(String nickNameRemarkLocal) {
		this.nickNameRemarkLocal = nickNameRemarkLocal;
	}

	/**
	 * Gets the 交叉客户数量.
	 *
	 * @return the 交叉客户数量
	 */
	public int getRepeatCount() {
		return repeatCount;
	}

	/**
	 * Sets the 交叉客户数量.
	 *
	 * @param repeatCount the new 交叉客户数量
	 */
	public void setRepeatCount(int repeatCount) {
		this.repeatCount = repeatCount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FindPmTypeIndexPageReturn [memberNo=").append(memberNo)
				.append(", memberName=").append(memberName)
				.append(", memberNoGm=").append(memberNoGm)
				.append(", memberNameGm=").append(memberNameGm)
				.append(", noWx=").append(noWx).append(", nickNameRemarkWx=")
				.append(nickNameRemarkWx).append(", nickNameRemarkLocal=")
				.append(nickNameRemarkLocal).append(", nickNameWx=")
				.append(nickNameWx).append(", headAddress=")
				.append(headAddress).append(", behaviorDesc=")
				.append(behaviorDesc).append(", behaviorDate=")
				.append(behaviorDate).append(", codePmTypePm=")
				.append(codePmTypePm).append(", urgencyPm=").append(urgencyPm)
				.append(", mobile=").append(mobile)
				.append(", ratioClientInfo=").append(ratioClientInfo)
				.append(", repeatCount=").append(repeatCount).append("]");
		return builder.toString();
	}
	
}
