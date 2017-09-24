package com.lian.service;

import java.util.List;

import com.lian.entity.Poetry;
import com.lian.pojo.Search;

public interface PoetryService {
	public int getPoetriesNum(String way, String content);
	public List<Poetry> getPoetries(Search search, int pageSize);
}
