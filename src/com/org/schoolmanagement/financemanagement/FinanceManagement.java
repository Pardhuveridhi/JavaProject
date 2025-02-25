package src.com.org.schoolmanagement.financemanagement;

import java.util.*;

class FinanceManagement {
    private final double schoolTaxRate;
    private final Map<String, Double> feeStructure;
    private final List<String> paymentMethods;
    private final Map<String, Double> scholarships;
    private final Map<String, Double> discounts;

    public FinanceManagement(double schoolTaxRate) {
        this.schoolTaxRate = schoolTaxRate;
        this.feeStructure = new HashMap<>();
        this.paymentMethods = Arrays.asList("Credit Card", "UPI", "Cash");
        this.scholarships = new HashMap<>();
        this.discounts = new HashMap<>();
    }

    public void addFeeStructure(String category, double amount) {
        feeStructure.put(category, amount);
    }

    public void addScholarship(String studentName, double amount) {
        scholarships.put(studentName, amount);
    }

    public void addDiscount(String category, double percentage) {
        discounts.put(category, percentage);
    }

    public double calculateFinalFee(String category, String studentName) {
        double baseFee = feeStructure.getOrDefault(category, 0.0);
        double discount = discounts.getOrDefault(category, 0.0);
        double scholarship = scholarships.getOrDefault(studentName, 0.0);
        
        double discountedFee = baseFee - (baseFee * discount / 100);
        double finalFee = discountedFee - scholarship;
        
        double taxAmount = finalFee * schoolTaxRate / 100;
        return finalFee + taxAmount;
    }

    public String processPayment(String paymentMethod, double amount) {
        if (!paymentMethods.contains(paymentMethod)) {
            return "Invalid payment method!";
        }
        return "Payment of " + amount + " processed via " + paymentMethod;
    }

    public String generateReceipt(String studentName, String category, String paymentMethod) {
        double finalAmount = calculateFinalFee(category, studentName);
        return "Receipt: \nStudent: " + studentName + "\nCategory: " + category +
               "\nFinal Amount: " + finalAmount + "\nPayment Method: " + paymentMethod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter school tax rate: ");
        double taxRate = scanner.nextDouble();
        FinanceManagement finance = new FinanceManagement(taxRate);
        
        System.out.print("Enter category: ");
        String category = scanner.next();
        System.out.print("Enter fee amount: ");
        double feeAmount = scanner.nextDouble();
        finance.addFeeStructure(category, feeAmount);
        
        System.out.print("Enter discount percentage for " + category + ": ");
        double discount = scanner.nextDouble();
        finance.addDiscount(category, discount);
        
        System.out.print("Enter student name: ");
        String studentName = scanner.next();
        System.out.print("Enter scholarship amount for " + studentName + ": ");
        double scholarshipAmount = scanner.nextDouble();
        finance.addScholarship(studentName, scholarshipAmount);
        
        double finalFee = finance.calculateFinalFee(category, studentName);
        System.out.println("Final fee for " + studentName + " in " + category + ": " + finalFee);
        
        System.out.print("Enter payment method (Credit Card/UPI/Cash): ");
        String paymentMethod = scanner.next();
        
        System.out.println(finance.processPayment(paymentMethod, finalFee));
        System.out.println(finance.generateReceipt(studentName, category, paymentMethod));
        
        scanner.close();
    }
}

