

public class Element<T> {

    private Element<T> rElement;
    private Element<T> lElement;

    private T data;

    public Element(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element<T> getrElement() {
        return rElement;
    }

    public void setrElement(Element<T> rElement) {
        this.rElement = rElement;
    }

    public Element<T> getlElement() {
        return lElement;
    }

    public void setlElement(Element<T> lElement) {
        this.lElement = lElement;
    }
}
