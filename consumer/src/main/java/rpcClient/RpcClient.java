package rpcClient;

import api.UserService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;

/**
 * @author wym
 * @create 2018-08-07 10:16
 **/
public class RpcClient {

    @SofaReference(interfaceType = UserService.class)
    public UserService userService;
}
