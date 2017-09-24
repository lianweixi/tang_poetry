package com.lian.util;

import java.util.List;

public class Pager<T> {

	private int pageNo = 1;	
	private int pageSize = 10;	
	private int recordCount;	
	private int pageCount;
	private boolean hasFirst;
	private boolean hasPrevious;
	private boolean hasNext;
	private boolean hasLast;
	
//	private List<T> data;
	
	public Pager() {
		
	}
	
	public Pager(int pageNo, int recordCount) {
		this.pageNo = pageNo;
		this.recordCount = recordCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		if (this.getRecordCount() <= 0) {
			return 0;
		} else {
			pageCount = (recordCount + pageSize - 1) / pageSize;
		}
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

//	public List<T> getData() {
//		return data;
//	}
//
//	public void setData(List<T> data) {
//		this.data = data;
//	}

	public boolean isHasFirst() {
		if (pageNo == 1) {
			return false;
		}
		return true;
	}

	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}

	public boolean isHasPrevious() {
		if(isHasFirst())
			return true;
		else
			return false;
	}

	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}

	public boolean isHasNext() {
		if(isHasLast())
			return true;
		else
			return false;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public boolean isHasLast() {
		if(pageNo == getPageCount())
			return false;
		else
			return true;
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
	
	
	
}
