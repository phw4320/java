package Test18;

public class Rabbit {
	public int rank;

	public static void init(Rabbit[] r) {
		for(int i=0; i<r.length; i++) {
			r[i] = new Rabbit();
			int rank = (int)(Math.random()*10)+1;
			r[i].rank = rank;
			
			for (int k = 0; k < r.length; k++) {
				for (int j = k+1; j < r.length; j++) {
					if (r[k].rank == r[j].rank) {
						k--;
					}
				}
			}
			
		}
		
	}
	
	public static void ascending(Rabbit[] r) {
		for(int i=0; i<r.length; i++) {
			for(int j=i+1; j<r.length; j++) {
				if (r[i].rank > r[j].rank) {
					int tmp = r[i].rank;
					r[i].rank = r[j].rank;
					r[j].rank = tmp;
				}
			}
		}
	}
	
	public static void descending(Rabbit[] r) {
		for(int i=0; i<r.length; i++) {
			for(int j=i+1; j<r.length; j++) {
				if (r[i].rank < r[j].rank) {
					int tmp = r[i].rank;
					r[i].rank = r[j].rank;
					r[j].rank = tmp;
				}
			}
		}
	}
	
	public static void print(Rabbit[] r) {
		for(int i=0; i<r.length; i++) {
			System.out.print(r[i].rank+" ");
			}
	}
	
	public static void main(String[] args) {
		
		Rabbit[] r = new Rabbit[10];
		
		init(r);
		
		ascending(r);
		System.out.println("오름차순");
		print(r);
		descending(r);
		System.out.println("\n내림차순");
		print(r);
		
	}
}

