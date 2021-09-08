/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.upb.classes;

/**
 *
 * @author santi
 */
public class DoubleCircularListADT implements IListable {
    
    private Node first;
    private Node last;
    private Node current;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    @Override
    public void add(Node node) {
        
        Node current = first;
        
        if (first == null){
            first = node;
            last = node;
            first.setNext(first);
            first.setPrevious(last);
        } else {
            last.setNext(node);
            node.setNext(first);
            node.setPrevious(last);
            last = node;
            first.setPrevious(last);
            
        }
    }
    
    public String print() {

        Node current = first;
        String result = "";

        do{
            result += current.showInformation() + "\n";
            current = current.getNext();
        }while (current != first);

        return result;

    }
}
