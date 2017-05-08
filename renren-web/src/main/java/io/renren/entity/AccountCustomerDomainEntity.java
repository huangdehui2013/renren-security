package io.renren.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:34
 */
public class AccountCustomerDomainEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//客户的账户id
	private Integer accountId;
	//域名名称
	private String domainName;
	//计算费用方式 1点击 2展示
	private Integer caculateType;
	//计算费用的产品id
	private Integer productId;
	//扣量比例（客户是加上这个扣量比例）
	private Integer ownRate;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：客户的账户id
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	/**
	 * 获取：客户的账户id
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * 设置：域名名称
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	/**
	 * 获取：域名名称
	 */
	public String getDomainName() {
		return domainName;
	}
	/**
	 * 设置：计算费用方式 1点击 2展示
	 */
	public void setCaculateType(Integer caculateType) {
		this.caculateType = caculateType;
	}
	/**
	 * 获取：计算费用方式 1点击 2展示
	 */
	public Integer getCaculateType() {
		return caculateType;
	}
	/**
	 * 设置：计算费用的产品id
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	/**
	 * 获取：计算费用的产品id
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * 设置：扣量比例（客户是加上这个扣量比例）
	 */
	public void setOwnRate(Integer ownRate) {
		this.ownRate = ownRate;
	}
	/**
	 * 获取：扣量比例（客户是加上这个扣量比例）
	 */
	public Integer getOwnRate() {
		return ownRate;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
