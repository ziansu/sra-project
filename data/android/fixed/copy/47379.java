@java.lang.Override
public void onClick(android.view.View v) {
    if ((viewDetailsListener) != null)
        viewDetailsListener.onViewClickListener(v.getId(), tradeBackupDataDTO.getTicket(), tradeBackupDataDTO);
    
}