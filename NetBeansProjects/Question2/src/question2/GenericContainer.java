package question2;

public class GenericContainer<T> {

    private T data;

    public GenericContainer(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {

        GenericContainer<Integer> intContainer = new GenericContainer<>(42);
        System.out.println("Integer data: " + intContainer.getData());

        GenericContainer<String> stringContainer = new GenericContainer<>("Hello");
        System.out.println("String data: " + stringContainer.getData());
    }
}
