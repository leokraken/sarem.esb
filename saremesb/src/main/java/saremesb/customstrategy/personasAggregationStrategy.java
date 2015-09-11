package saremesb.customstrategy;

import java.util.ArrayList;
import java.util.List;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.routing.AggregationContext;
import org.mule.api.routing.RouterResultsHandler;
import org.mule.routing.AggregationStrategy;
import org.mule.routing.DefaultRouterResultsHandler;

public class personasAggregationStrategy implements AggregationStrategy{
	private RouterResultsHandler resultsHandler = new DefaultRouterResultsHandler();

@Override
public MuleEvent aggregate(AggregationContext context) throws MuleException {
	List<MuleEvent> ev = new ArrayList<MuleEvent>();
	ev.add(context.collectEventsWithoutExceptions().get(0));
	
	return this.resultsHandler.aggregateResults(ev, context.getOriginalEvent(),context.getOriginalEvent().getMuleContext());

	//return DefaultMuleEvent.copy(context.collectEventsWithoutExceptions().get(0));
}


}
