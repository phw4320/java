package test06;

public class Area {
	public static void main(String[] args) {
		kids k = new kids();
		parents p = new parents();
		k.parentsmethod();
		k.kidsmethod();
		p.parentsmethod();
	}
}

class parents {
	public void parentsmethod(){
		System.out.println("parents");
	}
}

class kids extends parents {
	public void kidsmethod()
	{
		System.out.println("kids");
	}
}