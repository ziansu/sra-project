@java.lang.Override
public boolean isHighlightable() {
    return ((this.team) == (com.mojang.mojam.MojamComponent.localTeam)) || ((this.team) == (com.mojang.mojam.entity.mob.Team.Neutral));
}