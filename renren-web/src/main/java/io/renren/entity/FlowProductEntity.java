package io.renren.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:33
 */
public class FlowProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//售卖方式 1点击  2展示
	private Integer type;
	//多少为一单位，比如1000展示（1000）  1点击（1）
	private Integer unit;
	//单位下的单价
	private BigDecimal unitPrice;
	//售卖流量方式的（唯一）名称
	private String productName;
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
	 * 设置：售卖方式 1点击  2展示
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：售卖方式 1点击  2展示
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：多少为一单位，比如1000展示（1000）  1点击（1）
	 */
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	/**
	 * 获取：多少为一单位，比如1000展示（1000）  1点击（1）
	 */
	public Integer getUnit() {
		return unit;
	}
	/**
	 * 设置：单位下的单价
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * 获取：单位下的单价
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	/**
	 * 设置：售卖流量方式的（唯一）名称
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：售卖流量方式的（唯一）名称
	 */
	public String getProductName() {
		return productName;
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
