public class LivroBiblioteca extends Livro { // extends é filha de "Livro"

    // Atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    // Métodos

    public String getLocalPrateleira(){
        return this.localPrateleira;
    }

    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira = localPrateleira;
    }

    ////////////////////////////////////////////////////////////////

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    ////////////////////////////////////////////////////////////////

    public int getPrazoEntrega(){
        return this.prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega){
        this.prazoEntrega = prazoEntrega;
    }

    ////////////////////////////////////////////////////////////////

    public String getNomeQuemEmprestou(){
        return this.nomeQuemEmprestou;
    }

    public void setNomeQuemEmprestou(String nomeQuemEmprestou){
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

    ////////////////////////////////////////////////////////////////

    public void Alugar(){
        System.out.println("Estou alugando...");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo...");
    }
    
}