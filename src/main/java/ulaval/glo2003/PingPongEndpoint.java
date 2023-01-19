package ulaval.glo2003;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/ping")
public class PingPongEndpoint {
    @POST
    public Response pong(){
        return Response.ok("pong").build();
    }
}
