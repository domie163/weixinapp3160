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


import com.dao.ChengkedengjiDao;
import com.entity.ChengkedengjiEntity;
import com.service.ChengkedengjiService;
import com.entity.vo.ChengkedengjiVO;
import com.entity.view.ChengkedengjiView;

@Service("chengkedengjiService")
public class ChengkedengjiServiceImpl extends ServiceImpl<ChengkedengjiDao, ChengkedengjiEntity> implements ChengkedengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengkedengjiEntity> page = this.selectPage(
                new Query<ChengkedengjiEntity>(params).getPage(),
                new EntityWrapper<ChengkedengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengkedengjiEntity> wrapper) {
		  Page<ChengkedengjiView> page =new Query<ChengkedengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengkedengjiVO> selectListVO(Wrapper<ChengkedengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengkedengjiVO selectVO(Wrapper<ChengkedengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengkedengjiView> selectListView(Wrapper<ChengkedengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengkedengjiView selectView(Wrapper<ChengkedengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
