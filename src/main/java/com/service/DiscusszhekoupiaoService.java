package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhekoupiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhekoupiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhekoupiaoView;


/**
 * 折扣票评论表
 *
 * @author 
 * @email 
 * @date 2022-04-05 14:23:45
 */
public interface DiscusszhekoupiaoService extends IService<DiscusszhekoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhekoupiaoVO> selectListVO(Wrapper<DiscusszhekoupiaoEntity> wrapper);
   	
   	DiscusszhekoupiaoVO selectVO(@Param("ew") Wrapper<DiscusszhekoupiaoEntity> wrapper);
   	
   	List<DiscusszhekoupiaoView> selectListView(Wrapper<DiscusszhekoupiaoEntity> wrapper);
   	
   	DiscusszhekoupiaoView selectView(@Param("ew") Wrapper<DiscusszhekoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhekoupiaoEntity> wrapper);
   	

}

