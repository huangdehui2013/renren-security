package io.renren.service;

import io.renren.entity.FlowProductEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yiyongwu
 * @email 137374543@qq.com
 * @date 2017-05-04 18:31:33
 */
public interface FlowProductService {
	
	FlowProductEntity queryObject(Integer id);
	
	List<FlowProductEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(FlowProductEntity flowProduct);
	
	void update(FlowProductEntity flowProduct);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
