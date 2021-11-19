@org.springframework.messaging.handler.annotation.MessageMapping(value = "/regret")
@org.springframework.messaging.handler.annotation.SendTo(value = "/topic/regret")
public hello.ResponseMessage regert(java.lang.String value) throws java.lang.Exception {
    java.lang.System.out.println(value);
    AI.moveBack();
    return new hello.ResponseMessage("done");
}