package dio.taskmanager.application;

import dio.taskmanager.application.Input.UpdateTaskInput;
import dio.taskmanager.application.Ouput.TaskOutput;
import dio.taskmanager.domain.Task;
import dio.taskmanager.domain.TaskId;
import dio.taskmanager.domain.TaskNotFoundException;
import dio.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateTaskUseCase {
    private final TaskRepository repository;
    public UpdateTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id, UpdateTaskInput input){
        var task = repository.findById(id).orElseThrow(()-> new TaskNotFoundException(id));
        var updated = repository.save(task);
        return TaskOutput.from(updated);
    }
}
