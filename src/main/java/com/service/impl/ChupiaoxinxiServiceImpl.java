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


import com.dao.ChupiaoxinxiDao;
import com.entity.ChupiaoxinxiEntity;
import com.service.ChupiaoxinxiService;
import com.entity.vo.ChupiaoxinxiVO;
import com.entity.view.ChupiaoxinxiView;

@Service("chupiaoxinxiService")
public class ChupiaoxinxiServiceImpl extends ServiceImpl<ChupiaoxinxiDao, ChupiaoxinxiEntity> implements ChupiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChupiaoxinxiEntity> page = this.selectPage(
                new Query<ChupiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<ChupiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChupiaoxinxiEntity> wrapper) {
		  Page<ChupiaoxinxiView> page =new Query<ChupiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChupiaoxinxiVO> selectListVO(Wrapper<ChupiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChupiaoxinxiVO selectVO(Wrapper<ChupiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChupiaoxinxiView> selectListView(Wrapper<ChupiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChupiaoxinxiView selectView(Wrapper<ChupiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
