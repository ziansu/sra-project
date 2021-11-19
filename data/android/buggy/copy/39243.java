public components.Space getSpace(definitions.Rank rank, definitions.File file) {
    return spaces[rank.ordinal()][file.ordinal()];
}