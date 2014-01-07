package de.gravitex.bpmn.delegate;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import de.gravitex.bpmn.message.ChangeProcessMessages;

public class TriggerChangeDelegate implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		System.out.println(" ### Starting firm process... ### ");
		BpmPlatform.getDefaultProcessEngine().getRuntimeService().startProcessInstanceByMessage(ChangeProcessMessages.MESSAGE_TRIGGER_CHANGE);
	}
}
