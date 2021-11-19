public play.mvc.Result index() {
    ch.helin.messages.experimental.MySimpleMessage mySimpleMessage = new ch.helin.messages.experimental.MySimpleMessage();
    mySimpleMessage.setRaw("This is a test message!");
    return play.mvc.Results.ok(play.libs.Json.toJson(null));
}