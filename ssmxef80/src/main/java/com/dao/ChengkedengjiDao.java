package com.dao;

import com.entity.ChengkedengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengkedengjiVO;
import com.entity.view.ChengkedengjiView;


/**
 * 乘客登记
 * 
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public interface ChengkedengjiDao extends BaseMapper<ChengkedengjiEntity> {
	
	List<ChengkedengjiVO> selectListVO(@Param("ew") Wrapper<ChengkedengjiEntity> wrapper);
	
	ChengkedengjiVO selectVO(@Param("ew") Wrapper<ChengkedengjiEntity> wrapper);
	
	List<ChengkedengjiView> selectListView(@Param("ew") Wrapper<ChengkedengjiEntity> wrapper);

	List<ChengkedengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengkedengjiEntity> wrapper);
	
	ChengkedengjiView selectView(@Param("ew") Wrapper<ChengkedengjiEntity> wrapper);
	
}
