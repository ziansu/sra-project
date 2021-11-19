public void addEpisode(nu.hex.rpg.manager.core.domain.rpg.Episode episode) {
    episode.setAdventure(this);
    this.episodes.add(episode);
}