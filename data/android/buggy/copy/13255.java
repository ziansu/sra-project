@org.junit.Before
public void init() {
    Resources.URL_TO_KOLAER_RESTFUL.delete(0, Resources.URL_TO_KOLAER_RESTFUL.length()).append("js:8080/ru.kolaer.server.restful");
    Resources.URL_TO_KOLAER_WEB.delete(0, Resources.URL_TO_KOLAER_WEB.length()).append("localhost:8080");
}