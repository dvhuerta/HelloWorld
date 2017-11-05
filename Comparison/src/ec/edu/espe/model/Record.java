
package ec.edu.espe.model;

public class Record {
    private int currentPurchaseSale;
    private int seedMoney;
    private int simulationDays;
    private int purchaseSalesCount;
    private PurchaseSale[] purchaseSales;

    public int getCurrentPurchaseSale() {
        return currentPurchaseSale;
    }

    public void setCurrentPurchaseSale(int currentPurchaseSale) {
        this.currentPurchaseSale = currentPurchaseSale;
    }

    public int getSeedMoney() {
        return seedMoney;
    }

    public void setSeedMoney(int seedMoney) {
        this.seedMoney = seedMoney;
    }

    public int getSimulationDays() {
        return simulationDays;
    }

    public void setSimulationDays(int simulationDays) {
        this.simulationDays = simulationDays;
    }

    public int getPurchaseSalesCount() {
        return purchaseSalesCount;
    }

    public void setPurchaseSalesCount(int purchaseSalesCount) {
        this.purchaseSalesCount = purchaseSalesCount;
    }

    public PurchaseSale[] getPurchaseSales() {
        return purchaseSales;
    }

    public void setPurchaseSales(PurchaseSale[] purchaseSales) {
        this.purchaseSales = purchaseSales;
    }
}
