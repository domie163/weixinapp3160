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


import com.dao.TuipiaoxinxiDao;
import com.entity.TuipiaoxinxiEntity;
import com.service.TuipiaoxinxiService;
import com.entity.vo.TuipiaoxinxiVO;
import com.entity.view.TuipiaoxinxiView;

@Service("tuipiaoxinxiService")
public class TuipiaoxinxiServiceImpl extends ServiceImpl<TuipiaoxinxiDao, TuipiaoxinxiEntity> implements TuipiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuipiaoxinxiEntity> page = this.selectPage(
                new Query<TuipiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<TuipiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuipiaoxinxiEntity> wrapper) {
		  Page<TuipiaoxinxiView> page =new Query<TuipiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuipiaoxinxiVO> selectListVO(Wrapper<TuipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuipiaoxinxiVO selectVO(Wrapper<TuipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuipiaoxinxiView> selectListView(Wrapper<TuipiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuipiaoxinxiView selectView(Wrapper<TuipiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
