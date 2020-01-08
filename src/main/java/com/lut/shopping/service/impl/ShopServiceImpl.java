package com.lut.shopping.service.impl;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.ShopResult;
import com.lut.shopping.mapper.CsMapper;
import com.lut.shopping.mapper.Ex.ShopEXMapper;
import com.lut.shopping.mapper.QuestionMapper;
import com.lut.shopping.mapper.ShopMapper;
import com.lut.shopping.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl  implements IShopService {
    @Autowired
    private ShopEXMapper shopEXMapper;
    @Autowired
    private ShopMapper shopMapper;
    @Autowired
    private CsMapper csMapper;
    @Autowired
    private QuestionMapper questionMapper;


    @Override
    public List<ShopResult> findAll() throws RuntimeException {
        ShopExample shopExample=new ShopExample();
        List<ShopResult>list=shopEXMapper.findAll();
        return list;
    }

    @Override
    public void addOrUpdate(Shop shop) throws RuntimeException {
        if(shop==null){
            throw new RuntimeException("参数为空");
        }
        if(shop.getId()==null){
            shopEXMapper.insert(shop);
        }else {
            shopEXMapper.updateByPrimaryKey(shop);
        }
    }


    @Override
    public void delete(int id) throws RuntimeException {
        CsExample csExample = new CsExample();
        csExample.createCriteria().andShopIdEqualTo(id);
        csMapper.deleteByExample(csExample);
        QuestionExample questionExample = new QuestionExample();
        questionExample.createCriteria().andShopIdEqualTo(id);
        questionMapper.deleteByExample(questionExample);
        shopEXMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delectBatch(int id) throws RuntimeException {
        CsExample csExample = new CsExample();
        csExample.createCriteria().andShopIdEqualTo(id);
        csMapper.deleteByExample(csExample);
        QuestionExample questionExample = new QuestionExample();
        questionExample.createCriteria().andShopIdEqualTo(id);
        questionMapper.deleteByExample(questionExample);
        shopEXMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<ShopResult> search(String key) throws RuntimeException {
        key=key==null?"":key;

        if(key==null && "".equals(key)){
         return findAll();
       }
       else {
            key="%"+key+"%";
            List<ShopResult> list = shopEXMapper.selectByPrimaryKey();
            return list;
        }
   }
}
