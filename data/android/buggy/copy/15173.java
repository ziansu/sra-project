public boolean contemNo(br.univali.portugol.nucleo.asa.NoDeclaracao no, boolean consideraEscopo) {
    if (no == null) {
        return false;
    }
    return (getItemDoNo(no, consideraEscopo)) != null;
}