public class Filme {
    private String titulo;
    private int ano;

    public Filme(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString(){
        return titulo+ " " +ano;
    }
}
