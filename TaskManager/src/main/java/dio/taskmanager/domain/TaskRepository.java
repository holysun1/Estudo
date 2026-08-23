package dio.taskmanager.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository {
    Task save(Task task);
    Optional<Task> findById(TaskId id);
    List<Task> findAll();
    void delete(TaskId id);
}

