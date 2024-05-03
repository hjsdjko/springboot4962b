package com.dao;

import com.entity.ZhekoupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhekoupiaoVO;
import com.entity.view.ZhekoupiaoView;


/**
 * 折扣票
 * 
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
public interface ZhekoupiaoDao extends BaseMapper<ZhekoupiaoEntity> {
	
	List<ZhekoupiaoVO> selectListVO(@Param("ew") Wrapper<ZhekoupiaoEntity> wrapper);
	
	ZhekoupiaoVO selectVO(@Param("ew") Wrapper<ZhekoupiaoEntity> wrapper);
	
	List<ZhekoupiaoView> selectListView(@Param("ew") Wrapper<ZhekoupiaoEntity> wrapper);

	List<ZhekoupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhekoupiaoEntity> wrapper);
	
	ZhekoupiaoView selectView(@Param("ew") Wrapper<ZhekoupiaoEntity> wrapper);
	

}
