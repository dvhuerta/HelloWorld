
package ec.edu.espe.model;

public class PurchaseSale {
    private int quantify;
    private int saleFee;
    private int salePrice;
    private int saleDateTime;
    private int purchaseDateTime;
    private int purchasePrice;
    private int purchaseFee;
    private String symbol;
    private Investment[] investment;

    public int getQuantify() {
        return quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    public int getSaleFee() {
        return saleFee;
    }

    public void setSaleFee(int saleFee) {
        this.saleFee = saleFee;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getSaleDateTime() {
        return saleDateTime;
    }

    public void setSaleDateTime(int saleDateTime) {
        this.saleDateTime = saleDateTime;
    }

    public int getPurchaseDateTime() {
        return purchaseDateTime;
    }

    public void setPurchaseDateTime(int purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getPurchaseFee() {
        return purchaseFee;
    }

    public void setPurchaseFee(int purchaseFee) {
        this.purchaseFee = purchaseFee;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Investment[] getInvestment() {
        return investment;
    }

    public void setInvestment(Investment[] investment) {
        this.investment = investment;
    }
}
