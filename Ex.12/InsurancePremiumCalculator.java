import java.util.Scanner;

class Insurance {
    private double coverage;
    private int duration;

    Insurance(double coverage, int duration) {
        this.coverage = coverage;
        this.duration = duration;
    }

    public double getCoverage() {
        return coverage;
    }

    public int getDuration() {
        return duration;
    }

    public double calculatePremium() {
        return 0;
    }

    public void display() {
        System.out.println("Coverage Amount: Rs. " + coverage);
        System.out.println("Duration: " + duration + " years");
        double premium = calculatePremium();
        System.out.println("Annual Premium: Rs. " + premium);
        System.out.println("Total Premium: Rs. " + (premium * duration));
    }
}

class LifeInsurance extends Insurance {
    LifeInsurance(double coverage, int duration) {
        super(coverage, duration);
    }

    @Override
    public double calculatePremium() {
        return getCoverage() * 2 / 100;
    }
}

class HealthInsurance extends Insurance {
    HealthInsurance(double coverage, int duration) {
        super(coverage, duration);
    }

    @Override
    public double calculatePremium() {
        return getCoverage() * 3 / 100;
    }
}

public class InsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1. Life Insurance");
            System.out.println("2. Health Insurance");
            System.out.print("Enter policy choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter coverage amount: ");
            double coverage = sc.nextDouble();

            System.out.print("Enter duration in years: ");
            int duration = sc.nextInt();

            if (coverage <= 0 || duration <= 0) {
                throw new IllegalArgumentException(
                        "Coverage and duration must be positive.");
            }

            Insurance policy;

            if (choice == 1) {
                policy = new LifeInsurance(coverage, duration);
                System.out.println("\nPolicy: Life Insurance");
            } else if (choice == 2) {
                policy = new HealthInsurance(coverage, duration);
                System.out.println("\nPolicy: Health Insurance");
            } else {
                throw new IllegalArgumentException("Invalid policy choice.");
            }

            policy.display();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
