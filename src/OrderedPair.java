public class OrderedPair<T> implements Pairable<T>{

    private T first, second;

    public OrderedPair(T first, T second){
        this.first = first;
        this.second = second;
    }
    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public T getSecond() {
        return second;
    }

    @Override
    public void changeOrder() {
        T temp = first;
        first = second;
        second = temp;
    }

    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}
