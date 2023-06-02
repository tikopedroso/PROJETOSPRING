package fit.PROJETOSPRING.controller;

public class DadosImc {

    private double peso;
    private double altura;
    private double imc;
    private String imcDescricao;

    public DadosImc() {
        super();
    }

    

    public DadosImc(double peso, double altura, double imc, String imcDescricao) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.imcDescricao = imcDescricao;
    }



    public DadosImc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }



    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    public String getImcDescricao() {
        return imcDescricao;
    }
    public void setImcDescricao(String imcDescricao) {
        this.imcDescricao = imcDescricao;
    }

}
