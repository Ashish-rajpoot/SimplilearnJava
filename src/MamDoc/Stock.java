package MamDoc;

public class Stock {
    public float stockRate;

    public float getStockRate() {
        return stockRate;
    }

    public void setStockRate(float stockRate) {
        this.stockRate = stockRate;
    }

    public String checkRate(float rate) throws StockHighException, StockLowException {
        int percentage = (int) (rate / stockRate * 100);
        if (percentage < 80) {
            throw new StockLowException("Under Loss");
        } else if (percentage > 80) {
            throw new StockHighException("Under Profit");
        }
        return "Hope to raise";
    }
}
