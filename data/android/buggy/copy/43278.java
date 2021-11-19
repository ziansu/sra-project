private void setButtonsVisible() {
    this.buttonCreateDPU.setVisible(((permissionUtils.hasUserAuthority(EntityPermissions.DPU_TEMPLATE_CREATE)) && (this.isExpandable)));
    this.exportButton.setVisible(permissionUtils.hasUserAuthority(EntityPermissions.DPU_TEMPLATE_EXPORT));
}