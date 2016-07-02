
public class HarryPotter {
	private int[] list = new int[5];
	
	public void addBooks(int number, int volume){
		list[volume - 1] = number;
	}
	
	private int getDifferentBooks(){
		int voulume_kinds = 0;
		for(int i = 0; i < 5; i++){
			if(list[i] != 0){
				voulume_kinds++;
				list[i]--;
			}
		}
		return voulume_kinds;
	}
	
	
	public float getPrice(){
		float price = 0;
		int kinds = getDifferentBooks();
		
		while(kinds != 0){
			switch (kinds) {
			//case 0:
				//price = 0;
				//break;
			case 1:
				price += 8;
				break;
			case 2:
				price += (float) 15.2;
				break;
			case 3:
				price += (float) (21.6);;
				break;
			case 4:
				price += (float) (25.6);;
				break;
			case 5:
				price += (float) (30);
				break;
			}
			kinds = getDifferentBooks();
		}
		return price;
	}
}
