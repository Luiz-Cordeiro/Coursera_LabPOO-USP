package state_pattern;

public class Em_pe implements Posicao {

    private Soldado soldado;
    public Em_pe(Soldado soldado){
        this.soldado = soldado;
    }

    @Override
    public void mirar() {
        System.out.println("state_pattern.Soldado mirando em pé");
    }


    @Override
    public void atirar() {
        System.out.println("state_pattern.Soldado atirando em pé");
    }

    @Override
    public void correr() {
        System.out.println("state_pattern.Soldado correndo em pé");
    }

    @Override
    public String descricaoEstado(){
        return "state_pattern.Em_pe";
    }
}
