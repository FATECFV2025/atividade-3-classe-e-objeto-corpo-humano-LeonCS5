package main.java;

public class CorpoHumano { 
    private double massa;     //Massa em Kg 
    private double volume;    //Volume em m³
    private double densidade; //Densidade em Kg/m³
    private double altura;    //Altura em metros
    private double IMC;       //IMC

    //main constructor
    public CorpoHumano() {
        this.massa = 0;
        this.volume = 1;    //evita dividir por 0
        this.densidade = 0;
        this.altura = 1;    //evita dividir por 0
        this.IMC = 0;
    }
    
    //Constructor
    public CorpoHumano(
        double massa,
        double volume,
        double densidade,
        double altura,
        double IMC) {
        this.massa = massa;
        this.volume = volume != 0 ? volume : 1;//evita dividir por 0
        this.densidade = this.massa / this.volume;
        this.altura = altura != 0 ? altura: 1;//evita dividir por 0
        this.IMC = this.massa / (this.altura * this.altura);
    }
    
    //Getters
    public double getMassa() {
        return massa;
    }
    public double getVolume() {
        return volume;
    }
    public double getDensidade() {
        return densidade;
    }
    public double getAltura() {
        return altura;
    }
    public double getIMC() {
        return IMC;
    }
    
    //Setters
    public void setMassa(double massa) {
        this.massa = massa != 0 ? massa : 1;
        atualizarDensidade();
        atualizarIMC();
    }
    public void setVolume(double volume) {
        this.volume = volume != 0 ? volume : 1;
        atualizarDensidade();
    }
    public void setAltura(double altura) {
        this.altura = altura;
        atualizarIMC();
    }
    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    //Calcular Densidade
    private void atualizarDensidade(){
        this.densidade = this.massa / this.volume;
    }
    //Calcular IMC
    private void atualizarIMC(){
        this.IMC = this.massa / (this.altura * this.altura);
    }

}
//Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1. Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
//erro, erro de syntaxe por causa da ausencia do set e por tentar colocar numero como string.
//Na classe Corpo_Humano altere a linha private float Massa para public float Massa; Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
//permitiu que os atributos sejam acessados diretamente fora da clases. Fazer isso remove a proteção da váriavel.
//Na classe Corpo_Humano altere a linha public setVolume (float volume) para private setVolume (float volume).Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
//Fez com que o metodo ficasse inacessível fora da classe. Tornar o método privado restringe o uso dentro da própria classe.