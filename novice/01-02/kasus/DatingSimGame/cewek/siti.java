package cewek;

public class siti
{
    public String nama = "siti";
    public String status = "mahasiswa";
    public int umur = 17;
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
        if(relationshipLevel >= 1000)
        {
            System.out.println("Selamat , siti jatuh cinta pada anda !");
        }
    }
}
