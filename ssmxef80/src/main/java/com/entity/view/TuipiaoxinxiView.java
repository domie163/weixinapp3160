package com.entity.view;

import com.entity.TuipiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退票信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
@TableName("tuipiaoxinxi")
public class TuipiaoxinxiView  extends TuipiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuipiaoxinxiView(){
	}
 
 	public TuipiaoxinxiView(TuipiaoxinxiEntity tuipiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tuipiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
