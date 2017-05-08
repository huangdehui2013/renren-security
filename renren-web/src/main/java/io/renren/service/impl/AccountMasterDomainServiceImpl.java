package io.renren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.dao.AccountMasterDomainDao;
import io.renren.entity.AccountMasterDomainEntity;
import io.renren.service.AccountMasterDomainService;



@Service("accountMasterDomainService")
public class AccountMasterDomainServiceImpl implements AccountMasterDomainService {
	@Autowired
	private AccountMasterDomainDao accountMasterDomainDao;
	
	@Override
	public AccountMasterDomainEntity queryObject(Integer id){
		return accountMasterDomainDao.queryObject(id);
	}
	
	@Override
	public List<AccountMasterDomainEntity> queryList(Map<String, Object> map){
		return accountMasterDomainDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return accountMasterDomainDao.queryTotal(map);
	}
	
	@Override
	public void save(AccountMasterDomainEntity accountMasterDomain){
		accountMasterDomainDao.save(accountMasterDomain);
	}
	
	@Override
	public void update(AccountMasterDomainEntity accountMasterDomain){
		accountMasterDomainDao.update(accountMasterDomain);
	}
	
	@Override
	public void delete(Integer id){
		accountMasterDomainDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		accountMasterDomainDao.deleteBatch(ids);
	}
	
}
