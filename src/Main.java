public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.add(100);
        tree.add(50);
        tree.add(25);
        tree.add(200);

        tree.print(tree.getTop());

        final int i = tree.treeHeight(tree.getTop());
        System.out.println("tree height " + i);

    }



}
