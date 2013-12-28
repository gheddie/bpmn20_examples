package de.gravitex.bpmn.delegate;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DeliverPizza implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		BpmPlatform.getDefaultProcessEngine().getRuntimeService().correlateMessage(CollaborationMessages.DELIVER_PIZZA);
	}
}
