
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	
	public Cart(){};
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("The disc have been added");
		}else {
			System.out.println("The cart is almost full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean founded = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].equals(disc)) {
				founded = true;
				itemsOrdered = null;
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
			}
		}
		qtyOrdered--;
		System.out.println("The disc have been deleted");
		if (!founded) {
			System.out.println("The disc was not found in the cart");
		}
	}
	
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			cost += getItemsOrdered()[i].getCost();
		}
		return cost;
	}

	public DigitalVideoDisc[] getItemsOrdered() {
		return itemsOrdered;
	}
	
}
