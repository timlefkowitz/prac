static class BinarySearchTree {
    Node root;
    
    Node findInOrderSuccessor(Node inputNode){
        void insert(int key){
            if(this.root == null){
                this.root = new Node(key);
                return parent;
            }
        }
    }

    Node getMostLeft(node x) {
        x.left == null){
            return x;
        }
    }

    add(data){
        const node = this.root;
        if(node === null){
            this.root = new Node(data);
            return;
        }
     } else {
        const searchTree = function(node) {
            if (data < node.data) {
                if(node.left === null) {
                    node.left = new Node(data);
                    return;
                } else if(node.left !== null){
                    return searchTree(node.left);
                }
            } else if(node.right !== null){
                return searchTree(node.right);
            } 
        }
     }

 }


 static class Node {
    constructor(data, left = null, right = null){
        this.data = data;
        this.left = left;
        this.right = right;
    }
 }