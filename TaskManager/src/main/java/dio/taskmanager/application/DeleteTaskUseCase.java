package dio.taskmanager.application;

import dio.taskmanager.domain.TaskId;
import dio.taskmanager.domain.TaskNotFoundException;
import dio.taskmanager.domain.TaskRepository;

public class DeleteTaskUseCase {
    private final TaskRepository repository;

    public DeleteTaskUseCase(TaskRepository taskRepository) {
        this.repository = taskRepository;
    }
    public void execute(TaskId taskId) throws TaskNotFoundException {
        repository.delete(taskId);
    }
}
