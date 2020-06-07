package com.atguigu.crowd.funding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crowd.funding.entity.Admin;
import com.atguigu.crowd.funding.entity.AdminExample;
import com.atguigu.crowd.funding.mapper.AdminMapper;
import com.atguigu.crowd.funding.service.api.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public List<Admin> getAll() {
		return adminMapper.selectByExample(new AdminExample());
	}

	@Override
	public void updateAdmin() {
		adminMapper.updateByPrimaryKey(new Admin(1, "harry333", "123123", "哈利333", "harry@qq.com", null));
		System.out.println(10 / 0);
		adminMapper.updateByPrimaryKey(new Admin(2, "poter333", "123123", "波特333", "poter@qq.com", null));
	}

}
