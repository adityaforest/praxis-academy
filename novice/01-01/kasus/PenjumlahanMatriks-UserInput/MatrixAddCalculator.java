import java.util.Scanner;

public class MatrixAddCalculator
{
    int[][] matResult;
    int[][] matA;
    int[][] matB;

    public void SetMat()
    {
        //masukan jumlah kolom dan baris dari user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix-Adding Calculator");
        System.out.println("===================");
        System.out.println("Masukan jumlah baris : ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Masukan jumlah kolom: ");
        int col = Integer.parseInt(scanner.nextLine());

        //declare array multidimensi berdasarkan kolom dan baris yang dimasukan
        matResult = new int[row][col];
        matA = new int[row][col];
        matB = new int[row][col];

        //set setiap nilai matriks a dari user
        for(int a = 0;a<row;a++)
        {
            for(int b = 0;b<col;b++)
            {
                System.out.println("Masukan nilai baris " + (a+1) + " kolom " + (b+1) + " matriks A : ");
                matA[a][b] = Integer.parseInt(scanner.nextLine());                
            }   
        }

        //set setiap nilai matriks b dari user
        for(int c = 0;c<row;c++)
        {
            for(int d = 0;d<col;d++)
            {
                System.out.println("Masukan nilai baris " + (c+1) + " kolom " + (d+1) + " matriks B : ");
                matB[c][d] = Integer.parseInt(scanner.nextLine());
            }   
        }

        //jumlahkan matriks dan tampilkan hasilnya
        System.out.println("Hasil penjumlahan matriks : ");        
        for(int e = 0;e<row;e++)
        {
            for(int f = 0;f<col;f++)
            {
                matResult[e][f] = matA[e][f] + matB[e][f];
                System.out.print(matResult[e][f]);
            }   
            System.out.println();    
        }
    }

    public static void main (String[] args)
    {
        MatrixAddCalculator mac = new MatrixAddCalculator();
        mac.SetMat();                
    }
}
