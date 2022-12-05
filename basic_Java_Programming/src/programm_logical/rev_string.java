package programm_logical;

public class rev_string {

	String str="surekhs pstil";
	String rev="";
	
	int ln=str.length();
			{
			
	for(int i=ln-1;i>=0;i--) {
	
		rev=rev+str.charAt(i);
	}

System.out.println(rev);

	}
}