package DependencyInversionPrinciple.GoodCode;

interface NotificationService{
    void sendNotification();
}

class EmailNotifier implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Sending Email");
    }
}

class SMSNotifier implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Sending SMS");
    }
}


class OrderService{
    private final NotificationService notificationService;

    // Constructor injection of dependencies or formally dependency injection
    // solves the problem of mocking which eventually makes testing convenient
    OrderService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void placeOrder(){
        // first step: send notification
        notificationService.sendNotification();
    }
}

// Therefore, the above approach demonstrates dependency injection(based on our needs) which helps in:
// 1. Flexibility increases as we can directly pass the dependencies in the constuctor.
// 2. Testability increases which is discussed above
// 3. Maintainability increases as we don't need to change the class for any other future requirement for OrderService 
// say to implement Mobile Notification.
// 4. Scalability increases then we can just implement different set of classes and club them, lets say for a different notification service.
