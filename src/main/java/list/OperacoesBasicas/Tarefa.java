package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }



    // é usado para sobrescrever o método para mostrar o conteúdo e não a posição  de memoria
    @Override
    public String toString() {
        return descricao;
    }
}
