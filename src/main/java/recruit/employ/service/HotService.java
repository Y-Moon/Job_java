package recruit.employ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.employ.entity.HotCardEntity;
import recruit.employ.mapper.HotMapper;

/**
 * @author w
 */
@Service
public class HotService {
    @Autowired
    private HotMapper hotMapper;
    public HotCardEntity[] queryAll(){
        return hotMapper.queryAllHotCard();
    }
}
