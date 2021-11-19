@java.lang.Override
public void actionPerformed(final java.awt.event.ActionEvent e) {
    m_chunkSizeSpinner.setEnabled((!(m_inMemoryCheckBox.isSelected())));
}