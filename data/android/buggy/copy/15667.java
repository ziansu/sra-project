@org.springframework.web.bind.annotation.RequestMapping(value = "/{lastname}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
public com.cejv679.soccerteamrosterweb.domain.Player playerByLastName(@org.springframework.web.bind.annotation.PathVariable
java.lang.String lastname) {
    final com.cejv679.soccerteamrosterweb.domain.Player findByLastName = playerRepository.findByLastName(lastname);
    return findByLastName;
}