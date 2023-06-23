public class Pessoa {
    private String nome;
    private double idade;
    private double peso;
    private double altura;

    public void envelhecer(double novaIdade){
        idade = novaIdade;
    }

    public void engordar(double novoPeso){
        peso = novoPeso;
    }

    public void crescer(double novaAltura){
        altura = novaAltura;

        if (idade <= 21){
            novaAltura = altura + (idade * 0.5);
        }
    }
}
