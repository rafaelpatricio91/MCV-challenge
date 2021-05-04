package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import entity.Node;
import factory.TestCasesListFactory;
import service.ChainValidator;

public class ChainValidatorTest {
	
	ChainValidator validator;
	
	List<Node> validNumberChain;
	List<Node> invalidNumberChain;
	List<Node> validWordChain;
	List<Node> invalidWordChain;
	
	@Before
	public void setUp() {
		validator = new ChainValidator();
		
		validNumberChain = new ArrayList<>();
		validNumberChain.addAll(TestCasesListFactory.createValidNumberChain());
		invalidNumberChain = new ArrayList<>();
		invalidNumberChain.addAll(TestCasesListFactory.createInvalidNumberChain());
		validWordChain = new ArrayList<>();
		validWordChain.addAll(TestCasesListFactory.createValidWordChain());
		invalidWordChain = new ArrayList<>();
		invalidWordChain.addAll(TestCasesListFactory.createInvalidWordChain());
	}
	
	@Test
	public void testValidateValidNumberChain() {
		assertTrue(validator.validate(validNumberChain)); 
	}
	
	@Test
	public void testValidateInvalidNumberChain() {
		assertFalse(validator.validate(invalidWordChain)); 
	}
	
	@Test
	public void testValidateValidWordChain() {
		assertTrue(validator.validate(validNumberChain)); 
	}
	
	@Test
	public void testValidateInvalidWordChain() {
		assertFalse(validator.validate(invalidWordChain)); 
	}
	
	
	

}
