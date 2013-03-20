/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.zum.utils.ScoreCommit;

/**
 *
 * @author Jenda
 */
public class Score {
    private int score;
    
    public Score(int score)
    {
        this.score = score;
    }

    @Override
    public String toString() {
        return Integer.toString(this.score);
    }
    
}
