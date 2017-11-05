
package ec.edu.espe.model;

public class Investor {
    private int saleTime;
    private int purchaseTime;
    private int quantifyShare;
    private double payFee;
    private String broker;

    public int getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(int saleTime) {
        this.saleTime = saleTime;
    }

    public int getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(int purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public int getQuantifyShare() {
        return quantifyShare;
    }

    public void setQuantifyShare(int quantifyShare) {
        this.quantifyShare = quantifyShare;
    }

    public double getPayFee() {
        return payFee;
    }

    public void setPayFee(double payFee) {
        this.payFee = payFee;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    } 
}
