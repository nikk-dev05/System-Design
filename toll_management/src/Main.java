import com.example.factory.paymentFactory;
import com.example.factory.vehicleFactory;
import com.example.model.Receipt;
import com.example.payments.Payments;
import com.example.service.toll_Service;
import com.example.vehicles.Vehicle;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = vehicleFactory.createVehicle("BIKE");
        Payments payment = paymentFactory.createPayment("FAST_TAG");

        toll_Service Service = new toll_Service();
        Receipt receipt = Service.processToll(vehicle, payment);

        System.out.println("Toll Paid Successfully");
        System.out.println("Vehicle: " + receipt.getVehicleType());
        System.out.println("Payment: " + receipt.getPaymentType());
        System.out.println("Amount: " + receipt.getAmount());
        System.out.println("Time: " + receipt.getTimestamp());
    }
    }
