public class Filia {
	String filiaName, adress, phoneNumber, filiaCode, investmentAmount;  
	public Filia() {}
	public Filia(String filiaCode,String filiaName,String adress,String phoneNumber,String investmentAmount) {
		this.filiaCode=filiaCode;
		this.filiaName=filiaName;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.investmentAmount=investmentAmount;
	}
	
	void get(){
		System.out.println(filiaCode+" "+filiaName+" "+adress+" "+phoneNumber+" "+investmentAmount+" ");
		System.out.println();
	}
	
	void setCode(String filiaCode){
		this.filiaCode=filiaCode;
	}
	
	void setName(String filiaName){
		this.filiaName=filiaName;
	} 
	
	void setAdress(String adress){
		this.adress=adress;
	}
	
	void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	} 
	
	void setInvestmentAmount(String investmentAmount){
		this.investmentAmount=investmentAmount;
	}
}
