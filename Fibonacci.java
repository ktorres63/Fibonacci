package fibonacci;

public class Fibonacci {
	private int count;
	private int[] listaFib;
	
	public Fibonacci(int c){
		if(c<0) { 
			listaFib = new int[1];
			listaFib[0] = -3;
		}
		else if(c==0) {
			listaFib = new int[1];
			listaFib[0] = -2;
		}
		else if(c >20) {
			listaFib = new int[1];
			listaFib[0] = -1;
		}
		else {
			listaFib = new int[c];
			this.count = c;
			this.genListFib();
		}
		
	}
	
	private void genListFib(){
		for (int i = 0; i < this.count; i++) {
			listaFib[i] = fibonacci(i);
        }
	}
	
	private int fibonacci(int n) {
		if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
	
	public int[] getListaFibonacci(){
		return listaFib;
	}

    public void showList(){
    	System.out.println("LISTA: ");
    	if(listaFib[0] == -1) {
    		System.out.println("Los numeros ingresados deben ser menores que 20");
    	}
    	else if(listaFib[0] ==-2) {
    		System.out.println("La entrada debe ser mayor que 0");
    	}
    	else if(listaFib[0] == -3) {
    		System.out.println("la entrada no puede ser un entero negativo");
    	}
    	else {
    		for (int i = 0; i< count;i++) {
    			System.out.print(listaFib[i]+" ");
    		}	
    	}
	}
}
