package dio.budgeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@EnabledIfEnvironmentVariable(named = "OPENAI_API_KEY", matches = ".+")
public class TooCallingIT {
    @Autowired
    OpenAiChatModel openAiChatModel;

    static class MathTools {
        @Tool(description = "soma dois números inteiros, a + b")
        public int sum(int a, int b) {
            return a + b;
        }

        @Tool(description = "subtrai dois números inteiros, a + b")
        public int diff(int a, int b) {
            return a - b;
        }
    }

        @Test
        void should_ExecuteSum_when_promted() {
            var chatClient = ChatClient.builder(openAiChatModel).defaultSystem("Voce é um matemático")
                    .defaultTools(new MathTools())
                    .build();

            var response = chatClient.prompt("Some 10 mais 20. Depois sutraia 30 do resultado anterior. Exiba apenas o resultado")
                    .call()
                    .content();

            assertThat(response).contains("0");
            System.out.println(response);

        }
}


