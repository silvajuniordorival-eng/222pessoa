public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30);
        
        System.out.println("Saída inicial: " + pessoa1);
        
        pessoa1.setIdade(31);
        System.out.println("Idade alterada para: " + pessoa1.getIdade());
    }
}