public class Main {
    public static void main(String[] args) {
        HiloCancion hiloCancion = new HiloCancion();
        HiloSuma hiloSuma = new HiloSuma(2, 3);
        HiloResta hiloResta = new HiloResta(10, 2);
        HiloMultiplicacion hiloMultiplicacion = new HiloMultiplicacion(5, 2);
        hiloCancion.start();
        hiloSuma.start();
        hiloResta.start();
        hiloMultiplicacion.start();
    }
}