package todo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import todo.model.Todo;

public class TodoDTO {
	private long id;
	private String title;
	private Date createdOn;
	private Date updatedOn;

	private Boolean completed;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	public TodoDTO(){
		super();
	}

	public TodoDTO(long id, String title, Date createdOn,Date updatedOn, Boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.completed = completed;
	}
	
	public TodoDTO(Todo todo){
		super();
		this.id = todo.getId();
		this.title = todo.getTitle();
		this.completed = todo.getCompleted();
		this.updatedOn = todo.getUpdatedOn();
		this.createdOn = todo.getCreateOn();
	}
	
	public List<TodoDTO> convertList(List<Todo> todo){
		List<TodoDTO> listTodoDTO = new ArrayList<TodoDTO>();
		if(!todo.isEmpty()){
			for(Todo todoIterator: todo){
				TodoDTO todoDTO = new TodoDTO(todoIterator);
				listTodoDTO.add(todoDTO);
			}
		}
		return listTodoDTO;
	}
}
