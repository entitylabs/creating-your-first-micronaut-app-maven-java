package example.micronaut;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.client.exceptions.HttpClientResponseException;

@Controller("/hello") // <1>
public class HelloController {
    @Get // <2>
    @Produces(MediaType.TEXT_PLAIN) // <3>
    public HttpResponse<EmployeeDTO> index() {
    	
    	
    	EmployeeDTO emp = null;
    	try {
    		emp=null; // call the service here;
    		
    	}catch(MyNamedException exception) {
    		throw new HttpClientResponseException(exception.getMessage(), HttpResponse.unprocessableEntity());
    	}
    	
    	
        return HttpResponse.ok(emp);
    }
}