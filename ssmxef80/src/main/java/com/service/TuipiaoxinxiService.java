package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuipiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuipiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuipiaoxinxiView;


/**
 * 退票信息
 *
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public interface TuipiaoxinxiService extends IService<TuipiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuipiaoxinxiVO> selectListVO(Wrapper<TuipiaoxinxiEntity> wrapper);
   	
   	TuipiaoxinxiVO selectVO(@Param("ew") Wrapper<TuipiaoxinxiEntity> wrapper);
   	
   	List<TuipiaoxinxiView> selectListView(Wrapper<TuipiaoxinxiEntity> wrapper);
   	
   	TuipiaoxinxiView selectView(@Param("ew") Wrapper<TuipiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuipiaoxinxiEntity> wrapper);
   	
}

