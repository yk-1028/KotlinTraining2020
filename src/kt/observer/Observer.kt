package kt.observer

public interface Observer {
    public abstract fun update(generator: NumberGenerator)
}