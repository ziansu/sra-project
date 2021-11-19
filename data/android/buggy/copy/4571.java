@java.lang.Override
public void joined(fr.sii.survival.core.domain.player.Player player, fr.sii.survival.core.domain.Game game) {
    template.convertAndSend(((((fr.sii.survival.WebSocketConfig.SERVER_PUBLISH_PREFIX) + "/") + (game.getId())) + "/joined"), new fr.sii.survival.dto.PlayerAndGame(player, game));
}