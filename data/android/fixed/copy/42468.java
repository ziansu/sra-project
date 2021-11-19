public void setEvents(modularity.coderdojoevents.Api.EventBrite.Response.BriteEvent events) {
    getEditor().putString(modularity.coderdojoevents.Settings.DojoSettings.KEY_EVENTS, modularity.coderdojoevents.Utils.Json.to(events)).commit();
}