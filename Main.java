//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String... args){
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    NumeroComplesso C1 = new NumeroComplesso(5,6);
    NumeroComplesso C2 = new NumeroComplesso(9,7);
    NumeroComplesso C3 = new NumeroComplesso(0,0);

    C3 = C1.Somma(C2);
    /*
        In alternativa:
        NumeroComplesso C3 = new NumeroComplesso(C1.Somma(C2));
    */

    System.out.println("Numero 1: "+C1.toString());
    System.out.println("Numero 2: "+C2.toString());
    System.out.println("Numero 3: "+C3.toString());
    }
}
