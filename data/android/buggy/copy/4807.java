public java.lang.String getNome() {
    java.lang.String[] vettore = nome.split("-");
    java.util.Arrays.sort(vettore);
    nome = ((vettore[0]) + "-") + (vettore[1]);
    return nome;
}