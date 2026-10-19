package Negocio;

public class MainNodoRed {
    static void main() {
        NodoRed nr1 = new NodoRed(0, 2);
        NodoRed nr2 = new NodoRed(1112, 3);

        nr1.getIdentificadorNumerico();
        nr1.conectar();
        nr1.conectar();
        nr1.conectar();
        nr1.desconectar();
        nr1.desconectar();
        nr1.desconectar();
        nr1.getContador();
        nr1.getConexionesActivas();
    }

}
