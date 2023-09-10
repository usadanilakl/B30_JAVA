package day35_Collection.treeStructure;

public class TreePractice {
    public static void main(String[] args) {
        MyTree n = new MyTree();
        n.add(7);
        n.add(4);
        n.add(9);
        n.add(1);
        n.add(6);
        n.add(8);
        n.add(10);
//        n.add(55);
//        n.add(77);
//        n.add(88);

        System.out.println("Preorder");
        n.preOrder(n.root);
        System.out.println();
        System.out.println("Inorder");
        n.inOrder(n.root);
        System.out.println();
        System.out.println("Postorder");
        n.postOrder(n.root);
        System.out.println();
        System.out.println("Level Order");
        n.levelOrder();
        System.out.println();
        n.printLeaf();
        System.out.println("n.countLeaves(n.root) = " + n.countLeaves(n.root));
        System.out.println("n.sumOfLeafs(n.root) = " + n.sumOfLeafs(n.root));

        System.out.println("n.heightRight(n.root) = " + n.heightRight(n.root));
        System.out.println("n.heightLeft(n.root) = " + n.heightLeft(n.root));
        System.out.println("n.height(n.root) = " + n.height(n.root));

    }
}
