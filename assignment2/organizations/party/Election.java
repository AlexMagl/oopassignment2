package assignment2.organizations.party;

/**
 * TODO finish this class. (0.25 points)
 */
public class Election {
    private int votersNumber;
    private boolean fair;
    private String description;

    public Election(int votersNumber, boolean fair, String description) {
        this.votersNumber = votersNumber;
        this.fair = fair;
        this.description = description;
    }

    // Getters and setters
    public int getVotersNumber() {
        return votersNumber;
    }

    public boolean isFair() {
        return fair;
    }
    public String getDescription() {
        return description;
    }

    public void setVotersNumber(int votersNumber) {
        this.votersNumber = votersNumber;
    }

    public void setFair(boolean fair) {
        this.fair = fair;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
