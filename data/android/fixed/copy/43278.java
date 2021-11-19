private void setButtonsVisible() {
    this.buttonCreateDPU.setVisible(this.permissionUtils.hasUserAuthority(EntityPermissions.DPU_TEMPLATE_CREATE));
    this.exportButton.setVisible(this.permissionUtils.hasUserAuthority(EntityPermissions.DPU_TEMPLATE_EXPORT));
}