public io.codechobostudy.notifications.dto.NotiCntDTO lazilyError_NotiCnt(io.codechobostudy.notifications.dto.NotiCntDTO notiCntDTO) {
    if (notiCntDTO != null) {
        notiCntDTO.setUserDTO(null);
    }
    return notiCntDTO;
}