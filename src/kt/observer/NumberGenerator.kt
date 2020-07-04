package kt.observer

public abstract class NumberGenerator {
    private val observers = arrayListOf<Observer>()
    public fun addObserver(observer: Observer) { observers.add(observer) }
    public fun deleteObserver(observer: Observer) { observers.remove(observer) }
    public fun notifyObservers() {
        for(observer in observers) {
            observer.update(this)
        }
    }
    public abstract fun getNumber(): Int
    public abstract fun execute()
}