@com.google.api.server.spi.config.ApiMethod(name = "getJokeFromLibrary")
public com.example.Caleb.myapplication.backend.MyBean getJokeFromLibrary() {
    com.example.Caleb.myapplication.backend.MyBean response = new com.example.Caleb.myapplication.backend.MyBean();
    response.setData(com.example.JokeProvider.getJoke());
    return response;
}