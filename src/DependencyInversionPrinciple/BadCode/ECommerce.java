package DependencyInversionPrinciple.BadCode;

class EmailNotifier{
    public void sendEmail(){
        // implementation to send email
    }
}
// The problems associated with this sort of implementation are:
// 1. There is a direct dependency on concrete implementation i.e. EmailNotifier class for sending emails.
// 2. Tight Coupling: If if the future, the business logic changes to send sms notification insted of email we need to change the 
// entire class from email_notifier to sms notifier
// 3. Hard to test: we cannot pass any mocks as constructor doesn't require any arguments so,
// constructor will create its own classes to mock individual things rather than passing it from the test itself.
// 4. Hard to do code changes: similar to point 2
// 5. Difficulty in implementing different notification strategies.
class OrderService{
    private EmailNotifier emailNotifier;
    OrderService(){
        emailNotifier = new EmailNotifier();
    }

    public void placeOrder(){
        // first step: send notification
        emailNotifier.sendEmail();
    }
}

