@java.lang.Override
public com.whatsthatlight.teamcity.hipchat.HipChatEmoticons getEmoticons(int startIndex) {
    if ((this.emoticonsResult) == null) {
        return super.getEmoticons(startIndex);
    }else {
        return this.emoticonsResult;
    }
}