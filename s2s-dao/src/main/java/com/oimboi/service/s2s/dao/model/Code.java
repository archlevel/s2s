package com.oimboi.service.s2s.dao.model;

import java.util.HashMap;
import java.util.Map;

import com.tower.service.annotation.JField;
import com.tower.service.dao.IModel;

public class Code implements IModel{
	
	private static final long serialVersionUID = 1L;
	
	static Map<String,Integer> fks = new HashMap<String,Integer>();
	
	static{
		/**
		 * 把该model相关的外键属性字段注册到fks map中
		 */
		//eg:fks.put("cityId",0);
	}
	/**
	 * 是否是外键字段
     */
    public static boolean isFk(String name){
    	return fks.containsKey(name);
    }

	/**
	 * 主键
	 */
	@JField(name="id")
 	protected Integer id;
 	
  	public void setId(Integer id){
  		this.id=id;
  	}
  	
  	public Integer getId(){
  		return this.id;
  	}
	/**
	 * 编号
	 */
	@JField(name="no")
  	private String no;
  	
  	public void setNo(String no){
  		this.no=no;
  	}
  	
  	public String getNo(){
  		return this.no;
  	}
	/**
	 * 名称
	 */
	@JField(name="name")
  	private String name;
  	
  	public void setName(String name){
  		this.name=name;
  	}
  	
  	public String getName(){
  		return this.name;
  	}
	/**
	 * 节点编号
	 */
	@JField(name="item_no")
  	private String itemNo;
  	
  	public void setItemNo(String itemNo){
  		this.itemNo=itemNo;
  	}
  	
  	public String getItemNo(){
  		return this.itemNo;
  	}
	/**
	 * 节点键
	 */
	@JField(name="item_key")
  	private String itemKey;
  	
  	public void setItemKey(String itemKey){
  		this.itemKey=itemKey;
  	}
  	
  	public String getItemKey(){
  		return this.itemKey;
  	}
	/**
	 * 节点值
	 */
	@JField(name="item_value")
  	private String itemValue;
  	
  	public void setItemValue(String itemValue){
  		this.itemValue=itemValue;
  	}
  	
  	public String getItemValue(){
  		return this.itemValue;
  	}
	/**
	 * 排序号
	 */
	@JField(name="sequence")
  	private Integer sequence;
  	
  	public void setSequence(Integer sequence){
  		this.sequence=sequence;
  	}
  	
  	public Integer getSequence(){
  		return this.sequence;
  	}
	/**
	 * 是否使用
	 */
	@JField(name="is_use")
  	private String isUse;
  	
  	public void setIsUse(String isUse){
  		this.isUse=isUse;
  	}
  	
  	public String getIsUse(){
  		return this.isUse;
  	}
	/**
	 * 创建时间
	 */
	@JField(name="create_time")
  	private java.sql.Timestamp createTime;
  	
  	public void setCreateTime(java.sql.Timestamp createTime){
  		this.createTime=createTime;
  	}
  	
  	public java.sql.Timestamp getCreateTime(){
  		return this.createTime;
  	}
	/**
	 * 更新时间
	 */
	@JField(name="update_time")
  	private java.sql.Timestamp updateTime;
  	
  	public void setUpdateTime(java.sql.Timestamp updateTime){
  		this.updateTime=updateTime;
  	}
  	
  	public java.sql.Timestamp getUpdateTime(){
  		return this.updateTime;
  	}
	
    
	/**
	 * 保存时非空数据项校验；
	 */
	public boolean validate(){
		boolean passed = true;
		return passed;
	}
	
	/**
   	* 保存时对应的分表；
   	*/
  	private String tKjtTabName;

  	public String getTKjtTabName() {
    	return tKjtTabName;
  	}

  	@Override
  	public void setTKjtTabName(String tKjtTabName) {
    	this.tKjtTabName = tKjtTabName;
  	}
}
