package com.entity.model;

import com.entity.DingdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public class DingdanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班次
	 */
	
	private String banci;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 客车车牌号
	 */
	
	private String kechechepaihao;
		
	/**
	 * 出发日期
	 */
	
	private String chufariqi;
		
	/**
	 * 出发时间
	 */
	
	private String chufashijian;
		
	/**
	 * 起点
	 */
	
	private String qidian;
		
	/**
	 * 终点
	 */
	
	private String zhongdian;
		
	/**
	 * 座位类型
	 */
	
	private String zuoweileixing;
		
	/**
	 * 票价
	 */
	
	private String piaojia;
		
	/**
	 * 票数
	 */
	
	private Integer piaoshu;
		
	/**
	 * 总价格
	 */
	
	private Integer zongjiage;
		
	/**
	 * 购票内容
	 */
	
	private String goupiaoneirong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
				
	
	/**
	 * 设置：出发日期
	 */
	 
	public void setChufariqi(String chufariqi) {
		this.chufariqi = chufariqi;
	}
	
	/**
	 * 获取：出发日期
	 */
	public String getChufariqi() {
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
	 
	public void setPiaojia(String piaojia) {
		this.piaojia = piaojia;
	}
	
	/**
	 * 获取：票价
	 */
	public String getPiaojia() {
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
	 * 设置：总价格
	 */
	 
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
				
	
	/**
	 * 设置：购票内容
	 */
	 
	public void setGoupiaoneirong(String goupiaoneirong) {
		this.goupiaoneirong = goupiaoneirong;
	}
	
	/**
	 * 获取：购票内容
	 */
	public String getGoupiaoneirong() {
		return goupiaoneirong;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
