public class Products {
	String productCode, productName, productMark, price;
	public Products() {}
	public Products(String productCode, String productName, String productMark, String price) {
		this.productCode=productCode;
		this.productName=productName;
		this.productMark=productMark;
		this.price=price;
	}
	
	void get(){
		System.out.println(productCode+" "+productName+" "+productMark+" "+price+" ");
		System.out.println();
	}
	void setProductCode(String productCode) {
		this.productCode=productCode;
	}
	
	void setProductName(String productName) {
		this.productName=productName;
	}
	void setProductMark(String produMark) {
		this.productMark=productMark;
	}
	void setPrice(String price) {
		this.price=price;
	}
}
