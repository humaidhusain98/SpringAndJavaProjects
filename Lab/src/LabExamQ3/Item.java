package LabExamQ3;

public class Item {
	    private String id;
		private String Description;
		private int qty;
		private int unitPrice;
		private int order_timehr;
		private int total;
		private int type;//1 for Combo, 2 for lunch-time ,3 for hot drink,4 for slice of cake 
		private boolean dineIn;
		private int discount;
		public Item(String id2, String description, int qty, int unitPrice, int order_timehr, int type,
				boolean dineIn) {
			super();
			this.id = id2;
			Description = description;
			this.qty = qty;
			this.unitPrice = unitPrice;
			this.order_timehr = order_timehr;
			this.type = type;
			this.dineIn = dineIn;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public int getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(int unitPrice) {
			this.unitPrice = unitPrice;
		}
		public int getOrder_timehr() {
			return order_timehr;
		}
		public void setOrder_timehr(int order_timehr) {
			this.order_timehr = order_timehr;
		}
		
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public boolean isDineIn() {
			return dineIn;
		}
		public void setDineIn(boolean dineIn) {
			this.dineIn = dineIn;
		}
		
		
		
		
		
		
		
		
		
}
