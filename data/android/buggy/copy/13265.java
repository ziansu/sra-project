public void setCurrentDelay(int currentDelay) {
    this.currentDelay = com.arcade_renegade.renegade_drive.RenegadeDrive.validByte(currentDelay, 0, delayLength);
}