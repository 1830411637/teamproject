public class footballTeam {
    //Set the variables we need, and hide and expose them reasonably
    private int id;
    private String teamName;
    private int award;
    private String celebrity;
    private String clothes;
    private String style;
    public footballTeam() {
    }
    //Create a constructor with tangible parameters
    public footballTeam(int id, String teamName, int award, String celebrity, String clothes, String style) {
        this.id = id;
        this.teamName = teamName;
        this.award = award;
        this.celebrity = celebrity;
        this.clothes = clothes;
        this.style= style;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getCelebrity() {
        return celebrity;
    }

    public void setCelebrity(String celebrity) {
        this.celebrity = celebrity;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
