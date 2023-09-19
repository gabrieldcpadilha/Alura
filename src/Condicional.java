public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Filme LANÇAMENTO!");
        } else {
            System.out.println("Filme RETRO");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("LIBERADO");
        } else {
            System.out.println("NAO liberado");
        }

// É uma forma mais simplificada e legível de escrever vários blocos if/else encadeados.
        int dia = 6;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default: // código a ser executado se a expressão não for igual a nenhum valor
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
