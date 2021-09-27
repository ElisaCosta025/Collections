import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.TreeSet;

class Convertor{
	private ArrayList<String> MyCollection = new ArrayList<String>();

	public String Convert(){
		// Adicionar itens a ArrayList
		MyCollection.add("Programacao");
		MyCollection.add("Orientada");
		MyCollection.add("Objetos");
		System.out.println(MyCollection.toString());
		// ArrayList to HashSet
		HashSet<String> set = new HashSet<>(MyCollection);
		System.out.println(set.toString());
		// HashSet to PriorityQueue
		PriorityQueue<String> Q = new PriorityQueue<>(set);
		System.out.println(Q.toString());
		// PriorityQueue to ArrayDeque
		ArrayDeque<String> ADQ = new ArrayDeque<>(Q);
		System.out.println(ADQ.toString());
		// ArrayDeque to TreeSet
		TreeSet<String> TS = new TreeSet<>(ADQ);
		System.out.println(TS.toString());
		return TS.toString();
	}
}
