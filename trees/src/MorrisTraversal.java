/**
 * Created by aburagad on 3/13/2016.
 */
public class MorrisTraversal {



    public static void inOrder( Node root ){
        Node node = root;
        while( node != null ){
            if( node.left == null  ){
                System.out.print(node.data + " ");
                node = node.right ;
            }else{

                    // finding the inorder predecessor .
                    Node predecessor = node.left ;
                    while( predecessor.right != null && predecessor.right!= node ){
                        predecessor = predecessor.right;
                    }

                    if(  predecessor .right == null ){
                        predecessor.right = node;
                        node = node.left;

                    }else{
                        predecessor.right = null;
                        System.out.print(node.data + " ");
                        node = node.right;

                    }
            }

        }

    }



    public static void preOrder (Node n){

        Node current = n ;
        while(current != null ){
            //System.out.print(current.data);
            if(current.left == null ){
                System.out.print(current.data+" ");
                current = current.right;
            }else{

                Node pred = current.left ;
                while( pred . right != null && pred.right!= current){
                    pred = pred.right ;
                }
                if( pred.right == null ){
                    pred.right = current ;
                    System.out.print(current.data+ " ");
                    current = current.left;
                }else{
                   pred.right = null ;
                    current = current.right ;
                }

            }

        }



    }


   // post order traversal not possible in Morris Travesal


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = null;
        root = bt.addNode(10, root);
        root = bt.addNode(50, root);
        root = bt.addNode(-10, root);
        root = bt.addNode(7, root);
        root = bt.addNode(9, root);
        root = bt.addNode(-20, root);
        root = bt.addNode(30, root);
        System.out.println(root.data);
        inOrder(root);
        System.out.println();
        preOrder(root);

    }


}
