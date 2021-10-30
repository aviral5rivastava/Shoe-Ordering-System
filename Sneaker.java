
public class Sneaker extends Shoe{
	boolean retro = false;
	boolean jordans = false;
	int price = 0;
	
	Sneaker(String color, int size, boolean retro, boolean jordans){
		super(color, size);
		this.retro = retro;
		this.jordans = jordans;
		this.price = super.price + 300;
	}
	public void retro() {
		if(this.retro == true) {
			this.price = this.price + 100;
		}
	}
	public void jordans() {
		if(this.jordans == true) {
			this.price = this.price + 150;
		}
	}
}
