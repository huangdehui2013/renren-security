package io.renren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.dao.AccountCustomerDomainDao;
import io.renren.entity.AccountCustomerDomainEntity;
import io.renren.service.AccountCustomerDomainService;



@Service("accountCustomerDomainService")
public class AccountCustomerDomainServiceImpl implements AccountCustomerDomainService {
	@Autowired
	private AccountCustomerDomainDao accountCustomerDomainDao;
	
	@Override
	public AccountCustomerDomainEntity queryObject(Integer id){
		return accountCustomerDomainDao.queryObject(id);
	}
	
	@Override
	public List<AccountCustomerDomainEntity> queryList(Map<String, Object> map){
		return accountCustomerDomainDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return accountCustomerDomainDao.queryTotal(map);
	}
	
	@Override
	public void save(AccountCustomerDomainEntity accountCustomerDomain){
		accountCustomerDomainDao.save(accountCustomerDomain);
	}
	
	@Override
	public void update(AccountCustomerDomainEntity accountCustomerDomain){
		accountCustomerDomainDao.update(accountCustomerDomain);
	}
	
	@Override
	public void delete(Integer id){
		accountCustomerDomainDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		accountCustomerDomainDao.deleteBatch(ids);
	}
	
}
