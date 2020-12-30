package packageLP2;

import java.util.Random;

/**
 *
 * @author Yuri lord e mestre supremo do universo, curve-se ou seja subjulgado !
 * ( to com sono e com vontade de tomar mais café, socorro)
 */
public class Dados {

    public Dados() {
    }

    Random gerador = new Random();

    public int rolarD20() {
        int resultado;

        resultado = gerador.nextInt(20);

        return resultado + 1;
    }

    public int rolarD6() {
        int resultado;

        resultado = gerador.nextInt(6);

        return resultado + 1;
    }

    public int rolarD10() {
        int resultado;

        resultado = gerador.nextInt(10);

        return resultado + 1;
    }

    public int rolarD3() {
        int resultado;

        resultado = gerador.nextInt(3);

        return resultado + 1;
    }

    public int rolarD100() {
        int resultado;

        resultado = gerador.nextInt(100);

        return resultado + 1;
    }

    public int rolarD8() {
        int resultado;

        resultado = gerador.nextInt(8);

        return resultado + 1;
    }

}
