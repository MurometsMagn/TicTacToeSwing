package MainPackage;

/**
 * Created by Smolentsev Il'ya on 03.11.2019.
 */
public class TicTacToe {

    //public static String[][] arrayTicTac = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    public static String[][] arrayTicTac = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    static boolean winner(int x, int y, String xo) {
        return
                ((arrayTicTac[0][y] == xo && arrayTicTac[1][y] == xo && arrayTicTac[2][y] == xo)  //горизонталь
                        || (arrayTicTac[x][0] == xo && arrayTicTac[x][1] == xo && arrayTicTac[x][2] == xo) //вертикаль
                        || (((x == 0 && y == 0) || (x == 1 && y == 1) || (x == 2 && y == 2)) // лев диагональ
                        && (arrayTicTac[0][0] == xo && arrayTicTac[1][1] == xo && arrayTicTac[2][2] == xo))
                        || (((x == 2 && y == 0) || (x == 1 && y == 1) || (x == 0 && y == 2)) //пр диагональ
                        && (arrayTicTac[2][0] == xo && arrayTicTac[1][1] == xo && arrayTicTac[0][2] == xo)));
    }
}
