package Everything;

class WhereIsShips {


    protected static int[][] arr() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = (int) (Math.random() * 7);
            for (int j = randomNumber; j <= randomNumber + 3; j++) {
                arr[i][j] = 1;
            }
        }
        return arr;
    }
}