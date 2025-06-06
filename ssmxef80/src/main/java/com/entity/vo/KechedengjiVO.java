package com.entity.vo;

import com.entity.KechedengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 客车登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public class KechedengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 司机姓名
	 */
	
	private String sijixingming;
		
	/**
	 * 客车类型
	 */
	
	private String kecheleixing;
		
	/**
	 * 进站时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinzhanshijian;
		
	/**
	 * 出站时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuzhanshijian;
				
	
	/**
	 * 设置：司机姓名
	 */
	 
	public void setSijixingming(String sijixingming) {
		this.sijixingming = sijixingming;
	}
	
	/**
	 * 获取：司机姓名
	 */
	public String getSijixingming() {
		return sijixingming;
	}
				
	
	/**
	 * 设置：客车类型
	 */
	 
	public void setKecheleixing(String kecheleixing) {
		this.kecheleixing = kecheleixing;
	}
	
	/**
	 * 获取：客车类型
	 */
	public String getKecheleixing() {
		return kecheleixing;
	}
				
	
	/**
	 * 设置：进站时间
	 */
	 
	public void setJinzhanshijian(Date jinzhanshijian) {
		this.jinzhanshijian = jinzhanshijian;
	}
	
	/**
	 * 获取：进站时间
	 */
	public Date getJinzhanshijian() {
		return jinzhanshijian;
	}
				
	
	/**
	 * 设置：出站时间
	 */
	 
	public void setChuzhanshijian(Date chuzhanshijian) {
		this.chuzhanshijian = chuzhanshijian;
	}
	
	/**
	 * 获取：出站时间
	 */
	public Date getChuzhanshijian() {
		return chuzhanshijian;
	}
			
}
