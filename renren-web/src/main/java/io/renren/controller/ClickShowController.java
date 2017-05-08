package io.renren.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.entity.ClickShowEntity;
import io.renren.service.ClickShowService;
import io.renren.utils.PageUtils;
import io.renren.utils.Query;
import io.renren.utils.R;


/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:34
 */
@RestController
@RequestMapping("clickshow")
public class ClickShowController {
	@Autowired
	private ClickShowService clickShowService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("clickshow:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<ClickShowEntity> clickShowList = clickShowService.queryList(query);
		int total = clickShowService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(clickShowList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("clickshow:info")
	public R info(@PathVariable("id") Integer id){
		ClickShowEntity clickShow = clickShowService.queryObject(id);
		
		return R.ok().put("clickShow", clickShow);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("clickshow:save")
	public R save(@RequestBody ClickShowEntity clickShow){
		clickShowService.save(clickShow);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("clickshow:update")
	public R update(@RequestBody ClickShowEntity clickShow){
		clickShowService.update(clickShow);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("clickshow:delete")
	public R delete(@RequestBody Integer[] ids){
		clickShowService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
