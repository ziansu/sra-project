protected short updateCombustionDuration(final int value) {
    return combustionDuration += (((combustionDuration) + value) > 0) ? value : (combustionDuration) * (-1);
}