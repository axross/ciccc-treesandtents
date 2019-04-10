package treesandtents.Model;

public class BoardModel {
    private String[][] boardModelGrid;

    public BoardModel(String[][] boardModelGrid) {
        this.boardModelGrid = boardModelGrid;
    }

    public String[][] getBoardModelGrid() {
        return boardModelGrid;
    }
    public String getBoardModelGrid(int row, int colunm) {
        return boardModelGrid[row][colunm];
    }

    public void setBoardModelGrid(String[][] boardModelGrid) {
        this.boardModelGrid = boardModelGrid;
    }

    public void setBoardModelGrid(int row, int colunm, String value) {
        this.boardModelGrid[row][colunm] = value;
    }


    public void countNumberOfDogs(){
        int countDogRow = 0;
        int countDogColunm = 0;
        for (int i = 1; i < boardModelGrid.length; i++) {
            for (int j = 1; j < boardModelGrid.length; j++) {
                if(boardModelGrid[i][j]=="Dog"){
                    countDogRow ++;
                }
                if (boardModelGrid[j][i]=="Dog"){
                    countDogColunm++;
                }

            }
            boardModelGrid[i][0] = Integer.toString(countDogRow);
            boardModelGrid[0][i] = Integer.toString(countDogColunm);
            countDogRow = 0;
            countDogColunm = 0;
        }
    }

    public boolean thereIsEmptyCells(){
        for (int i = 1; i < boardModelGrid.length; i++) {
            for (int j = 1; j < boardModelGrid.length; j++) {
                if (boardModelGrid[i][j].equals("Empty")){
                    return true;
                }
            }
        }
        return false;
    }

    public void reset() {
        String[][] inicialBoardModelGrid = new String[][] {
                {" ", "0", "0", "0", "0", "0"},
                {"0", "Empty", "Empty", "Empty", "Empty", "Empty"},
                {"0", "Empty", "Bone", "Empty", "Bone", "Empty"},
                {"0", "Empty", "Empty", "Empty", "Empty", "Empty"},
                {"0", "Bone", "Bone", "Empty", "Empty", "Empty"},
                {"0", "Empty", "Empty", "Empty", "Empty", "Bone"}
        };

        setBoardModelGrid(inicialBoardModelGrid);
    }
}
