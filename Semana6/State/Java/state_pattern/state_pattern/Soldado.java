package state_pattern;

public class Soldado {

    private Posicao estadoSoldado = new Em_pe(this);

    public void setEstado(Posicao estado){
        this.estadoSoldado = estado;
    }

    public Posicao getEstado(){
        return estadoSoldado;
    }

    public void atirar(){
        estadoSoldado.atirar();
    }

    public void correr(){
        estadoSoldado.correr();
    }

    public void  mirar(){
        estadoSoldado.mirar();
    }

    public void agachar(){
        setEstado(new Agachado(this));
    }

    public void deitar(){
        setEstado(new Deitado(this));
    }
}

