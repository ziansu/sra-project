private void kringToevoegen(java.lang.String naam, javafx.scene.paint.Color kleur) {
    main.Kring kring = new main.Kring(naam, kleur);
    main.Main.getKringen().add(kring);
    weergaveKringToevoegen(kring);
}