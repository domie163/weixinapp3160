package com.entity.view;

import com.entity.ChengkedengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 乘客登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
@TableName("chengkedengji")
public class ChengkedengjiView  extends ChengkedengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengkedengjiView(){
	}
 
 	public ChengkedengjiView(ChengkedengjiEntity chengkedengjiEntity){
 	try {
			BeanUtils.copyProperties(this, chengkedengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
