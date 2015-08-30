public class Exemplo8{
	public static void main(String[] args){
		
		int tabNum[]; //definindo o ponteiro
		int cont;
		tabNum = new int[10]; // alocação de memória
		
		tabNum[0]=34;
		tabNum[1]=22;
		tabNum[2]=65;
	
		for(cont=0;cont<3;cont++){
			System.out.println("TabNum[" + cont + "] = " + tabNum[cont]);
		}
		
	}
}