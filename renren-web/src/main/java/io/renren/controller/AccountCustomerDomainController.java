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

import io.renren.entity.AccountCustomerDomainEntity;
import io.renren.service.AccountCustomerDomainService;
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
@RequestMapping("accountcustomerdomain")
public class AccountCustomerDomainController {
	@Autowired
	private AccountCustomerDomainService accountCustomerDomainService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("accountcustomerdomain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<AccountCustomerDomainEntity> accountCustomerDomainList = accountCustomerDomainService.queryList(query);
		int total = accountCustomerDomainService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(accountCustomerDomainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("accountcustomerdomain:info")
	public R info(@PathVariable("id") Integer id){
		AccountCustomerDomainEntity accountCustomerDomain = accountCustomerDomainService.queryObject(id);
		
		return R.ok().put("accountCustomerDomain", accountCustomerDomain);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("accountcustomerdomain:save")
	public R save(@RequestBody AccountCustomerDomainEntity accountCustomerDomain){
		accountCustomerDomainService.save(accountCustomerDomain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("accountcustomerdomain:update")
	public R update(@RequestBody AccountCustomerDomainEntity accountCustomerDomain){
		accountCustomerDomainService.update(accountCustomerDomain);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("accountcustomerdomain:delete")
	public R delete(@RequestBody Integer[] ids){
		accountCustomerDomainService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
