package com.lj.business.cf.emus;

/**
 * 
 * 
 * 类说明：是否成单
 *  
 * 
 * <p>
 * 详细描述：
 *   
 * @Company: 深圳扬恩科技有限公司
 * @author 冯辉
 *   
 * CreateDate: 2017年7月14日
 */
public enum DealType {
	
	Y("是"),
	N("否")
	;
	
	DealType(String name){
		this.name = name;
	}
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
