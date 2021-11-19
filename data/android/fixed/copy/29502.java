@org.junit.Test
public void ElfoVerdeNAtiraFlechaENPerdeFlecha() {
    ElfosVerdes teste = new ElfosVerdes();
    int quantFlechas = teste.getFlechaDeVidro().getQuantidade();
    assertEquals(42, quantFlechas);
}