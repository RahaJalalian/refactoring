package theater;

/**
 * Represents a play in the theater system with a name and type
 * (e.g., "comedy" or "tragedy").
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Create a new Play.
     *
     * @param name the name of the play
     * @param type the genre of the play
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
