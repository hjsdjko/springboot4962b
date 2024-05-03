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


import com.dao.ShangjiaxinxiDao;
import com.entity.ShangjiaxinxiEntity;
import com.service.ShangjiaxinxiService;
import com.entity.vo.ShangjiaxinxiVO;
import com.entity.view.ShangjiaxinxiView;

@Service("shangjiaxinxiService")
public class ShangjiaxinxiServiceImpl extends ServiceImpl<ShangjiaxinxiDao, ShangjiaxinxiEntity> implements ShangjiaxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjiaxinxiEntity> page = this.selectPage(
                new Query<ShangjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<ShangjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjiaxinxiEntity> wrapper) {
		  Page<ShangjiaxinxiView> page =new Query<ShangjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangjiaxinxiVO> selectListVO(Wrapper<ShangjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangjiaxinxiVO selectVO(Wrapper<ShangjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangjiaxinxiView> selectListView(Wrapper<ShangjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjiaxinxiView selectView(Wrapper<ShangjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
