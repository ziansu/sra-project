@org.springframework.web.bind.annotation.RequestMapping(value = "/readimage")
public com.friendsSuggestor.model.FriendSuggestor readimage(java.lang.String name) {
    com.friendsSuggestor.model.FriendSuggestor friendSuggestor = suggestorService.read(name);
    return friendSuggestor;
}