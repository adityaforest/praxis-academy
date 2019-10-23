package perlakuan;
import cewek.siti.*;


public class action
{
    public void kasihBungaKeSiti()
    {        
        siti.relationshipLevel += 1;
    }
    public void kasihBungaKeMaemunah()
    {
        maemunah.relationshipLevel += 1;
    }
    public void kasihMobilKeSiti()
    {
        siti.relationshipLevel += 100;
    }
    public void kasihMobilKeMaemunah()
    {
        maemunah.relationshipLevel += 100;
    }
}
