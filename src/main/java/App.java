package main.java;

public class App {
        //Comentário

//    public static void funcao_teste (){
//        //Biblioteca para entrada de dados
//        Scanner ler = new Scanner(System.in); 
//
//        //variável local a
//        String v2;
//        int v1;
//
//        System.out.println("Comando de Saida de Dados");
//        
//        System.out.printf("Informe uma palavra: ");
//        v2 = ler.next();
//
//        System.out.printf("Informe um número: ");
//        v1 = ler.nextInt();
//
//        System.out.printf(v2+" "+v1);
//    }
    public static void main(String[] args) throws Exception {
        CorpoHumano c1 = new CorpoHumano();

        //c1.massa = "2";
        //erro, erro de syntaxe por causa da ausencia do set e por tentar colocar numero como string
        //massa e volume
        c1.setAltura(1.80);
        c1.setMassa(80);
        c1.setVolume(10);

        System.out.println("Densidade: " + c1.getDensidade());
        System.out.println("IMC: " + c1.getIMC());
    }
}
