@com.example.test.Test
public void testUniritterContatoValidacaoError() throws java.lang.Exception {
    com.example.test.ContatoPagina.irPara(uniritterContexto);
    com.example.test.ContatoPagina.enviarContato();
    com.example.test.ContatoPagina.validaRetornoErro();
}