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
        this.IMC = 0;
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

    //Calcular Densidade
    private void atualizarDensidade(){
        this.densidade = this.massa / this.volume;
    }
    //Calcular IMC
    private void atualizarIMC(){
        this.IMC = this.massa / (this.altura * this.altura);
    }

}
