/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import edu.upb.models.MyException;
import edu.upb.queues.ArrayQueue;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author santi
 */
public class ArrayQueueTest extends BaseQueueTest{
    private static final int CAPACITY = 40;
    
    @Before
    public void makeBoundedQueue() {
        q = new ArrayQueue(CAPACITY);
    }
    
    @Test(expected = MyException.class)
    public void testEnqueueToFullQueue() {
        for (int i = 0; i < CAPACITY; i++) {
            q.enqueue("Element "+i);
        }
        q.enqueue("abc");
    }
    
}
