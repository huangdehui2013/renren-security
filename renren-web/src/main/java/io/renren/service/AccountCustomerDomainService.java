package io.renren.service;

import io.renren.entity.AccountCustomerDomainEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:34
 */
public interface AccountCustomerDomainService {
	
	AccountCustomerDomainEntity queryObject(Integer id);
	
	List<AccountCustomerDomainEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(AccountCustomerDomainEntity accountCustomerDomain);
	
	void update(AccountCustomerDomainEntity accountCustomerDomain);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
