import java.util.ArrayList;

class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
	}
}

public class ListDemo{
	
	public ArrayList<Integer> init(ListNode listnode){
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode node = listnode;

		while(node != null){
			list.add(new Integer(node.val));
			node=node.next;
		}
		Integer b;
		for(int i=0;i<(list.size())/2;i++){
			b = list.get(i);
			list.set(i,list.size()-1-i);
			list.set(list.size()-1-i,b);
		}
		return list;
	}

	public static void main(String[] args){
		ListNode node = new ListNode(0);
		ListNode pNew = node;
		for(int i=0;i<5;i++){
			pNew.next = new ListNode(i+1);
			pNew = pNew.next;
		}
		
		ArrayList<Integer> list = new ListDemo().init(node);

		for(int j=0;j<list.size();j++){
			System.out.print(list.get(j)+" ");
		}
	}
}