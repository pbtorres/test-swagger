package testswagger.resources;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/hello")
public class helloResource {
	
	@GetMapping
	@Operation(summary = "Exemplo de operação GET")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello Swagger");
	}

}
