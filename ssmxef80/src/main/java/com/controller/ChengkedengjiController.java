package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChengkedengjiEntity;
import com.entity.view.ChengkedengjiView;

import com.service.ChengkedengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 乘客登记
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-08 16:42:31
 */
@RestController
@RequestMapping("/chengkedengji")
public class ChengkedengjiController {
    @Autowired
    private ChengkedengjiService chengkedengjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChengkedengjiEntity chengkedengji, HttpServletRequest request){

        EntityWrapper<ChengkedengjiEntity> ew = new EntityWrapper<ChengkedengjiEntity>();
		PageUtils page = chengkedengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengkedengji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChengkedengjiEntity chengkedengji, HttpServletRequest request){
        EntityWrapper<ChengkedengjiEntity> ew = new EntityWrapper<ChengkedengjiEntity>();
		PageUtils page = chengkedengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengkedengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChengkedengjiEntity chengkedengji){
       	EntityWrapper<ChengkedengjiEntity> ew = new EntityWrapper<ChengkedengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chengkedengji, "chengkedengji")); 
        return R.ok().put("data", chengkedengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChengkedengjiEntity chengkedengji){
        EntityWrapper< ChengkedengjiEntity> ew = new EntityWrapper< ChengkedengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chengkedengji, "chengkedengji")); 
		ChengkedengjiView chengkedengjiView =  chengkedengjiService.selectView(ew);
		return R.ok("查询乘客登记成功").put("data", chengkedengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChengkedengjiEntity chengkedengji = chengkedengjiService.selectById(id);
        return R.ok().put("data", chengkedengji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChengkedengjiEntity chengkedengji = chengkedengjiService.selectById(id);
        return R.ok().put("data", chengkedengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChengkedengjiEntity chengkedengji, HttpServletRequest request){
    	chengkedengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chengkedengji);

        chengkedengjiService.insert(chengkedengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChengkedengjiEntity chengkedengji, HttpServletRequest request){
    	chengkedengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chengkedengji);

        chengkedengjiService.insert(chengkedengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChengkedengjiEntity chengkedengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chengkedengji);
        chengkedengjiService.updateById(chengkedengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chengkedengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ChengkedengjiEntity> wrapper = new EntityWrapper<ChengkedengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = chengkedengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
