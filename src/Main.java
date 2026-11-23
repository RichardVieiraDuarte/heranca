import main.model.personagem.concreto.Guerreira;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Leona";
        Guerreira guerreira = new Guerreira(nome);
        guerreira.receberDano(20);
        if (guerreira.defender()){
            System.out.println("Defendido!");
        }
        else {
            System.out.println("Nao defendido!");
        }

        System.out.println(guerreira.getNome() + " tem "+ guerreira.getVida() + " pontos de vida.");

        System.out.println("Guerreira é um Personagem");
        System.out.println("Guerreira tem um escudo");
        }
    }
