public class CricketGame {


    enum Outcome
    {
        TODO, TODOS, TODOOS; //TODO
    }

    /**
     * Bowls the ball and updates the game state depending on the given outcome.
     * Note that after a call to this method with Outcome.HIT,
     * the ball will be in play (isInPlay() returns true).
     *
     * @param outcome outcome of this bowl
     */
    void bowl(Outcome outcome) {

    }

    /**
     * Returns the number of times the bowler has bowled so far during the current over,
     * not counting wides or no-balls.
     * @return number of bowls so far in the current over
     */
    int getBowlCount() {

        return 0; //TODO
    }

    /**
     * Returns the number of innings that have been completed.
     * @return number of completed innings
     */
    int getCompletedInnings() {

        return 0; //TODO

    }

    /**
     * Returns the number of players out in the current innings.
     * @return number of players out
     */
    int getOuts() {

        return 0; //TODO

    }

    /**
     * Returns the number of completed overs for the current innings.
     * @return number of overs for the current innings
     */
    int getOverCount() {

        return 0; //TODO

    }

    /**
     *Returns the score for one of the two sides.
     * @param battingSide battingSide - if true, returns the score for the side currently at bat;
     *                    otherwise returns the score for the other side
     * @return score for one of the two sides
     */
    int getScore(boolean battingSide) {

        return 0; //TODO

    }

    /**
     * Returns true if the game has ended, false otherwise.
     * @return true if the game has ended, false otherwise
     */
    boolean isGameEnded() {

        return true; //TODO

    }

    /**
     * Returns true if the ball is currently in play. The ball is in play directly following a
     * call to bowl(Outcome.HIT) and is taken out of play by a subsequent call to safe or runOut.
     * @return true if the ball is currently in play, false otherwise
     */
    boolean isInPlay() {

        return true; //TODO

    }

    /**
     * Returns true if batsmen are currently running. Batsmen are running directly following a
     * call to tryRun and remain in a running state until a subsequent call to safe or runOut.
     * @return true if batsmen are running, false otherwise
     */
    boolean isRunning() {

        return true; //TODO

    }

    /**
     * Runs the batsman out (i.e., fielders knock over wicket while batsmen are running).
     * Does not count as a run. After this method is called, isRunning() returns false and
     * isInPlay() returns false. Does nothing if game is already over or if batsmen are not
     * running.
     */
    void runOut() {


    }

    /**
     * Transitions from ball in play to ball not in play, without an out.
     * If batsmen were running, that run is successfully completed and a run is added to the
     * score, After this method is called, isRunning() returns false and isInPlay() returns false.
     * Method does nothing if game is already over or ball is not in play.
     */
    void safe() {

    }

    /**
     * Starts the batsmen running from one end of the pitch to the other.
     * After this method is called, isRunning() returns true. If the batsmen were already
     * running, that run is assumed to have completed successfully and so a run is added
     * to the score for the batting side. Method does nothing if game is already over or ball
     * is not in play.
     */
    void tryRun() {

    }

    /**
     * Returns 0 if side 0 is batting or 1 if side 1 is batting.
     * @return 0 if side 0 is batting or 1 if side 1 is batting
     */
    int whichSideIsBatting() {
        return 0; //TODO

    }


}