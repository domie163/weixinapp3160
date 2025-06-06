package com.entity.view;

import com.entity.KechedengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客车登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
@TableName("kechedengji")
public class KechedengjiView  extends KechedengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechedengjiView(){
	}
 
 	public KechedengjiView(KechedengjiEntity kechedengjiEntity){
 	try {
			BeanUtils.copyProperties(this, kechedengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
