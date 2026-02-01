package Technical;
import java.util.*;

public class OTPSystem {
    public static int generateotp(){
        return new Random().nextInt(9999) + 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int otp = generateotp();
        long timestamp = System.currentTimeMillis();
        int attempts = 0;

        System.out.println("Generated OTP :" + otp);

        while(attempts < 3){
            System.out.print("Enter OTP :");
            int entered = sc.nextInt();



            long now = System.currentTimeMillis();

            if((now-timestamp) > 30000){
                System.out.println("OTP has been Expried !");
                System.out.println("DO you want generate again (yes/no)");
                String choice = sc.next();

                if(choice.equalsIgnoreCase("yes")){
                    otp = generateotp();
                    timestamp = System.currentTimeMillis();
                    System.out.println("Updated OTP :" + otp);
                    attempts = 0;
                    continue;
                }else{
                    System.out.println("Verification failed due to TimeOut.");
                    return;
                }

            }
            if(entered == otp){
                System.out.println("Verification completed");
                return;
            }else{
                attempts++;
                System.out.println("Invalid OTP,try again");
            }
        }
        System.out.println("Maximum limits has been Reached. Verification Failed.");
    }
}
