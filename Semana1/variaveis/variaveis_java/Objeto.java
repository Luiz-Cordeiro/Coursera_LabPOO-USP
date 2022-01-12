package variaveis_java;

class Objeto{
    static String variavelClasse = "Essa eh uma variavel de classe";
    /*
    Variáveis de classe são compartilhadas por todas as instâncias, por isso são precedidas
    pela palavra reservada static
    */
    String variavelObjeto = "Essa eh uma variavel de objeto";



    public String getVarClasse(){
        return variavelClasse;
    }

    public String getVarObjeto(){
        return variavelObjeto;
    }
}