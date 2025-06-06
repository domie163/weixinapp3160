package com.entity.model;

import com.entity.SijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 司机
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-08 16:42:30
 */
public class SijiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 客车车牌号
	 */
	
	private String kechechepaihao;
		
	/**
	 * 客车类型
	 */
	
	private String kecheleixing;
		
	/**
	 * 客车价格
	 */
	
	private String kechejiage;
		
	/**
	 * 核载人数
	 */
	
	private String hezairenshu;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
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
	 * 设置：客车价格
	 */
	 
	public void setKechejiage(String kechejiage) {
		this.kechejiage = kechejiage;
	}
	
	/**
	 * 获取：客车价格
	 */
	public String getKechejiage() {
		return kechejiage;
	}
				
	
	/**
	 * 设置：核载人数
	 */
	 
	public void setHezairenshu(String hezairenshu) {
		this.hezairenshu = hezairenshu;
	}
	
	/**
	 * 获取：核载人数
	 */
	public String getHezairenshu() {
		return hezairenshu;
	}
			
}
