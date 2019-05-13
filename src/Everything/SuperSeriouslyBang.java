package Everything;

import java.io.*;

class SuperSeriouslyBang  {
    protected static void superSeriouslyBang() throws IOException {

        WhereIsShips arr = new WhereIsShips();
        int [][] ships = arr.arr();

        UserInput userInput = new UserInput();
        int [] coordinates;
        int coord1;
        int coord2;


        int lineSumm;
        int count=0;
        int allSumm;
        int x=ships.length;
        do {
            count++;
            coordinates = userInput.userInputs();
            coord1 = coordinates[0];
            coord2 = coordinates[1];
            if (coord1==11 || coord2 ==11){System.out.println("Хм... Некорректный ввод!\n");
            }else {

                if (ships[coord1][coord2] == 1) {
                    System.out.println("Бдыщь!!! Вы подбили корабль!");
                    ships[coord1][coord2]= --ships[coord1][coord2];
                    lineSumm=0;
                    for (int i=0;i<x;i++) { lineSumm+=ships[coord1][i];  }
                    //System.out.println(lineSumm + " "+ count);
                    if(lineSumm ==0){System.out.println("\nGood job! Вы уничтожили корабль на этой линии, переходите к следующей! \n");}
                } else {
                    System.out.println("Упс! Вы промахнулись!");
                }
            }
            allSumm=0;
            for (int i=0;i<x;i++){
                for(int j=0;j<x;j++){

                    allSumm+=ships[i][j];
                }
            }
            //System.out.println("сумма массива"+allSumm);
        }

        while (allSumm!=0);
        String result;
        if(count>40 && count<60){
            result = "Невероятно! ";
        } else if (count>=60 && count<80){
            result = " Неплохой результат!";
        } else {
            result = " Вам стоит задуматься о своей стратегии...";
        }
        System.out.println("\n Вы выиграли!" + "\n " + result + " \n Количество ваших ходов: "+ count);

    }
}
