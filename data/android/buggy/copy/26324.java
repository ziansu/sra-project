public void removeMember(droidsquad.voyage.model.objects.Member member) {
    int pos = this.mMembers.indexOf(member);
    this.mMembers.remove(pos);
    notifyItemRemoved(pos);
}