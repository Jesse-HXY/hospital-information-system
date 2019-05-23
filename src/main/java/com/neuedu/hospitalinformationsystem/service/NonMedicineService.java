package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.NonmedicineMapper;
import com.neuedu.hospitalinformationsystem.po.NonMedicine;

import java.util.List;

@Service
public class NonMedicineService {

    @Resource
    private NonmedicineMapper nonmedicineMapper;

    
    public boolean deleteByPrimaryKey(Integer nmid) {
         nonmedicineMapper.deleteByPrimaryKey(nmid);
         return true;
    }

    
    public boolean insert(NonMedicine record) {
         nonmedicineMapper.insert(record);
         return true;
    }


    
    public List<NonMedicine> findBynmIdAndnmName(NonMedicine nonMedicine) {
        return nonmedicineMapper.findBynmIdAndnmName(nonMedicine);
    }

}
