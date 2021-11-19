public me.ramswaroop.jbot.core.slack.models.RichMessage refreshGlossary() {
    repository.refreshGlossary();
    return new me.ramswaroop.jbot.core.slack.models.RichMessage("Glossary was refreshed: ");
}