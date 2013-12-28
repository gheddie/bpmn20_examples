package de.gravitex.bpmn.delegate;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TriggerOrder implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		BpmPlatform.getDefaultProcessEngine().getRuntimeService().startProcessInstanceByMessage(CollaborationMessages.TRIGGER_ORDER);
	}
}
