package Everything;

class InputToNumber {
    private String line1;
    private int line2;

    InputToNumber(String line1, int line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    protected int getLine1() {
        if (line1.equalsIgnoreCase("А")) {
            return 0;
        } else if (line1.equalsIgnoreCase("Б")) {
            return 1;
        } else if (line1.equalsIgnoreCase("В")) {
            return 2;
        } else if (line1.equalsIgnoreCase("Г")) {
            return 3;
        } else if (line1.equalsIgnoreCase("Д")) {
            return 4;
        } else if (line1.equalsIgnoreCase("Е")) {
            return 5;
        } else if (line1.equalsIgnoreCase("Ж")) {
            return 6;
        } else if (line1.equalsIgnoreCase("З")) {
            return 7;
        } else if (line1.equalsIgnoreCase("И")) {
            return 8;
        } else if (line1.equalsIgnoreCase("К")) {
            return 9;
        } else if (line1 == "" || line1 == " ") {
            System.out.println(" Вы ничего не ввели!");
            return 11;
        } else {
            System.out.println("Вы ввели неправильную букву!");
            return 11;
        }
    }

    protected int getLine2() {
        if (line2 > 0 && line2 <= 11) {
            return line2 - 1;
        } else {
            System.out.println("Вы ввели неправильную цифру!");
            return 11;
        }
    }
}