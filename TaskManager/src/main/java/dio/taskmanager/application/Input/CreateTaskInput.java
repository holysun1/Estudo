package dio.taskmanager.application.Input;

import java.util.Optional;

public record CreateTaskInput(String title, Optional <String> description) {

}
