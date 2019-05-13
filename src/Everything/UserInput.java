package Everything;

import java.io.*;

class UserInput {
    UserInput()  {
    }

    protected static int[] userInputs()  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите букву от А до К");
        String letter = reader.readLine();
        System.out.println("Введите число от 1 до 10");
        int number = Integer.parseInt(reader.readLine());
        InputToNumber user = new InputToNumber(letter, number);
        int[] userinput = {user.getLine1(), user.getLine2()};
        return userinput;}
}

