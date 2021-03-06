package com.snowstore.pontus.vo.req;

import javax.ws.rs.FormParam;
import org.hibernate.validator.constraints.NotBlank;
import com.snowstore.pontus.vo.RequestVo;

public class TransferQueryReq extends RequestVo {

	@FormParam(value = "page")
	@NotBlank
	private String page;

	@FormParam(value = "rows")
	@NotBlank
	private String rows;

	@FormParam(value = "orderBy")
	@NotBlank
	private String orderBy;
	
	@FormParam(value = "desc")
	private String sort = "desc";

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "TransferQueryReq [page=" + page + ", rows=" + rows + ", orderBy=" + orderBy + ", sort=" + sort + ", getAccessToken()=" + getAccessToken() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
