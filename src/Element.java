

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

    public Element getrElement() {
        return rElement;
    }

    public void setrElement(Element rElement) {
        this.rElement = rElement;
    }

    public Element getlElement() {
        return lElement;
    }

    public void setlElement(Element lElement) {
        this.lElement = lElement;
    }
}
