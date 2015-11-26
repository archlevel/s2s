package com.oimboi.service.s2s.dao.ibatis;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.tower.service.dao.ibatis.AbsIntIDIBatisDAOImpl;
import com.tower.service.dao.ibatis.IIMapper;

import com.tower.service.dao.ibatis.IBatisDAOException;

import com.oimboi.service.s2s.dao.ICodeDAO;
import com.oimboi.service.s2s.dao.ibatis.mapper.CodeMapper;
import com.oimboi.service.s2s.dao.model.Code;
import com.tower.service.dao.ibatis.SqlmapUtils;
import com.tower.service.exception.DataAccessException;

@Repository("Code")
public class CodeIbatisDAOImpl extends AbsIntIDIBatisDAOImpl<Code> implements ICodeDAO<Code> {

	@Resource(name = "s2sSessionFactory")
	private SqlSessionFactory masterSessionFactory;
	
	@Resource(name = "s2sSlaveSessionFactory")
	private SqlSessionFactory slaveSessionFactory;
	
	@Resource(name = "s2sMapQuerySessionFactory")
	private SqlSessionFactory mapQuerySessionFactory;
	
	@Override
	public int getVersion(){
		//代码生成器版本号，请不要手动改
	    return 2;
	}
  
	@Override
	public Class<CodeMapper> getMapperClass() {
		
		return CodeMapper.class;
	}
	
	@Override
	public Class<Code> getModelClass() {
		
		return Code.class;
	}
	
	@Override
	public boolean isFk(String property) {
	
		return Code.isFk(property);
	}
	
	public String getTableName() {
    	return "code";
  	}
  
	@Override
	public SqlSessionFactory getMasterSessionFactory(){
		return masterSessionFactory;
	}
	
	
	@Override
	public SqlSessionFactory getSlaveSessionFactory(){
		if (slaveSessionFactory == null) {
 			return getMasterSessionFactory();
 		}
 		return slaveSessionFactory;
	}
	
	@Override
	public SqlSessionFactory getMapQuerySessionFactory(){
		if (mapQuerySessionFactory == null) {
 			return getSlaveSessionFactory();
 		}
 		return mapQuerySessionFactory;
	}
	
	
	public Integer insert(Code model, String tabNameSuffix) {
		if (logger.isDebugEnabled()) {
      		logger.debug("insert(T model={}, String tabNameSuffix={}) - start", model, tabNameSuffix); //$NON-NLS-1$
    	}
    	
    	validate(model);
    	
    	model.setTowerTabName(this.get$TowerTabName(tabNameSuffix));
    
    	SqlSessionFactory sessionFactory = this.getMasterSessionFactory();
	    SqlSession session = SqlmapUtils.openSession(sessionFactory);
    	try {
      		IIMapper<Code> mapper = session.getMapper(getMapperClass());
      		Long id = mapper.insert(model);
      		if (id !=null) {
        		this.incrTabVersion(tabNameSuffix);
      		}

      		if (logger.isDebugEnabled()) {
        		logger.debug("insert(T model={}, String tabNameSuffix={}) - end - return value={}", model, tabNameSuffix, id); //$NON-NLS-1$
      		}
      		return model.getId();
    	} catch (Exception t) {
      		logger.error("insert(T, String)", t); //$NON-NLS-1$
      		throw new DataAccessException(IBatisDAOException.MSG_2_0001, t);
    	} finally {
     		SqlmapUtils.release(session,sessionFactory);
    	}
  	}
	
}
