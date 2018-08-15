package service;

import api.UserService;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import dto.UserResutlDTO;

/**
 * @author wym
 * @create 2018-08-07 10:09
 **/
@SofaService(interfaceType = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public UserResutlDTO getUserInfo(Integer id, String name, Integer age) {
        UserResutlDTO userResutlDTO = new UserResutlDTO();
        userResutlDTO.setId(id);
        userResutlDTO.setName(name);
        userResutlDTO.setAge(age);
        return userResutlDTO;
    }
}
