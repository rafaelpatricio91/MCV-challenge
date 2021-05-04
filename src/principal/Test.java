package principal;

import java.util.ArrayList;
import java.util.List;

import entity.Node;
import service.ChainValidator;

public class Test {
	public static void main(String[] args) {
		ChainValidator cv = new ChainValidator();
		List<Node> nodes = returnNodesList();
		
		cv.validate(nodes);
	}
	
	private static List<Node> returnNodesList() {
		List<Node> nodes = new ArrayList<>();
		
		//TRUE
//		nodes.add(Node.createIntegerNode(36));
//		nodes.add(Node.createIntegerNode(6));
//		nodes.add(Node.createIntegerNode(24));
//		nodes.add(Node.createIntegerNode(4));
//		nodes.add(Node.createIntegerNode(47));
//		nodes.add(Node.createIntegerNode(7));
//		nodes.add(Node.createIntegerNode(2));
//		nodes.add(Node.createIntegerNode(3));
//		nodes.add(Node.createIntegerNode(27));
		
		//FALSE
//		nodes.add(Node.createIntegerNode(35));
//		nodes.add(Node.createIntegerNode(5));
//		nodes.add(Node.createIntegerNode(65));
//		nodes.add(Node.createIntegerNode(6));
//		nodes.add(Node.createIntegerNode(24));
//		nodes.add(Node.createIntegerNode(4));
		
		//TRUE
//		nodes.add(Node.createLetterNode("p"));
//		nodes.add(Node.createLetterNode("aba"));
//		nodes.add(Node.createLetterNode("a"));
//		nodes.add(Node.createLetterNode("b"));
//		nodes.add(Node.createLetterNode("perso"));
//		nodes.add(Node.createLetterNode("o"));
//		nodes.add(Node.createLetterNode("r"));
//		nodes.add(Node.createLetterNode("e"));
//		nodes.add(Node.createLetterNode("s"));
		
		//TRUE
//		nodes.add(Node.createLetterNode("p"));
//		nodes.add(Node.createLetterNode("r"));
//		nodes.add(Node.createLetterNode("y"));
//		nodes.add(Node.createLetterNode("a"));
//		
//		//TRUE
//		nodes.add(Node.createLetterNode("p"));
//		nodes.add(Node.createLetterNode("r"));
//		nodes.add(Node.createIntegerNode(7));
//		nodes.add(Node.createLetterNode("a"));
		
		return nodes;
	}
}
