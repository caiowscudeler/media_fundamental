import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        // inicializar um Scanner
        int ra;
        // declarar variavel
        double n1, n2, n3, m;
        // declarar variavel
        int i, cont = 0;
        // declarar variavel para o contador
        for (i = 0; i < 10; i++){
        // comando de repeticao for
        cont++;
        // adicionar sempre um numero ao contador
        System.out.printf("Digite o RA do aluno, se nao houver digite 0: ");
        // texto que aparecera ao usuario
         ra = ler.nextInt();
         // associar variavel ao texto
         if (ra !=0 ){
         // comando de decisao
         System.out.printf("Digite a primeira nota: ");
          // texto que aparecera ao usuario
         n1 = ler.nextDouble();
          // associar variavel ao texto
          System.out.printf("Digite a segunda nota: ");
           // texto que aparecera ao usuario
         n2 = ler.nextDouble();
          // associar variavel ao texto
          System.out.printf("Digite a terceira nota: ");
           // texto que aparecera ao usuario
         n3 = ler.nextDouble();
          // associar variavel ao texto

         m = (n1+n2+n3)/3;
         // calculo da media
         if (m<6) {
         // comando de decisao
         System.out.println("Voce foi reprovado " + m);
         // texto que aparecera ao usuario ao lado da media
         }
         else if (m>6 && m < 8) {
        // comando de decisao caso o primeiro caso seja falso
             System.out.println("voce esta de recuperacao " + m);
              // texto que aparecera ao usuario ao lado da media
         }
         else if (m>8) {
         // comando de decisao caso o primeiro e o segundo caso sejam falsos
            System.out.println("Voce esta aprovado " + m);
             // texto que aparecera ao usuario ao lado da media
         }
    else {
     //comando de decisao caso todos casos sejam falsos
          break;
          //comando para imterromper o for
            }
         }
    }
}
}
