import java.util.Scanner;

public class ConditionalInstructions {
    public static void conditionalInstructions(){
        boolean flag = true;
        int number = 0;
        String text = "example";

        if(number > 0 && flag){
            System.out.println("Number >= 0 and flag is true");
        } else if (number != 0 || !flag){
            System.out.println("Number not equals 0 and flag is false");
        } else if (text.equals("example")){
            System.out.println("object text equals example");
        }else {
            System.out.println("another option");
        }
    }
    public static void switchIntruction(){
        // int, char, enum
        char key = '2';
        switch(key){
            case '0':
                System.out.println("In case 0");
                break;
            case '1':
                System.out.println("In case 1");
                break;
            case '2':
            case '3':
                System.out.println("In case 2 or 3");
                break;
            default:
                System.out.println("In default");
                break;
        }
    }
    public static void forLoop(){
        // for -> wykorzystujemy do zadań w których jest znana ilość iteracji
        //for (warunek początkowy; warunek wykonania pętli; krok )
        for (int i = 0; i < 10; i++){
            if(i == 3){
                System.out.println("Pominięcie iteracji");
                continue;   // pominięcie danej iteracji
            }
            System.out.println("Jestem w pętli: " + i + "-ty krok");
            if(i == 5){
                System.out.println("Przerwanie!");
                break;      // wyjście z pętli
            }
        }
    }
    public static void whileLoop(){
        // while -> wykorzystujemy do zadań w których nie jest znana ilość iteracji
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Co chaesz zrobić: \n1 - zadanie 1\n2 - zadanie 2\nQ - wyjście");
            String decision = scanner.nextLine();
            if (decision.equals("1")){
                System.out.println("Zadanie 1");
            } else if (decision.equals("2")){
                System.out.println("Zadanie 2");
            } else if (decision.toUpperCase().equals("Q")){
                System.out.println("Wyjście");
                break;
            } else {
                System.out.println("Błędny wybór");
            }
        }
    }

    public static void main(String[] args) {
//        conditionalInstructions();
//        switchIntruction();
//        forLoop();;
        whileLoop();
    }
}
