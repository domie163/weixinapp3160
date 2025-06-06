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
 * 车票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-08 16:42:30
 */
@TableName("chepiaoxinxi")
public class ChepiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChepiaoxinxiEntity() {
		
	}
	
	public ChepiaoxinxiEntity(T t) {
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
	 * 班次
	 */
					
	private String banci;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 出发日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chufariqi;
	
	/**
	 * 出发时间
	 */
					
	private String chufashijian;
	
	/**
	 * 起点
	 */
					
	private String qidian;
	
	/**
	 * 途经
	 */
					
	private String tujing;
	
	/**
	 * 终点
	 */
					
	private String zhongdian;
	
	/**
	 * 时长
	 */
					
	private String shizhang;
	
	/**
	 * 座位类型
	 */
					
	private String zuoweileixing;
	
	/**
	 * 票价
	 */
					
	private Integer piaojia;
	
	/**
	 * 票数
	 */
					
	private Integer piaoshu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 客车车牌号
	 */
					
	private String kechechepaihao;
	
	
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
	 * 设置：班次
	 */
	public void setBanci(String banci) {
		this.banci = banci;
	}
	/**
	 * 获取：班次
	 */
	public String getBanci() {
		return banci;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：出发日期
	 */
	public void setChufariqi(Date chufariqi) {
		this.chufariqi = chufariqi;
	}
	/**
	 * 获取：出发日期
	 */
	public Date getChufariqi() {
		return chufariqi;
	}
	/**
	 * 设置：出发时间
	 */
	public void setChufashijian(String chufashijian) {
		this.chufashijian = chufashijian;
	}
	/**
	 * 获取：出发时间
	 */
	public String getChufashijian() {
		return chufashijian;
	}
	/**
	 * 设置：起点
	 */
	public void setQidian(String qidian) {
		this.qidian = qidian;
	}
	/**
	 * 获取：起点
	 */
	public String getQidian() {
		return qidian;
	}
	/**
	 * 设置：途经
	 */
	public void setTujing(String tujing) {
		this.tujing = tujing;
	}
	/**
	 * 获取：途经
	 */
	public String getTujing() {
		return tujing;
	}
	/**
	 * 设置：终点
	 */
	public void setZhongdian(String zhongdian) {
		this.zhongdian = zhongdian;
	}
	/**
	 * 获取：终点
	 */
	public String getZhongdian() {
		return zhongdian;
	}
	/**
	 * 设置：时长
	 */
	public void setShizhang(String shizhang) {
		this.shizhang = shizhang;
	}
	/**
	 * 获取：时长
	 */
	public String getShizhang() {
		return shizhang;
	}
	/**
	 * 设置：座位类型
	 */
	public void setZuoweileixing(String zuoweileixing) {
		this.zuoweileixing = zuoweileixing;
	}
	/**
	 * 获取：座位类型
	 */
	public String getZuoweileixing() {
		return zuoweileixing;
	}
	/**
	 * 设置：票价
	 */
	public void setPiaojia(Integer piaojia) {
		this.piaojia = piaojia;
	}
	/**
	 * 获取：票价
	 */
	public Integer getPiaojia() {
		return piaojia;
	}
	/**
	 * 设置：票数
	 */
	public void setPiaoshu(Integer piaoshu) {
		this.piaoshu = piaoshu;
	}
	/**
	 * 获取：票数
	 */
	public Integer getPiaoshu() {
		return piaoshu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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

}
