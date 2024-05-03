package com.entity.model;

import com.entity.ShangjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商家信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
public class ShangjiaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家地址
	 */
	
	private String shangjiadizhi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系手机
	 */
	
	private String lianxishouji;
				
	
	/**
	 * 设置：商家地址
	 */
	 
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系手机
	 */
	 
	public void setLianxishouji(String lianxishouji) {
		this.lianxishouji = lianxishouji;
	}
	
	/**
	 * 获取：联系手机
	 */
	public String getLianxishouji() {
		return lianxishouji;
	}
			
}
