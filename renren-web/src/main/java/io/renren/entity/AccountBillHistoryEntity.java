package io.renren.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:35
 */
public class AccountBillHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//账户对应id
	private Integer accountId;
	//账户类型 3站长 4客户
	private Integer accountType;
	//账单产生的日期
	private Date billDate;
	//产生的账单金额
	private BigDecimal billMoney;
	//1客户充值  2账户消耗  3站长赚取 4站长结算
	private Integer amountType;
	//账户名称
	private String amountName;
	//创建时间
	private Date createTime;

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
	 * 设置：账户对应id
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	/**
	 * 获取：账户对应id
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * 设置：账户类型 3站长 4客户
	 */
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
	/**
	 * 获取：账户类型 3站长 4客户
	 */
	public Integer getAccountType() {
		return accountType;
	}
	/**
	 * 设置：账单产生的日期
	 */
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	/**
	 * 获取：账单产生的日期
	 */
	public Date getBillDate() {
		return billDate;
	}
	/**
	 * 设置：产生的账单金额
	 */
	public void setBillMoney(BigDecimal billMoney) {
		this.billMoney = billMoney;
	}
	/**
	 * 获取：产生的账单金额
	 */
	public BigDecimal getBillMoney() {
		return billMoney;
	}
	/**
	 * 设置：1客户充值  2账户消耗  3站长赚取 4站长结算
	 */
	public void setAmountType(Integer amountType) {
		this.amountType = amountType;
	}
	/**
	 * 获取：1客户充值  2账户消耗  3站长赚取 4站长结算
	 */
	public Integer getAmountType() {
		return amountType;
	}
	/**
	 * 设置：账户名称
	 */
	public void setAmountName(String amountName) {
		this.amountName = amountName;
	}
	/**
	 * 获取：账户名称
	 */
	public String getAmountName() {
		return amountName;
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
}
