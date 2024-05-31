package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo          -- nome é opcional
    private List<Tarefa> tarefaList;

    // devemos criar um construtor para que sempre que
    // criarmos um objeto do tipo do tipo "tarefaList"
    // já ser criada uma lista vazia


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
        // construtor criando uma lista vazia assim que instanciada!
    }
    // Método de adicionar
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {
      /* Como eu tenho uma lista e dentro de uma lista (list) podemos ter elementos
      repetidos, então é possível ter dois elementos com a mesma descricao
      para remover esses elementos (iguais) será feito un laço de repetição
      e vai ser passado por cada elemento dessa lista e fazer a comporação se é iugal
      a "descricao", assim vai ser feita uma lista com todas as tarefas que serão removidas
            */
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    // for each > t é opcional > para cada t (tarefa) em tarefaList
    for(Tarefa t: tarefaList) {
        if(t.getDescricao().equalsIgnoreCase(descricao)) {
            // se a descrição da tarefa for igual ela será adicionada em tarefas para remover
            tarefasParaRemover.add(t);
        }
    }
    // assim irá remover todas as tarefas mesmo que sejam repetidas
    tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        // tamanho da lista de tarefa
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        // imprimindo a lista de tarefas
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

//        listaTarefa.adicionarTarefa("Tarefa 1");
//        listaTarefa.adicionarTarefa("Tarefa 1");
//        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

//        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
