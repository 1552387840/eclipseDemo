package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUIDataGridResult implements Serializable{
	//总记录条数
   private long total;
   //返回一个集合，集合里面包装了商品列表对象，用？的意义是可以访问任意对象
   private List<?> rows;
public long getTotal() {
	return total;
}
public void setTotal(long total) {
	this.total = total;
}
public List<?> getRows() {
	return rows;
}
public void setRows(List<?> rows) {
	this.rows = rows;
}
}
