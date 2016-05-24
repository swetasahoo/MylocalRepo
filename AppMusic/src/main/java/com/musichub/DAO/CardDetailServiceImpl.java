package com.musichub.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musichub.model.CardDetail;



@Service
public class CardDetailServiceImpl implements CardDetailDao{

    @Autowired
    private CardDetailDao cardDetailDao;

    public void addCardDetail (CardDetail cardDetail) {
    	cardDetailDao.addCardDetail(cardDetail);
    }

 
}