package com.entity.model;

import com.entity.ChepiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 车票信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-08 16:42:30
 */
public class ChepiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 出发日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
