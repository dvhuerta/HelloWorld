
package ec.edu.espe.model;

public class Investment {
    private float quantify;
    private float purchasePrice;
    private double purchaseTransferenceFee;
    private double saleTransferenceFee;
    private Investor[] investor;

    public float getQuantify() {
        return quantify;
    }

    public void setQuantify(float quantify) {
        this.quantify = quantify;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getPurchaseTransferenceFee() {
        return purchaseTransferenceFee;
    }

    public void setPurchaseTransferenceFee(double purchaseTransferenceFee) {
        this.purchaseTransferenceFee = purchaseTransferenceFee;
    }

    public double getSaleTransferenceFee() {
        return saleTransferenceFee;
    }

    public void setSaleTransferenceFee(double saleTransferenceFee) {
        this.saleTransferenceFee = saleTransferenceFee;
    }

    public Investor[] getInvestor() {
        return investor;
    }

    public void setInvestor(Investor[] investor) {
        this.investor = investor;
    }
}
