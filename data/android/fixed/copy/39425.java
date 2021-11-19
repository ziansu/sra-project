public void OwnPaste(neeapaste.Paste aPaste) {
    this.Pastes.add(aPaste);
    aPaste.setOwner(this);
}