public class Usuario {
    private int id;
    private String nome;

    public Usuario(int id){
        this.id = id;
    }

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return id+ " " +nome;
    }

}
