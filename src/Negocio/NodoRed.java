package Negocio;

public class NodoRed {
    private int identificadorNumerico;
    private int capacidadMaxima;
    private int conexionesActivas;
    private int contador = 0;

    public NodoRed(int identificadorNumerico, int capacidadMaxima) {
        setIdentificadorNumerico(identificadorNumerico);
        setConexionesActivas(conexionesActivas);
        setCapacidadMaxima(capacidadMaxima);
    }

    public void setConexionesActivas(int conexionesActivas) {
        if(conexionesActivas < 0 || conexionesActivas > capacidadMaxima){
            conexionesActivas = 0;
        }
        this.conexionesActivas = conexionesActivas;
    }

    public void setIdentificadorNumerico(int identificadorNumerico) {
        if (identificadorNumerico<0){
            System.out.println("Identificador no puede ser negativo.");
            identificadorNumerico = 1;
        }
        this.identificadorNumerico = identificadorNumerico;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima <= 0){
            System.out.println("Debe ser mayor a cero.");
            capacidadMaxima = 1;
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getIdentificadorNumerico() {
        return identificadorNumerico;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getConexionesActivas() {
        return conexionesActivas;
    }

    public int getContador() {
        return contador;
    }

    public boolean conectar(){
        if (capacidadMaxima < conexionesActivas){
            conexionesActivas += 1;
            System.out.println(conexionesActivas);
            return true;
        }
        return false;
    }

    public boolean desconectar(){
        if (conexionesActivas < 0){
            conexionesActivas -= 1;
            System.out.println(conexionesActivas);
            return true;
        }
        return false;
    }

}
