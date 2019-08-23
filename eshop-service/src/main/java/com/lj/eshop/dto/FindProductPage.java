package com.lj.eshop.dto;

import java.util.List;

import com.lj.base.core.pagination.PageParamEntity; 

public class FindProductPage extends PageParamEntity {

	private static final long serialVersionUID = 1L;
	// 查询条件
	private ProductDto param;
	// 门店code
	private String shopCode;
	// 分类codes
	private List<String> catalogTypeCodes;
	// 动态排序条件 根据需要可自行补充
	// private .... sort;
	/**
	 * @return the param
	 */
	public ProductDto getParam() {
		return param;
	}

	/**
	 * @param param
	 */
	public void setParam(ProductDto param) {
		this.param = param;
	}

	/**
	 * @return the shopCode
	 */
	public String getShopCode() {
		return shopCode;
	}

	/**
	 * @param shopCode the shopCode to set
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public List<String> getCatalogTypeCodes() {
		return catalogTypeCodes;
	}

	public void setCatalogTypeCodes(List<String> catalogTypeCodes) {
		this.catalogTypeCodes = catalogTypeCodes;
	}
	
	

}
