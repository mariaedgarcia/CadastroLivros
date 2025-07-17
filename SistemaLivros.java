public class SistemaLivros{

    public static void main(String[] args) {

        Livro livro = new Livro(); // Isso é um método construtor
        livro.setCodigo(1);
        livro.setTitulo("Códigod da Vinci"); 
        livro.setAutor("Dan Brown"); 
        livro.setEditora("Editora Xyz"); 
        livro.setNumPaginas(100);
        livro.setEdicao(2);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();
        System.out.println("-----------------------");

        /* Livro Biblioteca */

        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();
        livrobiblioteca.setCodigo(11);
        livrobiblioteca.setTitulo("Cinderela"); 
        livrobiblioteca.setAutor("Autor desconhecido"); 
        livrobiblioteca.setEditora("Editora 123"); 
        livrobiblioteca.setNumPaginas(200);
        livrobiblioteca.setEdicao(6);
        livrobiblioteca.setLocalPrateleira("Prateleira AB2"); 
        livrobiblioteca.setCategoria("Animação");
        livrobiblioteca.setPrazoEntrega(10);
        livrobiblioteca.setNomeQuemEmprestou("Duda"); 

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devolver();
        System.out.println("-----------------------");

        /* Livro Livraria*/ 

        LivroLivraria livrolivraria = new LivroLivraria();
        livrolivraria.setCodigo(21);
        livrolivraria.setTitulo("Vidas Secas"); 
        livrolivraria.setAutor("Graciliano Ramos"); 
        livrolivraria.setEditora("Editora 321"); 
        livrolivraria.setNumPaginas(176);
        livrolivraria.setEdicao(5); 
        livrolivraria.setPreco(52.99);
        livrolivraria.setNovoUsado("Novo");
        livrolivraria.setLocalPrateleira("Prateleira B2");
        livrolivraria.setCategoria("Romance / ficção"); 

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();

        String mensagem = "\nCodigo: "+livro.getCodigo()+
                           "\nTitulo: "+livro.getTitulo()+
                           "\nAutor: "+livro.getAutor()+
                           "\nEditora: "+livro.getEditora()+
                           "\nNumero de pag: "+livro.getNumPaginas()+
                           "\nEdição: "+livro.getEdicao();
        System.out.println("Livro: "+mensagem);
        System.out.println("----------------------------------------");

                mensagem = "\nCodigo: "+livrobiblioteca.getCodigo()+
                           "\nTitulo: "+livrobiblioteca.getTitulo()+
                           "\nAutor: "+livrobiblioteca.getAutor()+
                           "\nEditora: "+livrobiblioteca.getEditora()+
                           "\nNumero de pag: "+livrobiblioteca.getNumPaginas()+
                           "\nEdição: "+livrobiblioteca.getEdicao()+
                           "\nLocal na prateleira: "+livrobiblioteca.getLocalPrateleira()+
                           "\nCategoria: "+livrobiblioteca.getCategoria()+
                           "\nPrazo de entrega: "+livrobiblioteca.getPrazoEntrega()+
                           "\nNome de quem emprestou: "+livrobiblioteca.getNomeQuemEmprestou();
        System.out.println("Livro Biblioteca: "+mensagem);
        System.out.println("----------------------------------------");

                mensagem = "\nCodigo: "+livrolivraria.getCodigo()+
                           "\nTitulo: "+livrolivraria.getTitulo()+
                           "\nAutor: "+livrolivraria.getAutor()+
                           "\nEditora: "+livrolivraria.getEditora()+
                           "\nNumero de pag: "+livrolivraria.getNumPaginas()+
                           "\nEdição: "+livrolivraria.getEdicao()+
                           "\nPreço: R$"+livrolivraria.getPreco()+
                           "\nNovo ou usado: "+livrolivraria.getNovoUsado()+
                           "\nLocal na prateleira: "+livrolivraria.getLocalPrateleira()+
                           "\nCategoria: "+livrolivraria.getCategoria();
        System.out.println("Livro Livraria: "+mensagem);

        // Exemplo método construtor
        Livro novoLivro = new Livro();
        System.out.println("Novo livro: "+novoLivro.getTitulo());
        novoLivro.setTitulo("Novo titulo legal");
        System.out.println("Novo livro: "+novoLivro.getTitulo());

    }
}