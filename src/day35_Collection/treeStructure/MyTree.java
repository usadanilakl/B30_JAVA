package day35_Collection.treeStructure;

import day35_Collection.customQueue.QList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public TNode root;
    private int size;

    public boolean isEmpty(){
        if(root == null) return true;
        return false;
    }

    public void add(int data){
        TNode d = new TNode();
        d.data = data;
        if(root == null){
            root = d;
            return;
        }
        TNode c = root;
        while(true){
            if(c.data > data){
                if(c.left == null){
                    c.left = d;
                    break;
                }
                c =c.left;
            }else{
                if(c.right == null){
                    c.right = d;
                    break;
                }
                c = c.right;
            }

        }
    }
    public void preOrder(TNode root){
        if(root == null) return;
        System.out.print(root.data);
        System.out.print(", ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + ", ");
        inOrder(root.right);




    }
    public void postOrder(TNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + ", ");
    }
    public void levelOrder(){
        if(root == null) return;
        Queue<TNode> n = new LinkedList<>();
        n.add(root);
        while (!n.isEmpty()){
            if(n.peek().left != null)n.add(n.peek().left);
            if(n.peek().right != null)n.add(n.peek().right);
            System.out.print(n.poll().data + ", ");

        }
    }
    public boolean find(int e){
        TNode c = root;
        while(c!=null){
            if(e<c.data){
                c = c.left;
            }else if(e>c.data){
                c = c.right;
            }else return true;
        }
        return false;
    }
    public boolean leaf(TNode c){
        if(c == null) return false;
        if(c.left==null && c.right==null) return true;
        return false;
    }
    public void printLeaf(){
        Deque<TNode> q = new LinkedList<>();
        q.push(root);
        while (!q.isEmpty()){
            TNode c = q.pop();
            if(c.left!=null) q.push(c.left);
            if(c.right!=null) q.push(c.right);
            if(leaf(c)) System.out.println(c.data);
        }

    }
    public int countLeaves(TNode root){
        if(root==null)return 0;
        if(leaf(root)) return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }
    public int sumOfLeafs(TNode root){
        if(root==null)return 0;
        //if(!leaf(root)) return 0;
        if(leaf(root)) return root.data;
        return sumOfLeafs(root.left)+sumOfLeafs(root.right);
    }
    public int heightLeft(TNode root){
        if(root==null)return -1;
        if(leaf(root))return 1;
        return 1+heightLeft(root.left);

    }
    public int heightRight(TNode root){
        if(root==null)  return -1;
        if(leaf(root)) return 0;
        return 1+heightRight(root.right);
    }
    public int height (TNode root){
        if(root==null)return -1;
        if(leaf(root))return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
}
