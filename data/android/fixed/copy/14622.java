public void setIo_read_speed(int io_read_speed) {
    if ((this.io_read_speed) != io_read_speed) {
        org.kevoree.docker.containerDriver.core.cgroupDriver.BlkioDriver.setReadValue(this.getId(), java.lang.String.valueOf(io_read_speed));
        this.io_read_speed = io_read_speed;
    }
}