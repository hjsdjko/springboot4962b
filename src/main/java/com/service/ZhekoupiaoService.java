package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhekoupiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhekoupiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhekoupiaoView;


/**
 * 折扣票
 *
 * @author 
 * @email 
 * @date 2022-04-05 14:23:44
 */
public interface ZhekoupiaoService extends IService<ZhekoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhekoupiaoVO> selectListVO(Wrapper<ZhekoupiaoEntity> wrapper);
   	
   	ZhekoupiaoVO selectVO(@Param("ew") Wrapper<ZhekoupiaoEntity> wrapper);
   	
   	List<ZhekoupiaoView> selectListView(Wrapper<ZhekoupiaoEntity> wrapper);
   	
   	ZhekoupiaoView selectView(@Param("ew") Wrapper<ZhekoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhekoupiaoEntity> wrapper);
   	

}

