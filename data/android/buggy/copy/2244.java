@java.lang.Override
public void perform(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    timeline.Event event = createEventFromRequest(request);
    addEventToTimeline(request, event);
    super.redirect(response);
}