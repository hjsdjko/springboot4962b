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


import com.dao.DiscusszhekoupiaoDao;
import com.entity.DiscusszhekoupiaoEntity;
import com.service.DiscusszhekoupiaoService;
import com.entity.vo.DiscusszhekoupiaoVO;
import com.entity.view.DiscusszhekoupiaoView;

@Service("discusszhekoupiaoService")
public class DiscusszhekoupiaoServiceImpl extends ServiceImpl<DiscusszhekoupiaoDao, DiscusszhekoupiaoEntity> implements DiscusszhekoupiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhekoupiaoEntity> page = this.selectPage(
                new Query<DiscusszhekoupiaoEntity>(params).getPage(),
                new EntityWrapper<DiscusszhekoupiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhekoupiaoEntity> wrapper) {
		  Page<DiscusszhekoupiaoView> page =new Query<DiscusszhekoupiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhekoupiaoVO> selectListVO(Wrapper<DiscusszhekoupiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhekoupiaoVO selectVO(Wrapper<DiscusszhekoupiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhekoupiaoView> selectListView(Wrapper<DiscusszhekoupiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhekoupiaoView selectView(Wrapper<DiscusszhekoupiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
