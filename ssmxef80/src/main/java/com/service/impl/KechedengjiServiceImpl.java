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


import com.dao.KechedengjiDao;
import com.entity.KechedengjiEntity;
import com.service.KechedengjiService;
import com.entity.vo.KechedengjiVO;
import com.entity.view.KechedengjiView;

@Service("kechedengjiService")
public class KechedengjiServiceImpl extends ServiceImpl<KechedengjiDao, KechedengjiEntity> implements KechedengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechedengjiEntity> page = this.selectPage(
                new Query<KechedengjiEntity>(params).getPage(),
                new EntityWrapper<KechedengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechedengjiEntity> wrapper) {
		  Page<KechedengjiView> page =new Query<KechedengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechedengjiVO> selectListVO(Wrapper<KechedengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechedengjiVO selectVO(Wrapper<KechedengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechedengjiView> selectListView(Wrapper<KechedengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechedengjiView selectView(Wrapper<KechedengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
