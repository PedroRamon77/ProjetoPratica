package br.edu.ifce.biblioteca;

public class Livro{
    private String titulo;
    private String autor;
    private String anoDePublicacao;
    private boolean status;

    public Livro(String titulo,String autor,String anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.status = true;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAnoDePublicacao(String anoDePublicacao){
        this.anoDePublicacao=anoDePublicacao;
    }
    public String getAnoDePublicacao(){
        return this.anoDePublicacao;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }

    public void imprimirLivro(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Ano de Publicação: "+this.anoDePublicacao);
        System.out.println("Status: "+this.status);
    }

}