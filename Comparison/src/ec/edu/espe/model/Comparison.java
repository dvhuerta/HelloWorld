
package ec.edu.espe.model;

public class Comparison {
    private Analyst listOfAnalyst;
    private String[] symbol2;
    private String outputFile;
    private int numberOfAnalyst;

    public Analyst getListOfAnalyst() {
        return listOfAnalyst;
    }

    public void setListOfAnalyst(Analyst listOfAnalyst) {
        this.listOfAnalyst = listOfAnalyst;
    }

    public String[] getSymbol2() {
        return symbol2;
    }

    public void setSymbol2(String[] symbol2) {
        this.symbol2 = symbol2;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public int getNumberOfAnalyst() {
        return numberOfAnalyst;
    }

    public void setNumberOfAnalyst(int numberOfAnalyst) {
        this.numberOfAnalyst = numberOfAnalyst;
    }
}
