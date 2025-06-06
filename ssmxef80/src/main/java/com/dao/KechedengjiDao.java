package com.dao;

import com.entity.KechedengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechedengjiVO;
import com.entity.view.KechedengjiView;


/**
 * 客车登记
 * 
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public interface KechedengjiDao extends BaseMapper<KechedengjiEntity> {
	
	List<KechedengjiVO> selectListVO(@Param("ew") Wrapper<KechedengjiEntity> wrapper);
	
	KechedengjiVO selectVO(@Param("ew") Wrapper<KechedengjiEntity> wrapper);
	
	List<KechedengjiView> selectListView(@Param("ew") Wrapper<KechedengjiEntity> wrapper);

	List<KechedengjiView> selectListView(Pagination page,@Param("ew") Wrapper<KechedengjiEntity> wrapper);
	
	KechedengjiView selectView(@Param("ew") Wrapper<KechedengjiEntity> wrapper);
	
}
