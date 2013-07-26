package com.entity.entity1;

import com.entity.component.HCAddress;
/**
*
* Adding some comments to check if it is refected in git
*/
public class HCUser extends HCAddress{

	String HCRole_ID;
	String HCRole_type;
	String HCRole_AddnlDescription;
	public String getHCRole_ID() {
		return HCRole_ID;
	}
	public void setHCRole_ID(String hCRole_ID) {
		HCRole_ID = hCRole_ID;
	}
	public String getHCRole_type() {
		return HCRole_type;
	}
	public void setHCRole_type(String hCRole_type) {
		HCRole_type = hCRole_type;
	}
	public String getHCRole_AddnlDescription() {
		return HCRole_AddnlDescription;
	}
	public void setHCRole_AddnlDescription(String hCRole_AddnlDescription) {
		HCRole_AddnlDescription = hCRole_AddnlDescription;
	}
	
	
}
