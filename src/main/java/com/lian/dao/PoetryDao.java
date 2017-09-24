package com.lian.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lian.entity.Poetry;

@Repository("poetryDao")
public interface PoetryDao {
	public int getPoetriesNumByPoetName(String poetName);
	/**
	 * 诗人名字检索
	 * @param conn
	 * @param poetName
	 * @return
	 * @throws SQLException
	 */
	public List<Poetry> getPoetriesByPoetName(HashMap map);
	
	
	public int getPoetriesNumByTitle(String title);
	/**
	 * 诗名检索
	 * @param conn
	 * @param title
	 * @return
	 * @throws SQLException
	 */
	public List<Poetry> getPoetriesByTitle(HashMap map);
	
	
	public int getPoetriesNumByContent(String content);
	/**
	 * 名句检索
	 * @param conn
	 * @param content
	 * @return
	 * @throws SQLException
	 */
	public List<Poetry> getPoetriesByContent(HashMap map);
}
