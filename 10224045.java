import java.util.*;
import java.io.*;

class x{

	public static void main(String [] args)throws Exception{
		String [] All_Animeal = new String [101];
		String temp,sel,sel2;
		File f =  new File("M:/2017 四下/HW2/endangeredSpecies.txt");
		Scanner scn =new Scanner (f);
		for(int i=0;i<All_Animeal.length;i++){
			temp = scn.nextLine();
			All_Animeal[i] = temp;
		}
			System.out.println("1.各類保育狀況的物種名單(依關鍵字CR / EN / VU / NT / LC 決定)。");
			System.out.println("2.全部的物種名單。");
			System.out.println("3.可輸入中文關鍵字 查詢相關的物種資訊。");
			System.out.println("4.輸入Exit(不區分大小寫)結束程式。\n");
			while(true){	
				Scanner scn_sel =new Scanner (System.in);
				System.out.println("\tEnter Select\n");
				sel = scn_sel.next();
				sel = sel.toUpperCase();
				switch(sel){
					case "1":
						Scanner scn_sel2 =new Scanner (System.in);
						System.out.println("\tEnter Select2\n");
						sel2 = scn_sel2.next();
						sel2 = sel2.toUpperCase();
						switch(sel2){
							case "CR":
								String CR="Critically Endangered";
								for(int j=0;j<All_Animeal.length;j++){
									int find = All_Animeal[j].indexOf(CR);
									if(find>=0){
										System.out.println(All_Animeal[j]);	
									}		
								}
									break;
							case "EN":
								String EN="Endangered";
								for(int j=0;j<All_Animeal.length;j++){
									int find = All_Animeal[j].indexOf(EN);
									if(find>=0){
										System.out.println(All_Animeal[j]);	
									}		
								}
									break;
							case "VU":
								String VU="Vulnerable";
								for(int j=0;j<All_Animeal.length;j++){
									int find = All_Animeal[j].indexOf(VU);
									if(find>=0){
										System.out.println(All_Animeal[j]);	
									}		
								}
									break;
							case "NT":
								String NT="Near Threatened";
								for(int j=0;j<All_Animeal.length;j++){
									int find = All_Animeal[j].indexOf(NT);
									if(find>=0){
										System.out.println(All_Animeal[j]);	
									}		
								}
									break;
							case "LC":
								String LC="Least Concern";
								for(int j=0;j<All_Animeal.length;j++){
									int find = All_Animeal[j].indexOf(LC);
									if(find>=0){
										System.out.println(All_Animeal[j]);	
									}		
								}
									break;
						}
						break;
					case "2":
						Arrays.sort(All_Animeal);
						for(int i=1;i<All_Animeal.length;i++){
							System.out.println(All_Animeal[i]);
						}
							break;
					case "3":
						Scanner scn_Chinese =new Scanner (System.in);
						System.out.println("Enter Search_Chinese");
						String ser_Chinese = scn_Chinese.next();
						for(int j=0;j<All_Animeal.length;j++){
							int find_Chinese = All_Animeal[j].indexOf(ser_Chinese);
							if(find_Chinese>=0){
								System.out.println(All_Animeal[j]);	
							}		
						}
							break;
					default:
						if(!sel.equals("EXIT"))
							System.out.println("\t請重新輸入\n");
							break;
				}
						if(sel.equals("EXIT")){ 
							break;
						}
			}
			
	}
}


