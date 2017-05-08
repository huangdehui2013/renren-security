package io.renren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.dao.AccountBillHistoryDao;
import io.renren.entity.AccountBillHistoryEntity;
import io.renren.service.AccountBillHistoryService;



@Service("accountBillHistoryService")
public class AccountBillHistoryServiceImpl implements AccountBillHistoryService {
	@Autowired
	private AccountBillHistoryDao accountBillHistoryDao;
	
	@Override
	public AccountBillHistoryEntity queryObject(Integer id){
		return accountBillHistoryDao.queryObject(id);
	}
	
	@Override
	public List<AccountBillHistoryEntity> queryList(Map<String, Object> map){
		return accountBillHistoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return accountBillHistoryDao.queryTotal(map);
	}
	
	@Override
	public void save(AccountBillHistoryEntity accountBillHistory){
		accountBillHistoryDao.save(accountBillHistory);
	}
	
	@Override
	public void update(AccountBillHistoryEntity accountBillHistory){
		accountBillHistoryDao.update(accountBillHistory);
	}
	
	@Override
	public void delete(Integer id){
		accountBillHistoryDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		accountBillHistoryDao.deleteBatch(ids);
	}
	
}
