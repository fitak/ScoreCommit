package cz.cvut.fit.zum.utils.ScoreCommit;

/**
 *
 * @author Jenda
 */
public class ScoreCommiter {
    private Token token;    
    private String server;
    
    public ScoreCommiter(Token token, String server)
    {
        this.token = token;
        this.server = server;
    }
    
    public ScoreCommiter(Token token)
    {
        this(token, "http://localhost/TwitterBootstrapTest/document_root/commit/%token%/%score%");
    }
    
    public void commitScore(Score score)
    {
        String callAddress = server.replace("%token%", this.token.toString()).replace("%score%", score.toString());
        String result = HttpUtil.sendGetRequest(callAddress, null);
        System.out.println("Response: "+result);
    }
}
