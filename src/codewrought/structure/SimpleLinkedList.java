package codewrought.structure;


/**
 * This is a simple linked list.
 * Each LinkedItem "points" to the next one in the list. The last item points at null.
 * @author syong
 */
public class SimpleLinkedList<T> {

	private SimpleLinkItem<T> m_head;
	private SimpleLinkItem<T> m_tail;
	private int m_count = 0;

	public SimpleLinkedList() {
	}
	
	public SimpleLinkedList(T[] objects) {
		if (objects != null) {
			for (T obj: objects) {
				addTail(obj);
			}
		}
	
	}
	
	public int getCount() {
		return m_count;
	}

	public boolean isEmpty() {
		return getCount() <= 0;
	}
	
	
	public SimpleLinkItem<T> getHead() {
		return m_head;
	}
	
	private void setHead(SimpleLinkItem<T> head) {
		m_head = head;
	}
	
	
	public int addHead(T obj) {
		SimpleLinkItem<T> item = new SimpleLinkItem<T>(obj);
		if (isEmpty()) {
			setHead(item);
			setTail(item);
		} else {
			SimpleLinkItem<T> previousHead = getHead();
			item.setNext(previousHead);
			setHead(item);
		}
		
		return ++m_count;
	}
	
	public T removeHead() {
		if (!isEmpty()) {
			SimpleLinkItem<T> head = getHead();
			SimpleLinkItem<T> tail = getTail();
			if (head == tail) {
				// this is the only item in the list, so null everything out 
				// and return the last item.
				setTail(null);
				setHead(null);
			} else {				
				setHead(head.getNext()); // the new head is the next item in the list				
			}
			
			// the previous head is no longer pointing to the next item
			head.setNext(null); 
			m_count--;
			return head.getObj();
		}
		return null; // this only gets here if the list is empty.
	
	}
	
	private SimpleLinkItem<T> getTail() {
		return m_tail;
	}
	
	private void setTail(SimpleLinkItem<T> last) {
		m_tail = last;
	}
	
	
	public int addTail(T obj) {
		SimpleLinkItem<T> item = new SimpleLinkItem<T>(obj);
		if (isEmpty()) {
			setHead(item);
			setTail(item);
		} else {
			SimpleLinkItem<T> previousTail = getTail();
			previousTail.setNext(item);
			setTail(item);
		}
		return ++m_count;
	}
	
	public T removeTail() {
		if (!isEmpty()) {
			SimpleLinkItem<T> head = getHead();
			SimpleLinkItem<T> tail = getTail();
			if (head == tail) {
				// this is the only item in the list, so null everything out 
				// and return the last item.
				setTail(null);
				setHead(null);
			} else {
				// loop through until finding the second to last item and
				// make that the new tail
				SimpleLinkItem<T> current = head;
				while (current.getNext() != tail) {
					current = current.getNext();
				}
				
				setTail(current); // set the second to last item to be the tail				
			}
			m_count--;
			return tail.getObj();
		}
		return null; // this only gets here if the list is empty.
	}
	
	/**
	 * Convert the contents of this linked list into an array of the stored objects
	 * @return Object list containing the contents of this linked list
	 */
	public Object[] walkList() {
		if (isEmpty())
			return null;
		
		Object[] objects = new Object[getCount()];
		int i = 0;
		
		SimpleLinkItem<T> current = getHead();
		
		// current is null when there are no more LinkedItem in the list
		while (current != null) {
			objects[i++] = current.getObj();
			current = current.getNext();
		}
		
		return objects;
	}
	
	
}
