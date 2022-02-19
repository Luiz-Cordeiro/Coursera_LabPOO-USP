package state_pattern;

public class Client {

    public static void main(String[] args) {
        Soldado sdCleiton = new Soldado();
        System.out.println(sdCleiton.getEstado().descricaoEstado());
        sdCleiton.agachar();
        System.out.println(sdCleiton.getEstado().descricaoEstado());
        sdCleiton.correr();
        System.out.println(sdCleiton.getEstado().descricaoEstado());
        sdCleiton.deitar();
        System.out.println(sdCleiton.getEstado().descricaoEstado());
        sdCleiton.correr();
        System.out.println(sdCleiton.getEstado().descricaoEstado());
    }

}

