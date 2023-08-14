package infor.pkg.aug10;


class Abs{
	interface newMsg{
		void Msg();
	}
}

public class NestedInterface {
	
	
	public void Msg() {
		System.out.println("Message from the nested Class Implementation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			NestedInterface ChkMsg = new NestedInterface();
			
			ChkMsg.Msg();
	}

}
