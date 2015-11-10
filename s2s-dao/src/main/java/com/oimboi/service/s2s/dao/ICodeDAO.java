package com.oimboi.service.s2s.dao;

import com.tower.service.dao.IDAO;
import com.tower.service.dao.IFKDAO;
import com.tower.service.dao.IIDAO;

import com.oimboi.service.s2s.dao.model.Code;

public interface ICodeDAO<T extends Code> extends IIDAO<T>,IFKDAO<T>,IDAO<T> {

}
