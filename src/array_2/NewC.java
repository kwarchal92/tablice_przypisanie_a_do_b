package array_2;

public class NewC{

    public static void main(String[] args)
    {
        int n = 10, i, j;
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        //wpisywanie liczb do tablicy a

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                a[i][j] = j;
            }
        }

        //wpisywanie liczb z tablicy a do tablicy b

        for (i = 0; i < b.length; i++)
        {
            for (j = 0; j < b.length; j++)
            {
                b[i][j] = a[j][i]; //zamiana kolumn na wiersze
            }
        }

        //wyswietlenie zawartosci tablicy a

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println();

        //wyswietlenie zawartosci tablicy b

        for (i = 0; i < b.length; i++)
        {
            for (j = 0; j < b.length; j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
