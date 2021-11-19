private void shake(org.apache.wicket.ajax.AjaxRequestTarget target) {
    com.googlecode.wicket.jquery.ui.effect.JQueryEffectBehavior shake = new com.googlecode.wicket.jquery.ui.effect.JQueryEffectBehavior(("#" + (getMarkupId())), "shake");
    target.appendJavaScript(shake.toString());
}