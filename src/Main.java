public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.add(100);
        tree.add(50);
        tree.add(25);
        tree.add(200);

        tree.print(tree.getTop());



    }

    public static void print(Element<Integer> e){
        System.out.println(e.getData());
        if (e.getlElement() != null)
            System.out.print("/");

        if (e.getrElement()!=null)
            System.out.print("\\");

        System.out.println();
    }


}
