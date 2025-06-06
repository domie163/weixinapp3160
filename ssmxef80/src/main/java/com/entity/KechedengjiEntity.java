package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 客车登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
@TableName("kechedengji")
public class KechedengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechedengjiEntity() {
		
	}
	
	public KechedengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 客车车牌号
	 */
					
	private String kechechepaihao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：客车车牌号
	 */
	public void setKechechepaihao(String kechechepaihao) {
		this.kechechepaihao = kechechepaihao;
	}
	/**
	 * 获取：客车车牌号
	 */
	public String getKechechepaihao() {
		return kechechepaihao;
	}
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
