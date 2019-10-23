package cewek;

public class maemunah
{
    public String nama = "maemunah";
    public String status = "janda anak satu";
    public int umur = 37;
    public int relationshipLevel = 0;

    public void printStatus()
    {
        System.out.println("Nama = " + nama);
        System.out.println("Status = " + status);
        System.out.println("Umur = " + umur);
        System.out.println("Relationship Level = " + relationshipLevel);
    }

    public void process()
    {
        if(relationshipLevel >= 500)
        {
            System.out.println("Selamat , maemunah jatuh cinta pada anda !");
        }
    }
}
