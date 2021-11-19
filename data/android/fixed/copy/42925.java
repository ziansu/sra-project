@org.springframework.web.bind.annotation.RequestMapping(value = "infos")
public de.axelspringer.ideas.tools.dash.presentation.UiInfo infos() throws java.io.IOException, java.lang.InterruptedException, java.net.URISyntaxException, java.util.concurrent.ExecutionException, org.apache.http.auth.AuthenticationException {
    return UiInfoService.infos();
}