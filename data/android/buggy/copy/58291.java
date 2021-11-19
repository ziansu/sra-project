@java.lang.Override
public int compare(com.crystalplanet.obsidianpoker.util.Pair<com.crystalplanet.obsidianpoker.game.card.CardRank, java.lang.Integer> l, com.crystalplanet.obsidianpoker.util.Pair<com.crystalplanet.obsidianpoker.game.card.CardRank, java.lang.Integer> r) {
    return l.second.equals(r.second) ? l.first.compareTo(r.first) : l.second.compareTo(r.second);
}