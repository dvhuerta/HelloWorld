package ec.edu.espe.model;

public class Analyst {
    private String name;
    private String symbolAnalyst;
    private Record record;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbolAnalyst() {
        return symbolAnalyst;
    }

    public void setSymbolAnalyst(String symbolAnalyst) {
        this.symbolAnalyst = symbolAnalyst;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
