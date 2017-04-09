import java.util.*;
import java.io.*;
class HW2{
	public static void main(String[]args)throws Exception{
		String [] All_Animeal = new String [101];
		String temp;
		File file_txt =  new File("M:/2017 四下/HW2/endangeredSpecies.txt");
		Scanner scn =new Scanner (file_txt);
		for(int i=0;i<All_Animeal.length;i++){
			temp = scn.nextLine();
			All_Animeal[i] = temp;
		}
			Arrays.sort(All_Animeal);
			for(int i=1;i<All_Animeal.length;i++){
				temp=All_Animeal[i];
				String[]tokens=temp.split(",");
				if(tokens[3].equals("Endangered")){
					temp = tokens[0]+"/"+tokens[1]+"(EN)";
				}
					if(tokens[3].equals("Critically Endangered")){
						temp = tokens[0]+"/"+tokens[1]+"(CR)";
					}
						if(tokens[3].equals("Vulnerable")){
							temp = tokens[0]+"/"+tokens[1]+"(VU)";
						}
							if(tokens[3].equals("Near Threatened")){
								temp = tokens[0]+"/"+tokens[1]+"(NT)";
							}
								if(tokens[3].equals("Least Concern")){
									temp = tokens[0]+"/"+tokens[1]+"(LC)";
								}
									System.out.println(temp);
									All_Animeal[i]=temp;
			}
									while(true){	
										Scanner scn_Chinese =new Scanner (System.in);
										System.out.println("\tEnter Search_Chinese");
										String ser_Chinese = scn_Chinese.next();
											for(int j=0;j<All_Animeal.length;j++){
												int find_Chinese = All_Animeal[j].indexOf(ser_Chinese);
													if(find_Chinese>=0){
														System.out.println(All_Animeal[j]);	
													}		
											}
														if(ser_Chinese.equalsIgnoreCase("EXIT")){ 
															break;
														}
									}												
	}
}
