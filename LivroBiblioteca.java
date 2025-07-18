public class LivroBiblioteca extends Livro { // extends é filha de "Livro"

    // Atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    // Método construtor FILHO
    LivroBiblioteca(){} // Aqui está chamando a classe 
    // Método construtor FILHO com parametros
    LivroBiblioteca(int codigo,
                    String titulo,
                    String autor, 
                    String editora, 
                    int numPaginas, 
                    int edicao,
                    String localPrateleira,
                    String categoria,
                    int prazoEntrega,
                    String nomeQuemEmprestou){
        // Acesso ao método construtor PAI (Livro)
        super(codigo, titulo, autor, editora, numPaginas, edicao); // Encaminha essas informações do método contrutor do filho e passa para o "pai"
        
        this.localPrateleira = localPrateleira;
        this.categoria = categoria;
        this.prazoEntrega = prazoEntrega;
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

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