package saremesb.transformers;

import java.io.StringWriter;

import generated.IdentifierDomain;
import generated.PersonIdentifier;

import javax.xml.bind.*;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class transformPersonIdentifier implements Callable {
    public Object onCall(MuleEventContext eventContext) throws Exception {
		//obtengo variables de flow
        String pacienteID = eventContext.getMessage().getProperty("personID", PropertyScope.INVOCATION);
        String paisID = eventContext.getMessage().getProperty("paisID", PropertyScope.INVOCATION);

		
		PersonIdentifier person = new PersonIdentifier();
		person.setIdentifier(paisID+"-"+pacienteID);
		IdentifierDomain iddomain = new IdentifierDomain();
		iddomain.setNamespaceIdentifier("NIST2010");
		iddomain.setUniversalIdentifier("2.16.840.1.113883.3.72.5.9.1");
		iddomain.setUniversalIdentifierTypeCode("ISO");
		person.setIdentifierDomain(iddomain);
		
		//marshal
		JAXBContext context = JAXBContext.newInstance(PersonIdentifier.class);
		StringWriter sw = new StringWriter();
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(person, sw);
		
		return sw.toString();
        //eventContext.getMessage().setInvocationProperty("myProperty", "Hello World!");
    }
}
