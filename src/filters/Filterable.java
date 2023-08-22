package filters;

@FunctionalInterface
public interface Filterable<T> {

    public boolean filter(T o);
}
