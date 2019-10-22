public class MatrixAddCalculator
{
    int[][] matResult = new int[5][5];
    int[][] matA = new int[5][5];
    int[][] matB = new int[5][5];

    public void SetMat()
    {
        //set matriks a berisi full 1 semua 
        for(int a = 0;a<5;a++)
        {
            for(int b = 0;b<5;b++)
            {
                matA[a][b] = 1;
            }   
        }

        //set matriks b berisi full 4 semua
        for(int c = 0;c<5;c++)
        {
            for(int d = 0;d<5;d++)
            {
                matB[c][d] = 4;
            }   
        }
    }

    public void AddMat()
    {
        for(int e = 0;e<5;e++)
        {
            for(int f = 0;f<5;f++)
            {
                matResult[e][f] = matA[e][f] + matB[e][f];
            }   
        }
    }

    public void PrintResult()
    {
        for(int g = 0;g<5;g++)
        {
            for(int h = 0;h<5;h++)
            {
                //matResult[e][f] = matA[e][f] + matB[e][f];
                System.out.print(matResult[g][h]);
            }
            System.out.println();    
        }
    }

    public static void main (String[] args)
    {
        MatrixAddCalculator mac = new MatrixAddCalculator();
        mac.SetMat();
        mac.AddMat();
        System.out.println("Hasil penjumlahan matriks 5x5 , dimana matriks a berisi 1 semua dan matriks b berisi 4 semua adalah ");
        mac.PrintResult();
    }
}
