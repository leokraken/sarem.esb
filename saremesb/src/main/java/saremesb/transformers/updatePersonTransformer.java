package saremesb.transformers;

import generated.Person;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class updatePersonTransformer implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
        String pacienteID = eventContext.getMessage().getProperty("personID", PropertyScope.INVOCATION);
        String paisID = eventContext.getMessage().getProperty("paisID", PropertyScope.INVOCATION);
        Person person = (Person)eventContext.getMessage().getInvocationProperty("update");
        
		return null;
	}
}
