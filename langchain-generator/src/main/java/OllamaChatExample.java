import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

public class OllamaChatExample {

    public static void main(String[] args) {

        String modelName = "llama3.1";

        ChatLanguageModel model =
                OllamaChatModel.builder().baseUrl("http://localhost:11434").modelName(modelName).build();

        String answer = model.generate("Provide 3 short bullet points explaining why Java is awesome");
        System.out.println(answer);


    }


}
