package Algorithms;

public class reggre {
    public static void main(String[] args) {
        char[][] map1 = {
                {'1', '0', '0'},
                {'0', '0', '0'},
                {'1', '1', '1'},
        };
        char[][] map2 = {
                {'1', '1', '0', '0', '1'},
                {'1', '0', '0', '0', '1'},
                {'0', '0', '1', '0', '1'},
                {'0', '0', '0', '1', '1'},
                {'0', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
        };
        int a = GetOstrova(map2);
        System.out.println(a);

        Integer h = 128;
        Integer g = 128;
        System.out.println(h==g);
    }
    public static int GetOstrova(char[][] y) {
        int countostrova = 0;
        int rows = y.length;
        int cols = y[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(y[i][j] == '1')
                {
                    countostrova++;
                    qwe(y,i,j);

                }
            }
        }
        return countostrova;
    }
    public static void qwe(char[][] y,int i,int j)
    {
        int rows = y.length;
        int cols = y[0].length;

        if(i < 0 || i >= rows || j < 0 || j >= cols || y[i][j] == '0')
        {
            return;
        }
        y[i][j] = '0';


        qwe(y , i + 1, j );

        qwe(y , i - 1, j) ;

        qwe(y , i ,j + 1 );

        qwe(y , i ,j - 1 );

        qwe(y , i - 1 , j - 1 );
        qwe(y , i + 1 , j + 1 );

    }

}
