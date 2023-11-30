import java.util.ArrayList;

public class Usuario{
    private String nome;
    private String ID;
    ArrayList<Livro> livrosEmprestados = new ArrayList<Livro>();
    
    public Usuario(String nome, String ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public String setID(String ID){
        this.ID=ID;
    }
    public String getID(){
        return this.ID;
    }

    public void emprestarLivro(Livro livro){
        if(this.status==true){
            this.livrosEmprestados.add(livro);
            livro.setStatus(false);
        }else{
            System.out.println("Livro está indisponivel!!!");
        }
    }
    public void devolverLivro(Livro livro){
        if(this.status == false){
            this.livrosEmprestados.remove(livro);
            livro.setStatus(true);
            System.out.println("Livro Devolvido!!!");
        }else{
            System.out.println("Não foi possivel devolver livro!!!");
        }
    }
}