import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("text.txt");
		Scanner scan=new Scanner(fr);
		
		Filia[] filiaMas=new Filia[3];
		Products[] productsMas=new Products[3];
		Production[] productionMas=new Production[3];
  		
		int i=0; String temp;
		String mas[]=new String[10];
		
		while(scan.hasNextLine()){
			temp=scan.nextLine();
	//		System.out.println(temp);
			mas=temp.split(" ");
	//		number=Integer.parseInt(mas[0]);
	//		filiaName=mas[1];
	//		adress=mas[2];
	//		phoneNumber=mas[3];
	//		investmentAmount=Integer.parseInt(mas[4]);
	//		price=Integer.parseInt(mas[5]);
	//		productName=mas[6];
	//		productMark=mas[7];
	//		accountingDate=mas[8];
	//		productNumber=Integer.parseInt(mas[9]);
	//		System.out.println(temp);
	//		System.out.println(mas.length);
			filiaMas[i]=new Filia(mas[0], mas[1], mas[2], mas[3], mas[4]);
			productsMas[i]=new Products(mas[0], mas[6], mas[7], mas[5]);
			productionMas[i]=new Production(mas[0], mas[0], mas[8], mas[9]);
			
			i++;
		}
		for (int j=0;j<3; j++)filiaMas[j].get();
		for (int j=0;j<3; j++)productsMas[j].get();
		for (int j=0;j<3; j++)productionMas[j].get();
		fr.close();
	}

}
