package GenericsClass00;

public class Container<T> {
    private T content;

    public void put(T item){
        content = item;
    }

    public T take(){
        T item = content;
        content = null;
        return item;
    }
}

class ContainerTester{
    public static void main(String[] args) {
        Container<Integer> ct = new Container<>();
        ct.put(7);
        ct.take();
        Integer result = ct.take();
        System.out.println(result);
    }
}