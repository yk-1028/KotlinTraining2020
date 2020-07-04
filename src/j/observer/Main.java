package j.observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}

/**
 * 出力結果：
 DigitObserver:29
 GraphObserver:*****************************
 DigitObserver:42
 GraphObserver:******************************************
 DigitObserver:2
 GraphObserver:**
 DigitObserver:18
 GraphObserver:******************
 DigitObserver:25
 GraphObserver:*************************
 DigitObserver:43
 GraphObserver:*******************************************
 DigitObserver:38
 GraphObserver:**************************************
 DigitObserver:25
 GraphObserver:*************************
 DigitObserver:3
 GraphObserver:***
 DigitObserver:25
 GraphObserver:*************************
 DigitObserver:46
 GraphObserver:**********************************************
 DigitObserver:31
 GraphObserver:*******************************
 DigitObserver:48
 GraphObserver:************************************************
 DigitObserver:25
 GraphObserver:*************************
 DigitObserver:5
 GraphObserver:*****
 DigitObserver:13
 GraphObserver:*************
 DigitObserver:38
 GraphObserver:**************************************
 DigitObserver:47
 GraphObserver:***********************************************
 DigitObserver:38
 GraphObserver:**************************************
 DigitObserver:42
 GraphObserver:******************************************

 Process finished with exit code 0
 */