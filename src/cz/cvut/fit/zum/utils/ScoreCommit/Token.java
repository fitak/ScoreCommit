package cz.cvut.fit.zum.utils.ScoreCommit;

/**
 *
 * @author Jenda
 */
public class Token {
    private String token = null;
    
    public Token(String token)
    {
        this.token = token;
    }

    @Override
    public String toString() {
        return this.token;
    }
}
