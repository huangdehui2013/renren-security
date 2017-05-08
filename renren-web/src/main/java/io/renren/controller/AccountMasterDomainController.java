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

import io.renren.entity.AccountMasterDomainEntity;
import io.renren.service.AccountMasterDomainService;
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
@RequestMapping("accountmasterdomain")
public class AccountMasterDomainController {
	@Autowired
	private AccountMasterDomainService accountMasterDomainService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("accountmasterdomain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<AccountMasterDomainEntity> accountMasterDomainList = accountMasterDomainService.queryList(query);
		int total = accountMasterDomainService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(accountMasterDomainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("accountmasterdomain:info")
	public R info(@PathVariable("id") Integer id){
		AccountMasterDomainEntity accountMasterDomain = accountMasterDomainService.queryObject(id);
		
		return R.ok().put("accountMasterDomain", accountMasterDomain);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("accountmasterdomain:save")
	public R save(@RequestBody AccountMasterDomainEntity accountMasterDomain){
		accountMasterDomainService.save(accountMasterDomain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("accountmasterdomain:update")
	public R update(@RequestBody AccountMasterDomainEntity accountMasterDomain){
		accountMasterDomainService.update(accountMasterDomain);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("accountmasterdomain:delete")
	public R delete(@RequestBody Integer[] ids){
		accountMasterDomainService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
