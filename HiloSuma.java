public class HiloSuma extends Thread {
    private int num1;
    private int num2;
    private int resultado;
    public HiloSuma(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getResultado(){
        resultado = num1+num2;
        return resultado;
    }

    public void run(){
        System.out.println("La suma es: "+this.getResultado()); 
    }
}
