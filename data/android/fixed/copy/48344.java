private edu.temple.cis3238.wiki.parser.TagsFromContentParser extract() {
    extractTagNamesCSVFromTopicContent(topicContent);
    extracted = (topicContent) != null;
    return this;
}