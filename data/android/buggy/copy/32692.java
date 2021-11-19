private boolean checkEmpty(javax.servlet.http.HttpSession session, java.lang.String ticketResetPassword) {
    if (ticketResetPassword.equals(ua.nure.hanzha.SummaryTask4.servlet.check.CheckTicketResetPasswordServlet.EMPTY_PARAM)) {
        session.setAttribute(SessionAttribute.CHECK_TICKET_IS_EMPTY, true);
        return true;
    }else {
        session.setAttribute(SessionAttribute.CHECK_TICKET_IS_EMPTY, false);
    }
    return false;
}