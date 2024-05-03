package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhekoupiaoDao;
import com.entity.ZhekoupiaoEntity;
import com.service.ZhekoupiaoService;
import com.entity.vo.ZhekoupiaoVO;
import com.entity.view.ZhekoupiaoView;

@Service("zhekoupiaoService")
public class ZhekoupiaoServiceImpl extends ServiceImpl<ZhekoupiaoDao, ZhekoupiaoEntity> implements ZhekoupiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhekoupiaoEntity> page = this.selectPage(
                new Query<ZhekoupiaoEntity>(params).getPage(),
                new EntityWrapper<ZhekoupiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhekoupiaoEntity> wrapper) {
		  Page<ZhekoupiaoView> page =new Query<ZhekoupiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhekoupiaoVO> selectListVO(Wrapper<ZhekoupiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhekoupiaoVO selectVO(Wrapper<ZhekoupiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhekoupiaoView> selectListView(Wrapper<ZhekoupiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhekoupiaoView selectView(Wrapper<ZhekoupiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
