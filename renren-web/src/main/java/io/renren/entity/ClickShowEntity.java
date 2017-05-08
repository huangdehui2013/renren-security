package io.renren.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:34
 */
public class ClickShowEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//域名名称
	private String domainName;
	//客户买量的账户id
	private Integer accountId;
	//点击数目
	private Integer clickNum;
	//展示数目
	private Integer showNum;
	//时代表 取值分别从0到23
	private Integer hourStand;
	//客户消耗（算是接口是经过加上扣量的）
	private BigDecimal customerFee;
	//站长收益（算出结果是经过减去扣量的）
	private BigDecimal webMasterOwn;
	//记录生成的日期精确到日
	private Date createDate;
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
	 * 设置：客户买量的账户id
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	/**
	 * 获取：客户买量的账户id
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * 设置：点击数目
	 */
	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}
	/**
	 * 获取：点击数目
	 */
	public Integer getClickNum() {
		return clickNum;
	}
	/**
	 * 设置：展示数目
	 */
	public void setShowNum(Integer showNum) {
		this.showNum = showNum;
	}
	/**
	 * 获取：展示数目
	 */
	public Integer getShowNum() {
		return showNum;
	}
	/**
	 * 设置：时代表 取值分别从0到23
	 */
	public void setHourStand(Integer hourStand) {
		this.hourStand = hourStand;
	}
	/**
	 * 获取：时代表 取值分别从0到23
	 */
	public Integer getHourStand() {
		return hourStand;
	}
	/**
	 * 设置：客户消耗（算是接口是经过加上扣量的）
	 */
	public void setCustomerFee(BigDecimal customerFee) {
		this.customerFee = customerFee;
	}
	/**
	 * 获取：客户消耗（算是接口是经过加上扣量的）
	 */
	public BigDecimal getCustomerFee() {
		return customerFee;
	}
	/**
	 * 设置：站长收益（算出结果是经过减去扣量的）
	 */
	public void setWebMasterOwn(BigDecimal webMasterOwn) {
		this.webMasterOwn = webMasterOwn;
	}
	/**
	 * 获取：站长收益（算出结果是经过减去扣量的）
	 */
	public BigDecimal getWebMasterOwn() {
		return webMasterOwn;
	}
	/**
	 * 设置：记录生成的日期精确到日
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：记录生成的日期精确到日
	 */
	public Date getCreateDate() {
		return createDate;
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
