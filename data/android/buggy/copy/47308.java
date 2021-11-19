public void setRemap(java.util.HashMap<java.lang.Character, java.lang.Character> remap) {
    if ((remap_) == null)
        remap_ = new src.io.controller.UserController.KeyRemapper();
    
    remap_.setMap(remap_);
}