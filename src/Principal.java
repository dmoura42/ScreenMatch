public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.nome = "The Matrix";
        favorito.anoDeLancamento = 1999;
        favorito.duracaoEmMinutos = 136;
        favorito.incluidoNoPlano = true;


        favorito.exibeFichaTecnica();
        favorito.avalia(8);
        favorito.avalia(8);
        favorito.avalia(10);
        System.out.println(favorito.somaDasAvaliacoes);
        System.out.println(favorito.totalDeAvaliacoes);
        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia()68);

    }
}
