/**
 * Represents the rabbit player.
 * 
 * @author ??
 * @version ??
 */
public class Rabbit extends Player {
    private Game game;
    private Entity self;
    
    /**
     * Constructs the rabbit player.
     * 
     * @param myGame  the game in which this player plays.
     * @param mySelf  the entity that this player controls.
     */
    public Rabbit(Game myGame, Entity mySelf) {
        super();
        game = myGame;
        self = mySelf;
    }
    
    /**
     * Decides which direction this rabbit should go in its next move.
     * 
     * @return the direction to go, or <code>null</code> to remain stationary.
     */
    public Direction decide() {
        return game.randomDirection();
    }
}
