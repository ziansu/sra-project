@org.springframework.context.annotation.Bean
public org.springframework.boot.autoconfigure.web.HttpMessageConverters messageConverters(com.google.gson.Gson gson) {
    fi.thl.termed.util.jena.JenaModelMessageConverter jenaModelMessageConverter = new fi.thl.termed.util.jena.JenaModelMessageConverter();
    org.springframework.http.converter.json.GsonHttpMessageConverter gsonHttpMessageConverter = new org.springframework.http.converter.json.GsonHttpMessageConverter();
    gsonHttpMessageConverter.setGson(gson);
    return new org.springframework.boot.autoconfigure.web.HttpMessageConverters(jenaModelMessageConverter, gsonHttpMessageConverter);
}