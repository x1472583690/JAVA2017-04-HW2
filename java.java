import java.util.*;
class x{
	public static void main(String[]args){
		String bbb = "sfewf,sdsd,sdf,d,554,7,6";
		String[]tokens = bbb.split(",");

		/* for (String token:tokens) {
		   System.out.print(token);
		   }*/
		for (int i = 0; i < 2; i++){

			if (i==(1)){
				System.out.print(tokens[i]+"(XX)");
			}
			else{
				System.out.print(tokens[i] + "/");
			}
		}
	}
}
