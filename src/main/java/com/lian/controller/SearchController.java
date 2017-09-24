package com.lian.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lian.entity.Poetry;
import com.lian.pojo.Search;
import com.lian.service.PoetryService;
import com.lian.util.Pager;

@Controller("searchController")
public class SearchController {
	
	@Resource(name="poetryService")
	private PoetryService poetryService;
	
	public PoetryService getPoetryService() {
		return poetryService;
	}

	public void setPoetryService(PoetryService poetryService) {
		this.poetryService = poetryService;
	}

	@RequestMapping(value="/")
	public String openMainPage() {
		return "main";
	}
	
	@RequestMapping(value="/center")
	public String openCenterPage() {
		return "center";
	}
	
	@RequestMapping(value="/search")
	public String search(Search search, ModelMap map) {
		int totalNum = poetryService.getPoetriesNum(search.getWay(), search.getSearchContent());
		Pager pager = new Pager(search.getPageNo(), totalNum);
		List<Poetry> poetries = poetryService.getPoetries(search, pager.getPageSize());
		if (poetries != null && poetries.size() > 0) {
			map.addAttribute("way", search.getWay());
			map.addAttribute("searchContent", search.getSearchContent());
			map.addAttribute("poetries", poetries);
			map.addAttribute("page", pager);
		} else {
			map.addAttribute("msg", "未查询到结果");
		}
		return "center";
	}
}
