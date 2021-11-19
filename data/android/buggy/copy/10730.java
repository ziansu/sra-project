public void asd() {
    java.sql.Connection con = bd.getConnection();
    java.io.File img = new java.io.File("bin/img/coca.png");
    ci.insertarImagen(con, img, 2, "bebida");
}