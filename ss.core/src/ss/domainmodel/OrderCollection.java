package ss.domainmodel;

import ss.framework.entities.xmlentities.XmlListEntityObject;

public class OrderCollection extends XmlListEntityObject<Order> {

	
	public OrderCollection(){
		super(Order.class, Order.ITEM_ROOT_ELEMENT_NAME);
	}
	
	/**
	 * Adds item to the collection
	 * @param item not null object 
	 */
	public void add( Order item ) {
		super.internalAdd(item);
	}

	/**
	 * Remove item from collection
	 * @param entity
	 */
	public void remove(Order entity) {
		super.internalRemove(entity);
	}
	
	
	/**
	 * @param index from 0 to Count-1  
	 * @return Returns item by index 
	 */
	public Order get(int index) {
		return super.internalGet(index);
	}

	public void removeAll() {
		for(Order ord: this) {
			this.remove(ord);
		}
	}
		
}
