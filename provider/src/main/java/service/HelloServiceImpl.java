package service;

import org.springframework.stereotype.Service;

/**
 * @author wym
 * @create 2018-08-06 18:01
 **/
@Service
public class HelloServiceImpl implements service.HelloService {
    @Override
    public String saySync(String string) {
        return "provider tell you : this is your say: " +  string;
    }
}
