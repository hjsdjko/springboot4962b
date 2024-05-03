package com.entity.vo;

import com.entity.ZhekoupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 折扣票
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
public class ZhekoupiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
