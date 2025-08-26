package br.com.cotiinformatica.repositories;

import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.entities.Tarefa;

public class TarefaRepository {

	/*
	 * Método para inserir uma tarefa no banco de dados
	 */
	public void insert(Tarefa tarefa) {
		// TODO Implementar o cadastro da tarefa no banco de dados
	}

	/*
	 * Método para atualizar uma tarefa no banco de dados
	 */
	public boolean update(Tarefa tarefa) {
		// TODO Implementar a atualização da tarefa no banco de dados
		return false;
	}

	/*
	 * Método para excluir uma tarefa no banco de dados
	 */
	public boolean delete(UUID id) {
		// TODO Implementar a exclusão da tarefa no banco de dados
		return false;
	}

	/*
	 * Método para consultar todas as tarefas no banco de dados
	 */
	public List<Tarefa> findAll() {
		// TODO Implementar a consulta das tarefas no banco de dados
		return null;
	}

}
