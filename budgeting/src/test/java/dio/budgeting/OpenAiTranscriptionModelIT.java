package dio.budgeting;


import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnabledIfEnvironmentVariable(named = "OPENAI_API_KEY", matches = ".+")
public class OpenAiTranscriptionModelIT {
    @Autowired
    OpenAiAudioTranscriptionModel openAiTranscriptionModel;

    @ParameterizedTest
    @CsvSource({
            "bom-dia.m4a, dia",
            "boa-tarde.m4a, tarde",
            "boa-noite.m4a, noite",
            "cinema.m4a, 150 reais",
            "padaria.m4a, 15",
    })
    public void should_containExpectedKeywords_when_audioFileAreProcessed(String fileName, String expectedKeywords){
        var recording = new ClassPathResource("audio/" + fileName);
        var response = openAiTranscriptionModel.call(recording);

        assertThat(response).isNotEmpty();
        assertThat(response).contains(expectedKeywords);
        System.out.println(response);
    }
}
