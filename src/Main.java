import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opc;
        List<Usuario> usuario = new ArrayList<Usuario>();
        List<Filme> filme = new ArrayList<Filme>();
        Scanner tecladoInt = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);
        do {
            System.out.println("1.Cadastrar");
            System.out.println("2.Imprimir");
            System.out.println("3.Procurar");
            System.out.println("4.Remover");
            System.out.println("5.Atualizar");
            System.out.println("0.Sair");
            System.out.print("Informe a opcao desejada: ");
            opc = tecladoInt.nextInt();
            switch(opc) {
                case 1:
                    int opcCadastro;
                    System.out.println("1.Cadastrar Usuario");
                    System.out.println("2.Cadastrar Filme");
                    System.out.print("Informe a opcao desejada: ");
                    opcCadastro = tecladoInt.nextInt();
                    if(opcCadastro == 1) {
                        System.out.print("Informe o ID: ");
                        int id = tecladoInt.nextInt();
                        System.out.print("Informe o Nome: ");
                        String nome = tecladoStr.nextLine();
                        usuario.add(new Usuario(id, nome));
                        System.out.println("Usuario "+nome+" cadastrado com sucesso..");
                    } else if(opcCadastro == 2) {
                        System.out.print("Informe o Titulo: ");
                        String titulo = tecladoStr.nextLine();
                        System.out.print("Informe o ano: ");
                        int ano = tecladoInt.nextInt();
                        filme.add(new Filme(titulo, ano));
                        System.out.println("Filme "+titulo+" cadastrado com sucesso..");
                    } else {
                        System.out.println("Opcao invalida..");
                    }
                    break;
                case 2:
                    int opcImprimir;
                    System.out.println("1.Imprimir Usuarios");
                    System.out.println("2.Imprimir Filmes");
                    System.out.print("Informe a opcao desejada: ");
                    opcImprimir = tecladoInt.nextInt();
                    if(opcImprimir == 1) {
                        System.out.println("----------------------------");
                        Iterator<Usuario> i = usuario.iterator();
                        while(i.hasNext()){
                            Usuario u = i.next();
                            System.out.println(u);
                        }
                        System.out.println("----------------------------");
                    } else if(opcImprimir == 2){
                        System.out.println("----------------------------");
                        Iterator<Filme> i = filme.iterator();
                        while(i.hasNext()){
                            Filme f = i.next();
                            System.out.println(f);
                        }
                        System.out.println("----------------------------");
                    } else {
                        System.out.println("Opcao invalida..");
                    }
                    break;
                case 3:
                    int opcProcurar;
                    System.out.println("1.Procurar Usuarios");
                    System.out.println("2.Procurar Filmes");
                    System.out.print("Informe a opcao desejada: ");
                    opcProcurar = tecladoInt.nextInt();
                    if(opcProcurar == 1){
                        boolean encontrado = false;
                        System.out.print("Informe o ID para Procurar: ");
                        int id = tecladoInt.nextInt();
                        System.out.println("----------------------------");
                        Iterator<Usuario> i = usuario.iterator();
                        while(i.hasNext()){
                            Usuario u = i.next();
                            if(u.getId() == id){
                                System.out.println(u);
                                encontrado = true;
                            }
                        }
                        if(!encontrado){
                            System.out.println("ID nao encontrado..");
                        }
                        System.out.println("----------------------------");
                    } else if(opcProcurar == 2){
                        boolean encontrado = false;
                        System.out.print("Informe o Nome do Filme para Procurar: ");
                        String titulo = tecladoStr.nextLine();
                        System.out.println("----------------------------");
                        Iterator<Filme> i = filme.iterator();
                        while(i.hasNext()){
                            Filme f = i.next();
                            if(f.getTitulo().equalsIgnoreCase(titulo)){
                                System.out.println(f);
                                encontrado = true;
                            }
                        }
                        if(!encontrado){
                            System.out.println("Filme nao encontrado..");
                        }
                        System.out.println("----------------------------");
                    } else {
                        System.out.println("Opcao invalida..");
                    }

                    break;
                case 4:
                    int opcRemover;
                    System.out.println("1.Remover Usuario");
                    System.out.println("2.Remover Filme");
                    System.out.print("Informe a opcao desejada: ");
                    opcRemover = tecladoInt.nextInt();
                    if(opcRemover == 1){
                        boolean encontrado = false;
                        System.out.print("Informe o ID para Remover: ");
                        int id = tecladoInt.nextInt();
                        System.out.println("----------------------------");
                        Iterator<Usuario> i = usuario.iterator();
                        while(i.hasNext()){
                            Usuario u = i.next();
                            if(u.getId() == id){
                                i.remove();
                                encontrado = true;
                            }
                        }
                        if(!encontrado){
                            System.out.println("ID nao encontrado..");
                        } else {
                            System.out.println("Registro apagado com sucesso..");
                        }
                        System.out.println("----------------------------");
                    } else if(opcRemover == 2){
                        boolean encontrado = false;
                        System.out.print("Informe o Nome do Filme para Remover: ");
                        String titulo = tecladoStr.nextLine();
                        System.out.println("----------------------------");
                        Iterator<Filme> i = filme.iterator();
                        while(i.hasNext()){
                            Filme f = i.next();
                            if(f.getTitulo().equalsIgnoreCase(titulo)){
                                i.remove();
                                encontrado = true;
                            }
                        }
                        if(!encontrado){
                            System.out.println("Filme nao encontrado..");
                        } else {
                            System.out.println("Registro apagado com sucesso..");
                        }
                        System.out.println("----------------------------");
                    } else {
                        System.out.println("Opcao invalida..");
                    }

                    break;
                case 5:
                    int opcAtualizar;
                    System.out.println("1.Atualizar Usuario");
                    System.out.println("2.Atualizar Filme");
                    System.out.print("Informe a opcao desejada: ");
                    opcAtualizar = tecladoInt.nextInt();
                    if(opcAtualizar == 1){
                        boolean encontrado = false;
                        System.out.print("Informe o ID para Atualizar: ");
                        int id = tecladoInt.nextInt();
                        System.out.println("----------------------------");
                        ListIterator<Usuario> li = usuario.listIterator();
                        while(li.hasNext()){
                            Usuario u = li.next();
                            if(u.getId() == id){
                                System.out.print("Informe o novo Nome: ");
                                String nome = tecladoStr.nextLine();
                                li.set(new Usuario(id, nome));
                                encontrado = true;
                            }
                        }
                        if(!encontrado){
                            System.out.println("ID nao encontrado..");
                        } else {
                            System.out.println("Registro atualizado com sucesso..");
                        }
                        System.out.println("----------------------------");
                    } else if(opcAtualizar == 2){
                        boolean encontrado = false;
                        System.out.print("Informe o Nome do Filme para Atualizar: ");
                        String titulo = tecladoStr.nextLine();
                        System.out.println("----------------------------");
                        ListIterator<Filme> li = filme.listIterator();
                        while(li.hasNext()){
                            Filme f = li.next();
                            if(f.getTitulo().equalsIgnoreCase(titulo)){
                                System.out.print("Informe o novo Titulo: ");
                                titulo = tecladoStr.nextLine();
                                System.out.println("Informe o novo Ano: ");
                                int ano = tecladoInt.nextInt();
                                li.set(new Filme(titulo, ano));
                                encontrado = true;
                            }
                        }
                        if(!encontrado){
                            System.out.println("Filme nao encontrado..");
                        } else {
                            System.out.println("Registro atualizado com sucesso..");
                        }
                        System.out.println("----------------------------");
                    }
                    break;
            }
        } while(opc != 0);

    }
}
