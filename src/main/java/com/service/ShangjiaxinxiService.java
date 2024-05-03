package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiaxinxiView;


/**
 * 商家信息
 *
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
public interface ShangjiaxinxiService extends IService<ShangjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiaxinxiVO> selectListVO(Wrapper<ShangjiaxinxiEntity> wrapper);
   	
   	ShangjiaxinxiVO selectVO(@Param("ew") Wrapper<ShangjiaxinxiEntity> wrapper);
   	
   	List<ShangjiaxinxiView> selectListView(Wrapper<ShangjiaxinxiEntity> wrapper);
   	
   	ShangjiaxinxiView selectView(@Param("ew") Wrapper<ShangjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiaxinxiEntity> wrapper);
   	

}

