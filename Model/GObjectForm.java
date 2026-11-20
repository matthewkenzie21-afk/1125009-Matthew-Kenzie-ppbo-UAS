package Model;

public abstract class GObjectForm<T extends GObject> {
    private T value;
    
    public T showInsertFrom() {

    }

    protected abstract String[] getFields() {}
    protected abstract T constructModelFromValues(String label, double[] value){}
    protected abstract double[] extractValuesFromModel(T model) {}
    
}
