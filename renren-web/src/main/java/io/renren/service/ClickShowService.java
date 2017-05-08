package io.renren.service;

import io.renren.entity.ClickShowEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:34
 */
public interface ClickShowService {
	
	ClickShowEntity queryObject(Integer id);
	
	List<ClickShowEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ClickShowEntity clickShow);
	
	void update(ClickShowEntity clickShow);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
