private java.awt.event.ActionListener configuraActionListener() {
    return new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            iconItec.displayMessage("Action Event", "An Action Event Has Been Peformed!", java.awt.TrayIcon.MessageType.INFO);
        }
    };
}