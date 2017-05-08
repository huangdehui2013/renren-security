package io.renren.service;

import io.renren.entity.AccountMasterDomainEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:34
 */
public interface AccountMasterDomainService {
	
	AccountMasterDomainEntity queryObject(Integer id);
	
	List<AccountMasterDomainEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(AccountMasterDomainEntity accountMasterDomain);
	
	void update(AccountMasterDomainEntity accountMasterDomain);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
