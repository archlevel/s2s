package com.oimboi.service.s2s;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.oimboi.service.s2s.dao.ICodeDAO;
import com.oimboi.service.s2s.dao.model.Code;
import com.tower.service.aop.Loggable;

public class HelloImpl implements IHello {
	@Resource(name="Code")
	private ICodeDAO<Code> codeDAOImpl;
	
	@Override
	@Loggable
	@Transactional
	public void sayHello() {
		Code model = new Code();
		model.setName("siling");
		codeDAOImpl.insert(model, null);
		model = new Code();
		model.setName("siling");
		codeDAOImpl.insert(model, null);
		model = new Code();
		model.setName("siling");
		codeDAOImpl.insert(model, null);
	}

}
