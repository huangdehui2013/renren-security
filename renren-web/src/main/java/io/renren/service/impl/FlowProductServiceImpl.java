package io.renren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.dao.FlowProductDao;
import io.renren.entity.FlowProductEntity;
import io.renren.service.FlowProductService;



@Service("flowProductService")
public class FlowProductServiceImpl implements FlowProductService {
	@Autowired
	private FlowProductDao flowProductDao;
	
	@Override
	public FlowProductEntity queryObject(Integer id){
		return flowProductDao.queryObject(id);
	}
	
	@Override
	public List<FlowProductEntity> queryList(Map<String, Object> map){
		return flowProductDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return flowProductDao.queryTotal(map);
	}
	
	@Override
	public void save(FlowProductEntity flowProduct){
		flowProductDao.save(flowProduct);
	}
	
	@Override
	public void update(FlowProductEntity flowProduct){
		flowProductDao.update(flowProduct);
	}
	
	@Override
	public void delete(Integer id){
		flowProductDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		flowProductDao.deleteBatch(ids);
	}
	
}
