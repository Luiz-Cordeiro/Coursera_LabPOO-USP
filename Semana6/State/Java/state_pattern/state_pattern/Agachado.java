package state_pattern;

public class Agachado implements Posicao {

    private Soldado soldado;

    public Agachado(Soldado soldado){
        this.soldado = soldado;
    }

    @Override
    public void mirar() {
        System.out.println("state_pattern.Soldado mirando agachado");
    }


    @Override
    public void atirar() {
        System.out.println("state_pattern.Soldado atirando agachado");
    }

    @Override
    public void correr() {
        System.out.println("state_pattern.Soldado não consegue correr agachado");
        soldado.setEstado(new Em_pe(this.soldado));
        System.out.println("state_pattern.Soldado levantando...");
        System.out.println("state_pattern.Soldado correndo");
    }

    @Override
    public String descricaoEstado(){
        return "state_pattern.Agachado";
    }
}
