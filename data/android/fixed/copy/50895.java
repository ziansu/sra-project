public void updatePreview() {
    previewIsUpToDate = true;
    this.markdownParser.queueMarkdownHtmlRequest(markdownFile.getName(), document.getText(), true);
}