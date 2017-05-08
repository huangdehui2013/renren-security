package io.renren.service;

import io.renren.entity.AccountBillHistoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:35
 */
public interface AccountBillHistoryService {
	
	AccountBillHistoryEntity queryObject(Integer id);
	
	List<AccountBillHistoryEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(AccountBillHistoryEntity accountBillHistory);
	
	void update(AccountBillHistoryEntity accountBillHistory);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
