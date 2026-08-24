package dio.budgeting.application.input;

import dio.budgeting.domain.Category;
import org.springframework.ai.tool.annotation.ToolParam;

public record PersistTransactionInput (@ToolParam(description = "Descrição de gasto.")String description,
                                       @ToolParam(description = "Valor do gasto.")long amount,
                                       @ToolParam(description = "Categoria de uma transação.")Category category){
}
