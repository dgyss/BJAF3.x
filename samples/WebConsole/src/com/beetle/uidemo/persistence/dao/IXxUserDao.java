package com.beetle.uidemo.persistence.dao;

import java.util.List;

import com.beetle.framework.persistence.access.operator.DBOperatorException;
import com.beetle.framework.resource.define.PageList;
import com.beetle.uidemo.valueobject.XxUser;

public interface IXxUserDao {
	XxUser get(Long userid) throws DBOperatorException;

	List<XxUser> getAll() throws DBOperatorException;

	int insert(XxUser xxUser) throws DBOperatorException;

	int update(XxUser xxUser) throws DBOperatorException;

	int delete(Long userid) throws DBOperatorException;

	PageList<XxUser> getAllUserByPage(int pageNumber, int pageSize,
			String orderField, String orderArith) throws DBOperatorException;

	PageList<XxUser> findByName(String username, int pageNumber, int pageSize,
			String orderField, String orderArith) throws DBOperatorException;

	long generateUserId() throws DBOperatorException;
}
