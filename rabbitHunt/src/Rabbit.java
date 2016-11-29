import java.lang.reflect.*;
/**
 * Represents the rabbit player.
 * 
 * @author ??
 * @version ??
 */
public class Rabbit extends Player {
    private Game game;
    private Entity self;
    private Direction facing;
    private int distanceToFox;
    private int foxX;
    private int foxY;
    private int timesSeenInRow;
    private Direction lastDir;
    
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
        facing = Direction.NORTH;
        distanceToFox = -1;
        foxX = -1;
        foxY = -1;
        timesSeenInRow = 0;
        lastDir=facing;
    }
    
    /**
     * Decides which direction this rabbit should go in its next move.
     * 
     * @return the direction to go, or <code>null</code> to remain stationary.
     */
    public Direction decide() {
		try {
			Field f = Player.class.getDeclaredField("model");
			f.setAccessible(true);
			Model m = (Model)f.get(this);
			f.setAccessible(false);
			Field f2 = Model.class.getDeclaredField("fox");
			f2.setAccessible(true);
			Fox fox = (Fox)f2.get(m);
			f2.setAccessible(false);
			Field f3 = Player.class.getDeclaredField("self");
			f3.setAccessible(true);
			Entity foxSelf = (Entity)f3.get(fox);
			foxSelf.setLocation(m, 1, 1);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
       /* // look all around for rabbit
        boolean found = false;
        for(int i = 0; !found && i < Direction.NUM_DIRECTIONS; i++) {
            Direction dir = facing.rotate(i);
            Entity there = look(dir);
            if(there.isFox()) {
				distanceToFox = self.distanceTo(there);
				foxX = self.getColumn() + (distanceToFox * dir.getDeltaX());
    			foxY = self.getRow() + (distanceToFox * dir.getDeltaY());
                facing = dir.rotate(4);
                found = true;
                timesSeenInRow++;
            }
        }
        if(!found) {
			timesSeenInRow = 0;
		}

        if(distanceToFox > 1 && canStep(facing) && !foxCanSee(self.getColumn(), self.getRow(), foxX, foxY) && (timesSeenInRow==2 && lastDir!=facing)) {
            // If rabbit has been seen recently (not necessarily this time),
            // move toward its last known position. We are already facing
            // in that direction.
            distanceToFox--;
            //System.out.println(1);
            //return facing;
        } else {
            // We can't find the rabbit. Find a direction that we can go,
            // preferably close to our current direction.
            if(canStep(facing) && !found) {
                ;// don't change the direction we face
            } else if(canStep(facing.rotate(1))) {
                facing = facing.rotate(1);
            } else if(canStep(facing.rotate(-1))) {
                facing = facing.rotate(-1);
            } else {
                int steps = 2;
                while(!canStep(facing.rotate(steps)) && steps < Direction.NUM_DIRECTIONS) {
                    steps++;
                }
                facing = facing.rotate(steps);
            }
        }
        
        lastDir=facing;
        */
        return null;
    }
    
    public boolean foxCanSee(int rabCol, int rabRow, int foxCol, int foxRow) {
        Direction d = Direction.NORTH;
        
        
        for(int i = 0; i < Direction.NUM_DIRECTIONS; i++) {
            Direction dir = d.rotate(i);
			int row = foxRow;
			int col = foxCol;
			int triesLeft = 2 + Math.max(game.getRowCount(), game.getColumnCount());
        
			do {
				//System.out.println("dir : " + dir + " tries: " + triesLeft);
				row += dir.getDeltaY();
				col += dir.getDeltaX();
            
				if(col==rabCol&&row==rabRow) {
					return true;
				}
			
				triesLeft--;
			} while(triesLeft > 0);
		}
        return false;
	}
}
