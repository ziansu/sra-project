public void ecrireBool() {
    Ecriture.ecrireString(f, "; ");
    super.ecrireBool();
    Ecriture.ecrireStringln(f, "call ecrbool");
    Ecriture.ecrireStringln(f, "");
}