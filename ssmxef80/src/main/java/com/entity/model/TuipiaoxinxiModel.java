package com.entity.model;

import com.entity.TuipiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 退票信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
public class TuipiaoxinxiModel  implements Serializable {
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
	 * 票数
	 */
	
	private String piaoshu;
		
	/**
	 * 总价格
	 */
	
	private String zongjiage;
		
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
	 * 退票原因
	 */
	
	private String tuipiaoyuanyin;
		
	/**
	 * 退票日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuipiaoriqi;
		
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
	 * 设置：票数
	 */
	 
	public void setPiaoshu(String piaoshu) {
		this.piaoshu = piaoshu;
	}
	
	/**
	 * 获取：票数
	 */
	public String getPiaoshu() {
		return piaoshu;
	}
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(String zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public String getZongjiage() {
		return zongjiage;
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
	 * 设置：退票原因
	 */
	 
	public void setTuipiaoyuanyin(String tuipiaoyuanyin) {
		this.tuipiaoyuanyin = tuipiaoyuanyin;
	}
	
	/**
	 * 获取：退票原因
	 */
	public String getTuipiaoyuanyin() {
		return tuipiaoyuanyin;
	}
				
	
	/**
	 * 设置：退票日期
	 */
	 
	public void setTuipiaoriqi(Date tuipiaoriqi) {
		this.tuipiaoriqi = tuipiaoriqi;
	}
	
	/**
	 * 获取：退票日期
	 */
	public Date getTuipiaoriqi() {
		return tuipiaoriqi;
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
