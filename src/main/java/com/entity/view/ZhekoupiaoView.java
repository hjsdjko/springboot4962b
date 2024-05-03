package com.entity.view;

import com.entity.ZhekoupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 折扣票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
@TableName("zhekoupiao")
public class ZhekoupiaoView  extends ZhekoupiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhekoupiaoView(){
	}
 
 	public ZhekoupiaoView(ZhekoupiaoEntity zhekoupiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhekoupiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
