package gid_spring_boot_v2.aid_spring_boot_v2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/** Listo para usar por spring mvc para manejar peticiones web
* Combina las anotaciones @Controller y @ResponseBody que permiten devolver datos de peticiones web	
*/
@RestController
public class HelloController {
	
	/**
	 * Mapea "/" al método index()
	 */
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
