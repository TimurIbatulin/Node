public class Node1 {
   Node head;
   private static class Node{
      Node next;
      int value;
   }
   public void revert(Node currentNode, Node previouseNode){
      if (currentNode.next == null){
         head = currentNode;
      }else {
         revert(currentNode.next, currentNode);
      }
      currentNode.next = previouseNode;
   }
}
