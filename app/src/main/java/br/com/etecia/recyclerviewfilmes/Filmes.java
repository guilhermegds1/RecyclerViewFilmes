package br.com.etecia.recyclerviewfilmes;



public class Filmes {
    private String Tutulo;
    private String decricao;
    private String categoria;
    private int imagem;

    //criar construtor com parametros alt+insert


    public Filmes(String tutulo, String decricao, String categoria, int imagem) {
        Tutulo = tutulo;
        this.decricao = decricao;
        this.categoria = categoria;
        this.imagem = imagem;
    }

       //criando os metodos de acesso get and setter


    public String getTutulo() {
        return Tutulo;
    }

    public void setTutulo(String tutulo) {
        Tutulo = tutulo;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
