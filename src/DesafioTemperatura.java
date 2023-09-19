public class DesafioTemperatura {

    public static void main(String[] args) {
        double tempC = 33;
        double tempF = (tempC * 1.8) + 32;

        String mensagem = String.format("A temperatura %f Celsius equivale a %f Fahrenheit", tempC, tempF);
        System.out.println(mensagem);

        int tempFinteira = (int) tempF;
        System.out.println("A temperatura em Fahrenheit inteira é: " + tempFinteira);
    }

}