public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode()); // retorna o hashcode
        System.out.println(c2.hashCode()); // retorna o hashcode
        System.out.println(c1.equals(c2)); // verifica se ambos s�o iguais
        System.out.println(c1 == c2); // verifica se ambos est�o alocados no mesmo lugar na mem�ria

    }
}