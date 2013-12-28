package de.gravitex.bpmn.delegate;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ErrorDelegate implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		System.out.println(" ### error delegate firing, provoking error ### ...");
		throw new BpmnError("just some bpmn error...");
	}
}
