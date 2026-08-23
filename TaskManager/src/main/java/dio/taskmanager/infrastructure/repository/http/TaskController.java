package dio.taskmanager.infrastructure.repository.http;

import dio.taskmanager.application.CreateTaskUseCase;
import dio.taskmanager.application.GetTaskUseCase;
import dio.taskmanager.infrastructure.repository.http.request.CreateTaskRequest;
import dio.taskmanager.infrastructure.repository.http.request.TaskResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;
    private final GetTaskUseCase getTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase, GetTaskUseCase getTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.getTaskUseCase = getTaskUseCase;
    }
    @PostMapping
    TaskResponse create(@RequestBody CreateTaskRequest request) {
        var input = request.toInput();
        var output = createTaskUseCase.execute(input);
        return TaskResponse.from(output);
    }

    @GetMapping
    List<TaskResponse> list (){
        return getTaskUseCase.execute().stream().map(TaskResponse::from).toList();
    }


}
