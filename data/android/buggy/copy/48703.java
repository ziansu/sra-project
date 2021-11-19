public void perderVida() {
    status = ((vida) <= 0) ? Status.MORTO : Status.VIVO;
    java.text.DecimalFormat formato = new java.text.DecimalFormat("#.##");
    vida -= ((vida) * 5) / 100;
    formato.format(vida);
}