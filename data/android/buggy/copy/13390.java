private boolean isAnimeInvalid(final io.github.manami.dto.entities.Anime anime) {
    return (anime == null) || (anime.getInfoLink().isPresent());
}