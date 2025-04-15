package codewrought.structure;

/**
 * Stupidly simple linked list item that can store an Object. This class is 
 * package protected and not intended to be used outside of this package
 * @author syong
 */
class SimpleLinkItem<T> {

	private T m_stored;	
	private SimpleLinkItem<T> m_next;
	
	public SimpleLinkItem() {
	}
	
	public SimpleLinkItem(T obj) {
		setObj(obj);
	}
	
	public void setObj(T obj) {
		m_stored = obj;
	}
	
	public T getObj() {
		return m_stored;
	}
	
	SimpleLinkItem<T> getNext() {
		return m_next;
	}
	
	void setNext(SimpleLinkItem<T> next) {
		m_next = next;
	}
	
}
