package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 折扣票
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
@TableName("zhekoupiao")
public class ZhekoupiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhekoupiaoEntity() {
		
	}
	
	public ZhekoupiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 票据名称
	 */
					
	private String piaojumingcheng;
	
	/**
	 * 票据图片
	 */
					
	private String piaojutupian;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 原价
	 */
					
	private Integer yuanjia;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 有效期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date youxiaoqi;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 票据详情
	 */
					
	private String piaojuxiangqing;
	
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	/**
	 * 商店地址
	 */
					
	private String shangdiandizhi;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：票据名称
	 */
	public void setPiaojumingcheng(String piaojumingcheng) {
		this.piaojumingcheng = piaojumingcheng;
	}
	/**
	 * 获取：票据名称
	 */
	public String getPiaojumingcheng() {
		return piaojumingcheng;
	}
	/**
	 * 设置：票据图片
	 */
	public void setPiaojutupian(String piaojutupian) {
		this.piaojutupian = piaojutupian;
	}
	/**
	 * 获取：票据图片
	 */
	public String getPiaojutupian() {
		return piaojutupian;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：原价
	 */
	public void setYuanjia(Integer yuanjia) {
		this.yuanjia = yuanjia;
	}
	/**
	 * 获取：原价
	 */
	public Integer getYuanjia() {
		return yuanjia;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：有效期
	 */
	public void setYouxiaoqi(Date youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	/**
	 * 获取：有效期
	 */
	public Date getYouxiaoqi() {
		return youxiaoqi;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：票据详情
	 */
	public void setPiaojuxiangqing(String piaojuxiangqing) {
		this.piaojuxiangqing = piaojuxiangqing;
	}
	/**
	 * 获取：票据详情
	 */
	public String getPiaojuxiangqing() {
		return piaojuxiangqing;
	}
	/**
	 * 设置：商家名称
	 */
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
	/**
	 * 设置：商店地址
	 */
	public void setShangdiandizhi(String shangdiandizhi) {
		this.shangdiandizhi = shangdiandizhi;
	}
	/**
	 * 获取：商店地址
	 */
	public String getShangdiandizhi() {
		return shangdiandizhi;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
