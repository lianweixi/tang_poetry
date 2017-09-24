package com.lian.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lian.dao.PoetryDao;
import com.lian.entity.Poetry;
import com.lian.pojo.Search;
import com.lian.service.PoetryService;

@Service("poetryService")
public class PoetryServiceImpl implements PoetryService {
	
	@Resource(name="poetryDao")
	private PoetryDao poetryDao;
	
	public PoetryDao getPoetryDao() {
		return poetryDao;
	}

	public void setPoetryDao(PoetryDao poetryDao) {
		this.poetryDao = poetryDao;
	}

	@Transactional(readOnly=true)
	public int getPoetriesNum(String way, String content) {
		int num = 0;
		switch (way) {
		case "name" :
			num = poetryDao.getPoetriesNumByPoetName(content);
			break;
		case "title" :
			num = poetryDao.getPoetriesNumByTitle(content);
			break;
		case "content" :
			num = poetryDao.getPoetriesNumByContent(content);
			break;
		default :				
			break;
		}
		return num;
	}

	@Transactional(readOnly=true)
	public List<Poetry> getPoetries(Search search, int pageSize) {
		List<Poetry> poetries = null;
		HashMap map = new HashMap();
		switch (search.getWay()) {
		case "name" :			
			map.put("poetName", search.getSearchContent());
			map.put("startIndex", (search.getPageNo() - 1) * pageSize);
			map.put("pageSize", pageSize);
			poetries = poetryDao.getPoetriesByPoetName(map);
			break;
		case "title" :
			map.put("title", search.getSearchContent());
			map.put("startIndex", (search.getPageNo() - 1) * pageSize);
			map.put("pageSize", pageSize);
			poetries = poetryDao.getPoetriesByTitle(map);
			break;
		case "content" :
			map.put("content", search.getSearchContent());
			map.put("startIndex", (search.getPageNo() - 1) * pageSize);
			map.put("pageSize", pageSize);
			poetries = poetryDao.getPoetriesByContent(map);
			break;
		default :		
			break;
		}
		return poetries;
	}

}
