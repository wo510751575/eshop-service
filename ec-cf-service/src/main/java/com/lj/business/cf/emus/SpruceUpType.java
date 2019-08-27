package com.lj.business.cf.emus;

/**
 * 
 * 
 * 类说明：装修类型
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
public enum SpruceUpType {
	
	NODO("未交房/未装修"),
	HASDO("已装好/添置"),
	DOING("装修中"),
	CHANGE("换产品"),
	OTHER("其他")
	;
	
	SpruceUpType(String name){
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
