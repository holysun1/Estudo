package dio.taskmanager.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class TaskRepositoryTest {
    TaskRepository repository;
    protected  abstract TaskRepository createRepository();
    @BeforeEach
    public void setUp() {
        this.repository = createRepository();
    }
    @Test
    void should_save_and_retrieve_task_by_id() {
        var task = new Task( "Passar na padaria", Optional.empty());

        var savable = repository.save(task);
        Optional<Task> retrieved = repository.findById(savable.getId());

        assertThat(retrieved).isPresent();
        assertThat(retrieved.get().getId()).isEqualTo(task.getId());
        assertThat(retrieved.get().getDescription()).isEqualTo(task.getDescription());
        assertThat(retrieved.get().getStatus()).isEqualTo(task.getStatus());
    }

    @Test
    void should_find_all_persisted_tasks(){
        var task1 = new Task("Arrumar chuveiro", Optional.of("Comparara chuveiro novo"));
        var task2 = new Task("Trocar Interruptor", Optional.of("Encontrar chave de fenda"));

        repository.save(task1);
        repository.save(task2);

        List<Task> tasks = repository.findAll();

        assertThat(tasks).hasSize(2);
        assertThat(tasks).extracting(Task::getId).containsExactlyInAnyOrder(task1.getId(),task2.getId());
    }

    @Test
    void should_delete_task_by_id(){
        var task = repository.save(new Task("Treinar na academia", Optional.empty()));
        var taskId = task.getId();

        repository.delete(taskId);
        Optional<Task> result = repository.findById(taskId);

        assertThat(result).isEmpty();
    }

    @Test
    void should_return_empty_when_searching_non_existent_task(){
        var nonExinsertId = new TaskId();
        Optional<Task> result = repository.findById(nonExinsertId);
        assertThat(result).isEmpty();
    }
    @Test
    void should_update_and_retrieve_task_by_id(){
        var task = repository.save(new Task("Atualizar a Carteira de Habilitação", Optional.empty()));

        task.setDescription(Optional.of("Nao expirou ainda"));
        task.setStatus(TaskStatus.IN_PROGRESS);
        repository.save(task);

        Optional<Task> result = repository.findById(task.getId());

        assertThat(result).isPresent().hasValueSatisfying(savedTask -> {
            assertThat(savedTask.getDescription()).contains("Nao expirou ainda");
            assertThat(savedTask.getStatus()).isEqualTo(TaskStatus.IN_PROGRESS);
        });
    }

}