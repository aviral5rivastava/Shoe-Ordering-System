
public class SportShoe extends Shoe {
	boolean hard_sole = false;
	boolean designed = false;
	int price = 0;
	
	SportShoe(String color, int size, boolean hard_sole, boolean designed){
		super(color,size);
		this.hard_sole = hard_sole;
		this.designed = designed;
		this.price = super.price + 200;
	}
	
	public void hardSole() {
		if(this.hard_sole == true) {
			this.price = this.price + 75;
		}	
	}
	
	public void designed() {
		if(this.designed == true) {
			this.price = this.price + 120;
		}
	}
	
}
