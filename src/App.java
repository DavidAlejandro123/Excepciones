public class App {
    public static void main(String[] args) throws Exception {
        //Excepciones: Eventos que interrumpen el flujo normal de la aplicacion
        //Excepciones de tipo unchecked
        int numero1 = 5;
        int numero2 = 0;
        int resultado;

        try{
            resultado = numero1/numero2;
            System.out.println(resultado);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Esto va despues de la excepcion");
        }
    }
}
