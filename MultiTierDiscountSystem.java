public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 1200.00;
        double discountRate = 0.0;
        String tierName = "";

        if (purchaseAmount >= 1000.0) {
            tierName = "Platinum Tier (15% Off)";
            discountRate = 0.15;
        } else if (purchaseAmount >= 500.0) {
            tierName = "Gold Tier (10% Off)";
            discountRate = 0.10;
        } else if (purchaseAmount >= 200.0) {
            tierName = "Silver Tier (5% Off)";
            discountRate = 0.05;
        } else {
            tierName = "Standard Tier (0% Off)";
            discountRate = 0.0;
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountRate);

        System.out.println("Assigned Tier: " + tierName);
        System.out.println("Final Discounted Price: ₱" + finalPrice);
    }
}
