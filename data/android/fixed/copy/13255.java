@org.junit.Before
public void init() {
    Resources.URL_TO_KOLAER_RESTFUL.delete(0, Resources.URL_TO_KOLAER_RESTFUL.length()).append("localhost:8080");
    Resources.URL_TO_KOLAER_WEB.delete(0, Resources.URL_TO_KOLAER_WEB.length()).append("localhost:8080");
}