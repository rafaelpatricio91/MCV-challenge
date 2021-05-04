package service;

import java.util.List;

import entity.Node;
import exception.ChainValidatorException;

public class ChainValidator {
	
	public boolean validate(List<Node> nodes) {
		boolean isValid = false;
		try {
			isValid = validateByDependency(nodes);
		} catch (Exception e) {
			throw new ChainValidatorException("Error: validate - "+e.getMessage());
		}
		return isValid;
	}
	
	private boolean validateByDependency(List<Node> nodes) {
		boolean isValid = false;
		try {
			if (!nodes.isEmpty() && isUniqueNodeTypeList(nodes)) {
				isValid = true;
				for (Node node : nodes) {
					if (isNotUniqueValue(node)) {
						if(!multipleValueDependenciesAttended(nodes, node) ) {
							return false;
						}
					}
				}
			} 
		} catch (Exception e) {
			throw new ChainValidatorException("Error: validateByDependency - "+e.getCause());
		}
		return isValid;
	}

	private boolean multipleValueDependenciesAttended(List<Node> nodes, Node node) {
		boolean dependenciesFounded = true;
		try {
			char[] valueSplited = node.getFilledValue().toCharArray();
			for (Character itemToBeVerified : valueSplited) {
				boolean dependencyFound = nodes.stream().anyMatch(obj -> obj.getFilledValue().equals(itemToBeVerified.toString()) );
				if (!dependencyFound) {
					return false;
				}
			}
		} catch (Exception e) {
			throw new ChainValidatorException("Error: multipleValueDependenciesAttended - "+e.getCause());
		}
		return dependenciesFounded;
	}
	
	private boolean isUniqueNodeTypeList(List<Node> nodes) {
		boolean isUnique = true;
		try {
			boolean isLetterNodeFromFirstElement = nodes.get(0).isLetterNode();
			boolean isAnyNodeTypeDifferent = nodes.stream().anyMatch(obj -> obj.isLetterNode() != isLetterNodeFromFirstElement);
			
			isUnique = !isAnyNodeTypeDifferent;
		} catch (Exception e) {
			throw new ChainValidatorException("Error: isUniqueNodeTypeList - "+e.getCause());
		}
		return isUnique;
	}
	
	private boolean isNotUniqueValue(Node node) {
		return node.getFilledValue().length() > 1;
	}

}
