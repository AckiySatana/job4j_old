package ru.job4j.tictactoe;


public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;

    }

    /** Задача сделать 3 метода т е новых не делаем
     * @return
     */
    public boolean isWinnerX() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            if (!result && this.table[i][0].hasMarkX()
                    && this.table[i][1].hasMarkX()
                    && this.table[i][2].hasMarkX()) result = true;
            if (!result && this.table[0][i].hasMarkX()
                    && this.table[1][i].hasMarkX()
                    && this.table[2][i].hasMarkX()) result = true;
            if (!result && i < 1 && this.table[i][i].hasMarkX()
                    && this.table[1][1].hasMarkX()
                    && this.table[2][2].hasMarkX()) result = true;
            if (!result && i < 1 && this.table[i][2].hasMarkX()
                    && this.table[1][1].hasMarkX()
                    && this.table[2][0].hasMarkX()) result = true;
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            if (!result && this.table[i][0].hasMarkO()
                    && this.table[i][1].hasMarkO()
                    && this.table[i][2].hasMarkO()) result = true;
            if (!result && this.table[0][i].hasMarkO()
                    && this.table[1][i].hasMarkO()
                    && this.table[2][i].hasMarkO()) result = true;
            if (!result && i < 1 && this.table[i][i].hasMarkO()
                    && this.table[1][1].hasMarkO()
                    && this.table[2][2].hasMarkO()) result = true;
            if (!result && i < 1 && this.table[i][2].hasMarkO()
                    && this.table[1][1].hasMarkO()
                    && this.table[2][0].hasMarkO()) result = true;
        }
        return result;
    }

    /**
     * Есть ли пустые клетки
     *
     * @return
     */
    public boolean hasGap() {
        Boolean result= false;
        for (int i=0;i<3;i++) {
            for (int j = 0;j<3;j++)
            if (!this.table[i][j].hasMarkX() && !this.table[i][j].hasMarkO()){
                result = true;
                break;
            }
        }
        return result;
    }
}
