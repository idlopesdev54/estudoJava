
public class testaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		
		if(idade >= 18 ) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		}else {
			if(quantidadePessoas >=2) {
				System.out.println("voce pode entrar, pois esta acompanhado.");
				} else {
			
			System.out.println("infelizmente voc� nao pode entrar!");
			System.out.println("Vai embora.");
			}
		}
		
	}
}

