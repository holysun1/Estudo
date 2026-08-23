package dio.taskmanager.application.Ouput;

import dio.taskmanager.domain.Task;

public record TaskOutput(String id, String title, java.util.Optional<String> description, String status) {

    public static TaskOutput from(Task task) {
        return new TaskOutput(task.getId().id().toString(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus().name());
    }
}
