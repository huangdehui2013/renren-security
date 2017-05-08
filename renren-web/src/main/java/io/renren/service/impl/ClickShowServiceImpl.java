package io.renren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.dao.ClickShowDao;
import io.renren.entity.ClickShowEntity;
import io.renren.service.ClickShowService;



@Service("clickShowService")
public class ClickShowServiceImpl implements ClickShowService {
	@Autowired
	private ClickShowDao clickShowDao;
	
	@Override
	public ClickShowEntity queryObject(Integer id){
		return clickShowDao.queryObject(id);
	}
	
	@Override
	public List<ClickShowEntity> queryList(Map<String, Object> map){
		return clickShowDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return clickShowDao.queryTotal(map);
	}
	
	@Override
	public void save(ClickShowEntity clickShow){
		clickShowDao.save(clickShow);
	}
	
	@Override
	public void update(ClickShowEntity clickShow){
		clickShowDao.update(clickShow);
	}
	
	@Override
	public void delete(Integer id){
		clickShowDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		clickShowDao.deleteBatch(ids);
	}
	
}
