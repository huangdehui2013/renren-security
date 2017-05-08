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

import io.renren.entity.FlowProductEntity;
import io.renren.service.FlowProductService;
import io.renren.utils.PageUtils;
import io.renren.utils.Query;
import io.renren.utils.R;


/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:33
 */
@RestController
@RequestMapping("flowproduct")
public class FlowProductController {
	@Autowired
	private FlowProductService flowProductService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("flowproduct:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<FlowProductEntity> flowProductList = flowProductService.queryList(query);
		int total = flowProductService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(flowProductList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("flowproduct:info")
	public R info(@PathVariable("id") Integer id){
		FlowProductEntity flowProduct = flowProductService.queryObject(id);
		
		return R.ok().put("flowProduct", flowProduct);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("flowproduct:save")
	public R save(@RequestBody FlowProductEntity flowProduct){
		flowProductService.save(flowProduct);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("flowproduct:update")
	public R update(@RequestBody FlowProductEntity flowProduct){
		flowProductService.update(flowProduct);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("flowproduct:delete")
	public R delete(@RequestBody Integer[] ids){
		flowProductService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
