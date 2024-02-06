package lp2.lab01;
public class IdadePreferencialInteligente {
    public static void main(String[] args) {  // Definindo uma função
        int ano_nascimento = 2005;
	int idade = 2024 - ano_nascimento;
	boolean gestante = false;
	int criancas = 0;
        if (idade >= 60) {
            System.out.println("Voce tem " + idade
                   + " anos. Voce pode usar o atendimento especial.");
        } else {
        System.out.println("Voce tem " + idade + " anos. Voce ainda nao pode usar o atendimento especial.");
        }
	if (gestante == true) {
		System.out.println("Você está gestante. Você pode usar o atendimento especial.");
	} else {
	System.out.println("Você não está gestante e não pode usar o atendimento especial.");
	}
	if (criancas > 0) {
		System.out.println("Você tem crianças de colo. Você pode usar o atendimento especial.");
	} else {
	System.out.println("Você não tem crianças de colo e não pode usar atendimento preferencial.");
	}	

    }
}
