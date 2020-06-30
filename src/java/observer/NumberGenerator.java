package java.observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();        // Observer������ێ�
    public void addObserver(Observer observer) {    // Observer��ǉ�
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) { // Observer���폜
        observers.remove(observer);
    }
    public void notifyObservers() {               // Observer�֒ʒm
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();                // �����擾����
    public abstract void execute();                 // ���𐶐�����
}
