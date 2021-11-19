@java.lang.Override
public void call(final ws.wamp.jawampa.Reply reply) {
    final com.fasterxml.jackson.databind.JsonNode node = reply.arguments().get(0);
    handler.onResult(mapper.convertValue(node, resClass));
}