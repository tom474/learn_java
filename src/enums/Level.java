package enums;

public enum Level {
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
