public class Tree {

    private Element<Integer> top;

    public Tree() {
    }

    public Element<Integer> getTop() {
        return top;
    }

    public void setTop(Element<Integer> top) {
        this.top = top;
    }

    public void add(Integer i) {
        Element<Integer> newElement = new Element(i);
        if (top == null) {
            top = newElement;
        } else {

            Element<Integer> focus = top;
            Element<Integer> parent;

            while (true) {
                parent = focus;
                if (i.equals(focus.getData())) {
                    return;
                }
                if (i.compareTo(focus.getData()) < 0) {
                    focus = focus.getlElement();
                    if (focus == null) {
                        parent.setlElement(newElement);
                        return;
                    }
                } else {
                    focus = focus.getrElement();
                    if (focus == null) {
                        parent.setrElement(newElement);
                        return;
                    }
                }
            }
        }
    }

    public void print(Element focus) {
        if (focus != null) {
            print(focus.getlElement());
            System.out.println(focus.getData());
            print(focus.getrElement());
        }
    }
    
    public Element<Integer> find(Element<Integer> e) {
      return findr(e, getTop());
    }
    
    private Element<Integer> findr(Element<Integer> elementToFind, Element<Integer> top) {
      if(top == null) return null;
      if(top.getData().equals(elementToFind.getData())) return top;
      if(elementToFind.getData().compareTo(top.getData()) < 0)
        return findr(elementToFind, top.getlElement());
      else
        return findr(elementToFind, top.getrElement());
    }
    
    
    public int treeHeight(Element focus) {
        if (focus == null) return 0;

        final int i = treeHeight(focus.getrElement());
        final int q = treeHeight(focus.getlElement());

        return 1 + Math.max(i, q);

    }
}
