/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import edu.upb.models.IQueue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author santi
 */
public abstract class BaseQueueTest {
    
    protected IQueue q;
    
    @Test
    public void testNewQueueisEmpty(){
        assertTrue(q.isEmpty());
        assertEquals(q.size(), 0);
    }
    
    @Test
    public void testInsertsToEmptyQueue(){
        int numberOfInserts = 6;
        for (int i = 0; i < numberOfInserts; i++){
            q.enqueue("zzz");
        }
        
        assertTrue(!q.isEmpty());
        assertEquals(q.size(), numberOfInserts);
    }
    
    @Test
    public void testEnqueueThenDequeue(){
        String message = "Hello!";
        q.enqueue(message);
        assertEquals(message, q.dequeue());
        
    }
    
    @Test
    public void testEnqueueThenPeek(){
        String message = "Hello!";
        q.enqueue(message);
        int size = q.size();
        assertEquals(q.peek(), message);
        assertEquals(q.size(), size);
    }
}
