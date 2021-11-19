@org.springframework.context.annotation.Bean
public org.springframework.boot.autoconfigure.web.HttpMessageConverters messageConverters(com.google.gson.Gson gson) {
    org.springframework.http.converter.json.GsonHttpMessageConverter gsonHttpMessageConverter = new org.springframework.http.converter.json.GsonHttpMessageConverter();
    gsonHttpMessageConverter.setGson(gson);
    fi.thl.termed.util.jena.JenaModelMessageConverter jenaModelMessageConverter = new fi.thl.termed.util.jena.JenaModelMessageConverter();
    return new org.springframework.boot.autoconfigure.web.HttpMessageConverters(gsonHttpMessageConverter, jenaModelMessageConverter);
}