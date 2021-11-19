@org.springframework.messaging.handler.annotation.MessageMapping(value = "add")
@org.springframework.messaging.handler.annotation.SendTo(value = "/response/operation")
@org.springframework.web.bind.annotation.ResponseBody
public ru.antowka.stock.model.Message login(@org.springframework.web.bind.annotation.ModelAttribute
ru.antowka.stock.model.Operation operation) throws java.lang.Exception {
    operationService.addOperation(operation);
    return new ru.antowka.stock.model.Message(0, "You are create new operation!");
}