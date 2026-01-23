import com.example.notification.Notification.EmailNotification;
import com.example.notification.Notification.SMSnotification;
import com.example.notification.Service.NotificationService;


public class Main {
    public static void main(String[] args) {
        NotificationService emailService =
                new NotificationService(new EmailNotification());
        emailService.notifyUser("Welcome Email");

        NotificationService smsService =
                new NotificationService(new SMSnotification());
        smsService.notifyUser("OTP via SMS");
        }
    }
