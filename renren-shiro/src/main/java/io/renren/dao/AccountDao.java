package io.renren.dao;

import io.renren.entity.AccountEntity;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:35
 */
public interface AccountDao extends BaseDao<AccountEntity> {
	
	/**
	 * 根据用户获取账户列表信息
	 * @param userIdList
	 * @return
	 */
	List<AccountEntity> getAccountListByUserIdList(@Param("userIdList")List<Long> userIdList);
	
	/**
	 * 获取所有二级商务用户
	 * @return
	 */
	List<AccountEntity> getAllCommerceAccount();
	
	/**
	 * 获取当前在职的所有二级商务账户
	 * @return
	 */
	List<AccountEntity> getAllActiveCommerceAccount();
	
	/**
	 * 根据用户id获取关联的账户
	 * @param userId
	 * @return
	 */
	AccountEntity getAccountByUserId(@Param("userId") Long userId);
	
}
