package factory;

import java.util.ArrayList;
import java.util.List;

import entity.Node;

public final class TestCasesListFactory {
	
	static List<Node> nodes;
	
	public static final List<Node> createValidNumberChain() {
		nodes = new ArrayList<>();
		nodes.add(Node.createIntegerNode(36));
		nodes.add(Node.createIntegerNode(6));
		nodes.add(Node.createIntegerNode(24));
		nodes.add(Node.createIntegerNode(4));
		nodes.add(Node.createIntegerNode(47));
		nodes.add(Node.createIntegerNode(7));
		nodes.add(Node.createIntegerNode(2));
		nodes.add(Node.createIntegerNode(3));
		nodes.add(Node.createIntegerNode(27));
		
		return nodes;
	}
	
	public static final List<Node> createInvalidNumberChain() {
		nodes = new ArrayList<>();
		nodes.add(Node.createIntegerNode(35));
		nodes.add(Node.createIntegerNode(5));
		nodes.add(Node.createIntegerNode(65));
		nodes.add(Node.createIntegerNode(6));
		nodes.add(Node.createIntegerNode(24));
		nodes.add(Node.createIntegerNode(4));
		
		return nodes;
	}
	
	public static final List<Node> createValidWordChain() {
		nodes = new ArrayList<>();
		nodes.add(Node.createLetterNode("p"));
		nodes.add(Node.createLetterNode("aba"));
		nodes.add(Node.createLetterNode("a"));
		nodes.add(Node.createLetterNode("b"));
		nodes.add(Node.createLetterNode("perso"));
		nodes.add(Node.createLetterNode("o"));
		nodes.add(Node.createLetterNode("r"));
		nodes.add(Node.createLetterNode("e"));
		nodes.add(Node.createLetterNode("s"));
		
		return nodes;
	}
	
	public static final List<Node> createInvalidWordChain() {
		nodes = new ArrayList<>();
		nodes.add(Node.createLetterNode("p"));
		nodes.add(Node.createLetterNode("aba"));
		nodes.add(Node.createLetterNode("a"));
		nodes.add(Node.createLetterNode("b"));
		nodes.add(Node.createLetterNode("perso"));
		nodes.add(Node.createLetterNode("o"));
		nodes.add(Node.createLetterNode("r"));
		nodes.add(Node.createLetterNode("e"));
		
		return nodes;
	}

}
