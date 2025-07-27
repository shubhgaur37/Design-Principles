package DRY.ClickGood;

// Base Class
abstract class Button{
   abstract void onClick();
}
// Subclass implementing specific behavior
class Submit extends Button{
    @Override
    public void onClick(){
        System.out.println("Clicking Submit....");
    }
}

class Cancel extends Button{
    @Override
    public void onClick(){
        System.out.println("Clicking Cancel....");
    }
}

public class Good_Click {
    public static void main(String[] args) {
        Button submit = new Submit();
        Button cancel = new Cancel();

        // Clicking
        submit.onClick();
        cancel.onClick();
    }
}
