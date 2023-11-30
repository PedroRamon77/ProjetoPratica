package br.edu.ifce.emprestimo;
import java.util.ArrayList;

public class Biblioteca{
    ArrayList<Livro> acervoDeLivros = new ArrayList<Livro>();

    public void cadastrarLivro(Livro livro){
        this.acervoDeLivros.add(livro);
        System.out.println("Livro Cadastrado !");
    }
    public void removerLivro(Livro livro){
        if(acervoDeLivros.contains(livro)){
            this.acervoDeLivros.remove(livro);
            System.out.println("Livro removido do acervo!");
        }else{
            System.out.println("Não foi possivel remover livro!");
        }
    }
    public void realizarEmprestimo(Usario usuario,Livro livro){
        if(this.acervoDeLivros.contains(livro) && livro.getStatus()){
            usuario.emprestarLivro(livro);
            System.out.println("Emprestimo realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel realizar emprestimo!");
        }
    }
    public void receberDevolucao(Usuario usuario, Livro livro) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            usuario.devolverLivro(livro);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Este livro não foi emprestado por este usuário!");
        }
    }    
}