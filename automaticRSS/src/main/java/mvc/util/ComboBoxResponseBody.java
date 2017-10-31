package mvc.util;

import mvc.dto.Views;

import com.fasterxml.jackson.annotation.JsonView;

public class ComboBoxResponseBody {

	@JsonView(Views.Public.class)
	String itemID;
	
	@JsonView(Views.Public.class)
	String itemName;

	
	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
