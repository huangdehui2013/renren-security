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

import io.renren.entity.AccountBillHistoryEntity;
import io.renren.service.AccountBillHistoryService;
import io.renren.utils.PageUtils;
import io.renren.utils.Query;
import io.renren.utils.R;


/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:35
 */
@RestController
@RequestMapping("accountbillhistory")
public class AccountBillHistoryController {
	@Autowired
	private AccountBillHistoryService accountBillHistoryService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("accountbillhistory:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<AccountBillHistoryEntity> accountBillHistoryList = accountBillHistoryService.queryList(query);
		int total = accountBillHistoryService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(accountBillHistoryList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("accountbillhistory:info")
	public R info(@PathVariable("id") Integer id){
		AccountBillHistoryEntity accountBillHistory = accountBillHistoryService.queryObject(id);
		
		return R.ok().put("accountBillHistory", accountBillHistory);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("accountbillhistory:save")
	public R save(@RequestBody AccountBillHistoryEntity accountBillHistory){
		accountBillHistoryService.save(accountBillHistory);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("accountbillhistory:update")
	public R update(@RequestBody AccountBillHistoryEntity accountBillHistory){
		accountBillHistoryService.update(accountBillHistory);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("accountbillhistory:delete")
	public R delete(@RequestBody Integer[] ids){
		accountBillHistoryService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
