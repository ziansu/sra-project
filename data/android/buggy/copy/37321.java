@java.lang.Override
public void setBoardID(com.kauailabs.navx.AHRSProtocol.BoardID board_id) {
    synchronized(this) {
        board_type = board_id.type;
        hw_rev = board_id.hw_rev;
        fw_ver_major = board_id.fw_ver_major;
        fw_ver_minor = board_id.fw_ver_minor;
    }
}