import Exceptions.CalculadoraException;
//import Exceptions.DividirPorCeroException;

public class App {
    public static void main(String[] args) throws Exception {
        //Excepciones: Eventos que interrumpen el flujo normal de la aplicacion
        
        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        try{
            resultado = calculadora.dividir(numero1,numero2);
            System.out.println(resultado);
        } catch (CalculadoraException e){
            e.printStackTrace();
            //System.out.println("Esto va despues de la excepcion");
        } finally{
            System.out.println("Hemos terminado el calculo sea exitoso o no");
        }
    }
}
