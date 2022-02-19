package state_pattern;

public class Deitado implements Posicao {

    private Soldado soldado;

    public Deitado(Soldado soldado) {
        this.soldado = soldado;
    }

    @Override
    public void mirar() {
        System.out.println("state_pattern.Soldado mirando deitado");
    }

    @Override
    public void atirar() {
        System.out.println("state_pattern.Soldado atirando deitado");
    }

    @Override
    public void correr() {
        System.out.println("state_pattern.Soldado não consegue correr deitado");
        System.out.println("state_pattern.Soldado levantando...");
        soldado.setEstado(new Em_pe(this.soldado));
    }

    @Override
    public String descricaoEstado(){
        return "state_pattern.Deitado";
    }

}

