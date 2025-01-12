package onlinebank.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="auths", url="http://localhost:8082", fallback = AuthServiceFallback.class)
public interface AuthService {
    @RequestMapping(method= RequestMethod.GET, path="/auths")
    public void requestAuth(@RequestBody Auth auth);

}

