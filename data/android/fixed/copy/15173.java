public boolean contemNo(br.univali.portugol.nucleo.asa.NoDeclaracao no) {
    if (no == null) {
        return false;
    }
    return (getItemDoNo(no)) != null;
}