package variaveis_java;

class Main{
    public static void main(String args[]){
        System.out.println("Ola Java!");

        Objeto objeto_1 = new Objeto();
        Objeto objeto_2 = new Objeto();

        //Antes da alteração da variável
        System.out.println(objeto_1.getVarClasse());
        System.out.println(objeto_2.getVarClasse());

        //Alterar uma variável de classe muda a mesma em todas as instâncias
        objeto_1.variavelClasse = "novo valor";

        System.out.println(objeto_1.getVarClasse());
        System.out.println(objeto_2.getVarClasse());
    }
}