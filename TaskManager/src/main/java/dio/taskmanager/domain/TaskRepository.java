package dio.taskmanager.domain;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository {
    Task save(Task task);
    Optional<Task> findById(TaskId id);
    List<Task> findAll();
    void delete(TaskId id);
}

