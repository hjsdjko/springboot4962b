package com.dao;

import com.entity.DiscusszhekoupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhekoupiaoVO;
import com.entity.view.DiscusszhekoupiaoView;


/**
 * 折扣票评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-05 14:23:45
 */
public interface DiscusszhekoupiaoDao extends BaseMapper<DiscusszhekoupiaoEntity> {
	
	List<DiscusszhekoupiaoVO> selectListVO(@Param("ew") Wrapper<DiscusszhekoupiaoEntity> wrapper);
	
	DiscusszhekoupiaoVO selectVO(@Param("ew") Wrapper<DiscusszhekoupiaoEntity> wrapper);
	
	List<DiscusszhekoupiaoView> selectListView(@Param("ew") Wrapper<DiscusszhekoupiaoEntity> wrapper);

	List<DiscusszhekoupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhekoupiaoEntity> wrapper);
	
	DiscusszhekoupiaoView selectView(@Param("ew") Wrapper<DiscusszhekoupiaoEntity> wrapper);
	

}
