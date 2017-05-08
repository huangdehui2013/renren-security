package io.renren.service;

import io.renren.entity.AccountEntity;
import io.renren.entity.SysUserEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:35
 */
public interface AccountService {
	
	AccountEntity queryObject(Integer id);
	
	List<AccountEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(AccountEntity account);
	
	void update(AccountEntity account);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
	
	/**
	 * 为用户列表添加账号相关的信息
	 * @param userList
	 */
	void addUserListAccountInfo(List<SysUserEntity> userList);
	
	/**
	 * 为单个用户添加账号信息，编辑用户的时候用到
	 * @param sysUser
	 */
	void addUserAccountInfo(SysUserEntity sysUser);
	
	/**
	 * 插入账户信息，当添加一条系统用户记录的时候
	 * @param sysUser
	 */
	void saveWhenInsertUser(SysUserEntity sysUser);
	
	/**
	 * 更新账户信息  当更新系统用户信息的时候
	 * @param sysUser
	 */
	void updateWhenInsertUser(SysUserEntity sysUser);
}
