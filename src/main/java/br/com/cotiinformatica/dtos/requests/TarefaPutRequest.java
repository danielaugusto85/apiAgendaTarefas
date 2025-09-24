package br.com.cotiinformatica.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TarefaPutRequest {
	
	private String idTarefa; //id da tarefa
	private String nomeTarefa; //nome da tarefa
	private String dataTarefa; //data da tarefa
	private String prioridadeTarefa; //prioridade da tarefa
	private Boolean finalizado; //indicador de finalizado
	private String idCategoria; //categoria da tarefa

}
