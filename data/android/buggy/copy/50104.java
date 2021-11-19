private void saveConfigurations() {
    m_text.getText();
    scouter.client.stack.utils.ResourceUtils.saveFile(m_fileName, m_text.getText());
}