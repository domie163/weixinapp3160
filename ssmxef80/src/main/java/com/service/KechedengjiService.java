package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechedengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechedengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechedengjiView;


/**
 * 客车登记
 *
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public interface KechedengjiService extends IService<KechedengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechedengjiVO> selectListVO(Wrapper<KechedengjiEntity> wrapper);
   	
   	KechedengjiVO selectVO(@Param("ew") Wrapper<KechedengjiEntity> wrapper);
   	
   	List<KechedengjiView> selectListView(Wrapper<KechedengjiEntity> wrapper);
   	
   	KechedengjiView selectView(@Param("ew") Wrapper<KechedengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechedengjiEntity> wrapper);
   	
}

