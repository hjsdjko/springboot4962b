package com.entity.view;

import com.entity.DiscusszhekoupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 折扣票评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-05 14:23:45
 */
@TableName("discusszhekoupiao")
public class DiscusszhekoupiaoView  extends DiscusszhekoupiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhekoupiaoView(){
	}
 
 	public DiscusszhekoupiaoView(DiscusszhekoupiaoEntity discusszhekoupiaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhekoupiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
