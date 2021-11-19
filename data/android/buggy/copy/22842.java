public int getPhoneWinmobPart() {
    return (phoneClicks) > 0 ? ((phoneWinmobClicks) / (phoneClicks)) * 100 : 0;
}