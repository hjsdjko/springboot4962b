package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChupiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChupiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChupiaoxinxiView;


/**
 * 出票信息
 *
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
public interface ChupiaoxinxiService extends IService<ChupiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChupiaoxinxiVO> selectListVO(Wrapper<ChupiaoxinxiEntity> wrapper);
   	
   	ChupiaoxinxiVO selectVO(@Param("ew") Wrapper<ChupiaoxinxiEntity> wrapper);
   	
   	List<ChupiaoxinxiView> selectListView(Wrapper<ChupiaoxinxiEntity> wrapper);
   	
   	ChupiaoxinxiView selectView(@Param("ew") Wrapper<ChupiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChupiaoxinxiEntity> wrapper);
   	

}

