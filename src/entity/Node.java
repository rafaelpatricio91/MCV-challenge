package entity;

import java.io.Serializable;

public class Node implements Serializable {
	
	private static final long serialVersionUID = 4624335440816850976L;
	
	private Integer intValue;
	private String stringValue;
	
	private boolean letterNode = false;
	
	public Node() {}
	
	public Node(String stringValue, boolean letterNode) {
		this.stringValue = stringValue;
		this.letterNode = letterNode;
	}

	public Node(Integer intValue, boolean letterNode) {
		this.intValue = intValue;
		this.letterNode = letterNode;
	}

	public static Node createIntegerNode(Integer value) {
		return new Node(value, false);
	}
	
	public static Node createLetterNode(String value) {
		return new Node(value, true);
	}

	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public boolean isLetterNode() {
		return letterNode;
	}

	public void setLetterNode(boolean letterNode) {
		this.letterNode = letterNode;
	}
	
	public String getFilledValue() {
		if (letterNode) {
			return stringValue.toLowerCase();
		} else {
			return intValue.toString().toLowerCase();
		}
	}

	@Override
	public String toString() {
		return "Node [intValue=" + intValue + ", stringValue=" + stringValue + ", letterNode=" + letterNode + "]";
	}
}
