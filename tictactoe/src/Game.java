public class Game {

    enum GameState {WIN, DRAW, CONTINUE}

    enum CellState {X, O, EMPTY}

    System.out.println("Hello world!");
    System.out.println("Hello world!");
    public int checkWin() {
        updateMatrix();
        if (a[0] != 2 && a[0] == a[1] && a[1] == a[2])
            return a[0];
        if (a[3] != 2 && a[3] == a[4] && a[4] == a[5])
            return a[3];
        if (a[6] != 2 && a[6] == a[7] && a[7] == a[8])
            return a[6];

        if (a[0] != 2 && a[0] == a[3] && a[3] == a[6])
            return a[0];
        if (a[1] != 2 && a[1] == a[4] && a[4] == a[7])
            return a[1];
        if (a[2] != 2 && a[2] == a[5] && a[5] == a[8])
            return a[2];

        if (a[0] != 2 && a[0] == a[4] && a[4] == a[8])
            return a[0];
        if (a[2] != 2 && a[2] == a[4] && a[4] == a[6])
            return a[2];
        for (int i = 0; i < 9; i++)
            if (a[i] == 2)
                return -1;
        return 2;
    }
}
