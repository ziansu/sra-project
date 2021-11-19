@org.springframework.context.annotation.Bean
public com.google.gson.Gson getGson() {
    return new com.google.gson.GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
}