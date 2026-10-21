public class AtmTransactionAuthorizer {
    public static void main(String[] args) {
        String username = "JELIANNEARNANTE";
        int pin = 1234;
        double accountBalance = 5000.0;
        double withdrawalAmount = 600.0;

        String validUser = "JELIANNEARNANTE";
        int validPin = 1234;

        if (username.equals(validUser)) {
            if (pin == validPin) {
                
                String tier = "";
                if (accountBalance >= 10000.0) {
                    tier = "Platinum";
                } else if (accountBalance >= 5000.0) {
                    tier = "Gold";
                } else if (accountBalance >= 1000.0) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                double feePercentage = 0.0;
                switch (tier) {
                    case "Platinum":
                        feePercentage = 0.01;
                        break;
                    case "Gold":
                        feePercentage = 0.02;
                        break;
                    case "Silver":
                        feePercentage = 0.03;
                        break;
                    case "Bronze":
                    default:
                        feePercentage = 0.05;
                        break;
                }

                double transactionFee = withdrawalAmount * feePercentage;
                double totalDeduction = withdrawalAmount + transactionFee;

                double dailyLimit = 1000.0;
                if (tier.equals("Gold")) {
                    dailyLimit = 3000.0;
                } else if (tier.equals("Platinum")) {
                    dailyLimit = 10000.0;
                }

                if (totalDeduction <= accountBalance) {
                    if (withdrawalAmount <= dailyLimit) {
                        System.out.println("TRANSACTION APPROVED.");
                        System.out.println("Tier: " + tier + " | Fee: ₱" + transactionFee);
                        System.out.println("New Balance: ₱" + (accountBalance - totalDeduction));
                    } else {
                        System.out.println("DENIED: Withdrawal exceeds your " + tier + " tier daily limit of ₱" + dailyLimit);
                    }
                } else {
                    System.out.println("DENIED: Insufficient balance to cover withdrawal plus fees.");
                }

            } else {
                System.out.println("DENIED: Invalid 4-digit PIN.");
            }
        } else {
            System.out.println("DENIED: Invalid username.");
        }
    }
}
