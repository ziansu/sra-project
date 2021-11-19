@org.springframework.context.annotation.Bean
public vgalloy.riot.server.service.api.service.SummonerService summonerService() {
    return vgalloy.riot.server.service.api.factory.ServiceFactory.getSummonerService();
}