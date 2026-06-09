import Exceptions.DividirPorCeroException;

public class Calculadora{

    public int dividir(int dividendo, int divisor) throws DividirPorCeroException{
        if (divisor == 0) throw new DividirPorCeroException();

        return dividendo/divisor;
    }
}
