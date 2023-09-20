import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        int escolha,saque = 0 ;
        int deposito = 0;
        int Valordeposito = 0;

        System.out.println("Digite o seu login: ");
            String login = ler.nextLine();
        System.out.println("Digite a sua senha: ");
            String senha = ler.nextLine();
        
        System.out.println("Seja Bem vindo " + login + "!");

        while (true){
       
            System.out.println("Escolha o que quer fazer (digite o número): \n (1) Deposito \n (2) Saque \n (3) extrato \n (4) sair ");
            escolha = ler.nextInt();


            if (escolha == 1){

                System.out.println("Digite o valor do Deposito: ");
                deposito = ler.nextInt();
                Valordeposito += deposito;
                continue;

            }else if (escolha == 2){

                System.out.println("Digite o valor do saque: ");
                    saque = ler.nextInt();

                    if (saque > Valordeposito){
                    
                        System.out.print("valor indisponivel");
                        

                    }else {
                        Valordeposito = Valordeposito-saque;
                        System.out.print("O valor sacado \n Valor ainda em conta " + Valordeposito);

                    }

            }else if (escolha == 3){

                System.out.println("Valor que está na conta é: "+ deposito);

            }else if (escolha == 4){
            
                break;

            }else{
                System.out.println("Comando inexistente. \n Tente de novo"); 
            }
        }
    }
}