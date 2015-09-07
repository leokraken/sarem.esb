package saremesb.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import saremesb.datatypes.DataPerson;

@Path("/saremREST")
public interface saremREST {
	@GET
	public Response getPerson(@PathParam("DataPerson") DataPerson info);
}
