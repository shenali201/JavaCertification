package chapter6;

public class PhoneBill {

    private int billId;
    private double billBaseCost;
    private int billMinutes;
    private int billMinutesUsed;

    public PhoneBill(){
        billId = 0;
        billBaseCost = 79.99;
        billMinutes = 800;
        billMinutesUsed = 800;
    }
    public PhoneBill(int phoneBillId){
        this.billId = phoneBillId;
        billBaseCost = 79.99;
        billMinutes = 800;
        billMinutesUsed = 800;
    }

public PhoneBill(int phoneBillId,double phoneBillCost,int phoneBillMins,int phoneBillMinsUsed){
        this.billId = phoneBillId;
        this.billBaseCost = phoneBillCost;
        this.billMinutes = phoneBillMins;
        this.billMinutesUsed = phoneBillMinsUsed;
    }


    public int getPhonebillId(){
        return billId;
    }

    public void setPhonebillId(int phonebillId){
        this.billId=phonebillId;
    }

    public double getPhonebillCost(){
        return billBaseCost;
    }

    public void setPhonebillCost(double phonebillCost){
        this.billBaseCost=phonebillCost;
    }

    public int getPhonebillMins(){
        return billMinutes;
    }

    public void setPhonebillMins(int phonebillMins){
        this.billMinutes=phonebillMins;

    }

    public int getBillMinutesUsed() {
        return billMinutesUsed;
    }

    public void setBillMinutesUsed(int billMinutesUsed) {
        this.billMinutesUsed = billMinutesUsed;
    }

    public double calculateOverage(){
        if (billMinutesUsed <= billMinutes){
            return 0;
        } else{
            double chargePerMin = 0.25;
            double totalOverage =  (billMinutesUsed - billMinutes);
            return chargePerMin * totalOverage;
        }
    }
    public double calculateTax(){
        double tax = 0.15;
        return tax * (billBaseCost + calculateOverage());
    }
    public double calculateTotal(){
        return billBaseCost + calculateOverage() + calculateTax();
    }
    public void printBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("ID: #"+ billId );
        System.out.println("Base Cost: $"+ billBaseCost );
        System.out.println("Overage: $"+ calculateOverage());
        System.out.println("Tax: $"+ calculateTax());
        System.out.println("Total: $"+calculateTotal());
    }
}
