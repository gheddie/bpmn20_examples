package de.gravitex.bpmn.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalculateExecutionTime implements JavaDelegate {

	public void execute(DelegateExecution arg0) throws Exception {
		System.out.println("CalculateExecutionTime...");
	}
}
