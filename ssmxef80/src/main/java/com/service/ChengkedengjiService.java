package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengkedengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengkedengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengkedengjiView;


/**
 * 乘客登记
 *
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public interface ChengkedengjiService extends IService<ChengkedengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengkedengjiVO> selectListVO(Wrapper<ChengkedengjiEntity> wrapper);
   	
   	ChengkedengjiVO selectVO(@Param("ew") Wrapper<ChengkedengjiEntity> wrapper);
   	
   	List<ChengkedengjiView> selectListView(Wrapper<ChengkedengjiEntity> wrapper);
   	
   	ChengkedengjiView selectView(@Param("ew") Wrapper<ChengkedengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengkedengjiEntity> wrapper);
   	
}

