package com.dao;

import com.entity.TuipiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuipiaoxinxiVO;
import com.entity.view.TuipiaoxinxiView;


/**
 * 退票信息
 * 
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public interface TuipiaoxinxiDao extends BaseMapper<TuipiaoxinxiEntity> {
	
	List<TuipiaoxinxiVO> selectListVO(@Param("ew") Wrapper<TuipiaoxinxiEntity> wrapper);
	
	TuipiaoxinxiVO selectVO(@Param("ew") Wrapper<TuipiaoxinxiEntity> wrapper);
	
	List<TuipiaoxinxiView> selectListView(@Param("ew") Wrapper<TuipiaoxinxiEntity> wrapper);

	List<TuipiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuipiaoxinxiEntity> wrapper);
	
	TuipiaoxinxiView selectView(@Param("ew") Wrapper<TuipiaoxinxiEntity> wrapper);
	
}
