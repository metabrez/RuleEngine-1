package com.RuleEngine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RuleEngine.dao.sm_nodesDAO;
import com.RuleEngine.model.sm_nodes;

@Service
public class Sm_nodesServiceImpl implements Sm_nodesService {
	
	@Autowired
	private sm_nodesDAO sm_nodesDAO;

	@Override
	public void cleanup(){
		
	}
	
	@Transactional
	public List<sm_nodes> getSm_nodes() {
		return new ArrayList<sm_nodes>();
	}
}

