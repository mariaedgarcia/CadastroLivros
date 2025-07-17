public class Livro{

    // Atributos

    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int numPaginas;
    private int edicao;

    // Método construtor (Serve para construir seu objeto com valores default)
    Livro(){
        this.codigo = 0;
        this.titulo = "";
        this.autor = "";
        this.editora = "";
        this.numPaginas = 0;
        this.edicao = 0;
    }

    // Métodos
    public int getCodigo(){ // Colocar o GET ou SET antes é uma boa prática
        return codigo;
    } 

    public void setCodigo(int valor){ // SET sempre vai ser void, sendo que o SET recebe o parâmetro e a informação que vai guardar
        codigo = valor;                         
    }

    ////////////////////////////////////////////////////////////////

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }

    ////////////////////////////////////////////////////////////////

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    ////////////////////////////////////////////////////////////////

    public String getEditora(){
        return this.editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    ////////////////////////////////////////////////////////////////

    public int getNumPaginas(){
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    ////////////////////////////////////////////////////////////////

    public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    ////////////////////////////////////////////////////////////////

    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");
    }

    public void Localizar(){
        System.out.println("Estou localizando...");
    }

}