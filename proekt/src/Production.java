public class Production {
	String productCode, filiaCode, accountingDate, productNumber;
	public Production() {}
	public Production(String productCode, String filiaCode, String accountingDate, String productNumber) {
		this.productCode=productCode;
		this.filiaCode=filiaCode;
		this.accountingDate=accountingDate;
		this.productNumber=productNumber;
	}
	
	void get(){
		System.out.println(productCode+" "+accountingDate+" "+productNumber+" ");
		System.out.println();
	}
	
	void setProductcode(String productCode){
		this.productCode=productCode;
	}
	
	void setFiliaCode(String filiaCode){
		this.filiaCode=filiaCode;
	}
	
	void setAccountingDate(String accountingDate){
		this.accountingDate=accountingDate;
	}
	
	void setProductNumber(String productNumber){
		this.productNumber=productNumber;
	}
}
