package com.dao;

import com.entity.ChupiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChupiaoxinxiVO;
import com.entity.view.ChupiaoxinxiView;


/**
 * 出票信息
 * 
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
public interface ChupiaoxinxiDao extends BaseMapper<ChupiaoxinxiEntity> {
	
	List<ChupiaoxinxiVO> selectListVO(@Param("ew") Wrapper<ChupiaoxinxiEntity> wrapper);
	
	ChupiaoxinxiVO selectVO(@Param("ew") Wrapper<ChupiaoxinxiEntity> wrapper);
	
	List<ChupiaoxinxiView> selectListView(@Param("ew") Wrapper<ChupiaoxinxiEntity> wrapper);

	List<ChupiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChupiaoxinxiEntity> wrapper);
	
	ChupiaoxinxiView selectView(@Param("ew") Wrapper<ChupiaoxinxiEntity> wrapper);
	

}
