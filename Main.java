//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String... args){
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    NumeroComplesso C1 = new NumeroComplesso(5,6);
    NumeroComplesso C2 = new NumeroComplesso(9,7);
    NumeroComplesso C3 = new NumeroComplesso(0,0);

    C3.Somma(C1,C2);

    System.out.println("Numero 1: "+C1.getR()+" ,"+C1.getI());
    System.out.println("Numero 2: "+C2.getR()+" ,"+C2.getI());
    System.out.println("Numero 3: "+C3.getR()+" ,"+C3.getI());
    }
}
