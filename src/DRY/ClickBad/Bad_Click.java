package DRY.ClickBad;

// Submit Button with its own on-click implementation
class SubmitButton{
    public void onClick(){
        System.out.println("Clicking Submit...");
    }
}

// Cancel Button with its own on-click implementation
class CancelButton{
    public void onClick(){
        System.out.println("Clicking Cancel...");
    }
}

// Now, here as we can see each class has its own implementation of onClick which kind of seems repeated.
// This violates DRY principle as whenever we add a new button we will need to repeat the onClick implementation for it.

// Moreover, If the button logic was more complex, then it could've led to:
// 1. Increased maintenance
// 2. Inconsistencies
// 3. Errors

public class Bad_Click{
    public static void main(String[] args){
        SubmitButton submit = new SubmitButton();
        CancelButton cancel = new CancelButton();

        // Clicking Buttons
        submit.onClick();
        cancel.onClick();
    }
}