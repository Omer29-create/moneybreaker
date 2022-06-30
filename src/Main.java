
public class Main {

	public static void main(String[] args) {
		xyz(23523);

	}

	public static void xyz(int eingabe){
        int moneyList[] = new int[]{200,100,50,20,10,5,2,1};
        String result = "";
        for (int money:moneyList){
            int j = eingabe/money;
            for(int i=0; i<j;i++)
                result += money+ "€+ ";
            eingabe%=money; 
            if (eingabe==0) break;
        }
        System.out.println(result.substring(0,result.length()-1)); 
        
	}
}
