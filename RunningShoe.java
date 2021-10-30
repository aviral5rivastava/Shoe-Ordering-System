
public class RunningShoe extends Shoe{
	boolean light_sole = false;
	int price = 0;
	
	RunningShoe(String color, int size, boolean light_sole){
		super(color, size);
		this.light_sole = light_sole;
		this.price = super.price + 250;
	}
	
	public void lightSole() {
		if(this.light_sole == true) {
			this.price = this.price + 100;
		}
	}
}
