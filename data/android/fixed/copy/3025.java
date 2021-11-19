@org.junit.Test
public void ElfoVerdeNaoAtiraFlechaENRecebeXP() {
    ElfosVerdes teste = new ElfosVerdes();
    assertEquals(0, teste.getExperiencia());
}